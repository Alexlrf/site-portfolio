package br.com.alex.sitecurriculo.model.dto;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ResponseErroRequestDto {

    private String title;
    private List<Object> message;
    private int status;
    private String timestamp = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a z Z"));

    public ResponseErroRequestDto(String title, List<Object> message, int status) {
        this.title = title;
        this.message = message;
        this.status = status;
    }

    public ResponseErroRequestDto() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Object> getMessage() {
        return message;
    }

    public void setMessage(List<Object> message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
