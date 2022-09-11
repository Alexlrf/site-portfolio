package br.com.alex.sitecurriculo.config;

import br.com.alex.sitecurriculo.model.dto.ErroValidacaoRequestDto;
import br.com.alex.sitecurriculo.model.dto.ResponseErroRequestDto;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ErroValidacaoRequestHandler {

    private final MessageSource messageSource;

    public ErroValidacaoRequestHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseErroRequestDto> handle(MethodArgumentNotValidException exception){

        List<Object> errosDto = new ArrayList<>();

        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        fieldErrors.forEach(e -> {
            String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            ErroValidacaoRequestDto erro = new ErroValidacaoRequestDto(e.getField(), mensagem);
            errosDto.add(erro);
        });
        return new ResponseEntity<>(new ResponseErroRequestDto(HttpStatus.BAD_REQUEST.name(), errosDto,
                HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<ResponseErroRequestDto> handleOrderNotFoundException(NoSuchElementException exception) {
        List<Object> lista = new ArrayList<>();
        String erro = new String("Busca não encontrou resultado");
        lista.add(erro);

        return new ResponseEntity<>(new ResponseErroRequestDto(HttpStatus.NOT_FOUND.name(), lista,
                HttpStatus.NOT_FOUND.value()), HttpStatus.NOT_FOUND);
    }
}
