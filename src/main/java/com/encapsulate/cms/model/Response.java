package com.encapsulate.cms.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private String status;
    private Object data;
    private String message;

    public static Response generateResponse(String status, Object data, String message) {
        return Response.builder()
                .status(status)
                .data(data)
                .message(message)
                .build();
    }
}
