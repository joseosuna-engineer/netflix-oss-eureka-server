package com.prottonne.eureka.server.dto;

public class Response {

    private String data;

    public Response() {
        super();
    }

    public Response(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" + "data=" + data + '}';
    }

}
