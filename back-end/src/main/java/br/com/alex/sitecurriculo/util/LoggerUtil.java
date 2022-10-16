package br.com.alex.sitecurriculo.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {

    private static final SimpleFormatter FORMATTER = new SimpleFormatter();

    public static void gravarMensagem(String msg){
        System.out.println(msg);

        Logger logger = Logger.getLogger("Log");
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("Logger.log", true);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(FORMATTER);
            logger.setLevel(Level.INFO);
            logger.info(msg);
            fileHandler.close();
        } catch (IOException | SecurityException e) {
            logger.info(e.getMessage());
        }
    }
}
