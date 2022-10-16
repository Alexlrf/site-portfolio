package br.com.alex.sitecurriculo.controller;

import br.com.alex.sitecurriculo.model.dto.LoginFormDto;
import br.com.alex.sitecurriculo.model.dto.TokenDto;
import br.com.alex.sitecurriculo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/sitecurriculo/auth")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    TokenService tokenService;

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Valid LoginFormDto loginForm){
        UsernamePasswordAuthenticationToken dadosLogin = loginForm.converter();
        try {
            Authentication authentication = authenticationManager.authenticate(dadosLogin);
            String token = tokenService.gerarToken(authentication);
            return ResponseEntity.ok(new TokenDto(token, "Bearer"));
        } catch (AuthenticationException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
