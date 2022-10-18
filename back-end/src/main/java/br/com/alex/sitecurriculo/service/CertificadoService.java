package br.com.alex.sitecurriculo.service;

import br.com.alex.sitecurriculo.util.LoggerUtil;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Service
public class CertificadoService {

    private Dotenv env = Dotenv.load();
    private String PATH_ROOT = env.get("PATH_ROOT");
    private String PATH_DIR = env.get("PATH_DIR");

    public void salvarArquivo(MultipartFile foto) {
        this.salvar(PATH_DIR, foto);
    }

    public void salvar(String diretorio, MultipartFile arquivo) {
        Path diretorioPath = Paths.get(PATH_ROOT, diretorio);
        Path arquivoPath = diretorioPath.resolve(Objects.requireNonNull(arquivo.getOriginalFilename()));

        try {
            Files.createDirectories(diretorioPath);
            arquivo.transferTo(arquivoPath.toFile());
        } catch (IOException e) {
            String mensagemErro = "Problemas na tentativa de salvar arquivo. ";
            LoggerUtil.gravarMensagem(mensagemErro + e.getMessage());
            throw new RuntimeException(mensagemErro, e);
        }
    }
}
