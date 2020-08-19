package com.prottonne.eureka.server.exception;

import com.prottonne.eureka.server.dto.Response;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String serviceId = "eureka-server";

    @Value("${eureka.error.general}")
    private String eurekaErrorGeneral;

    public GeneralExceptionHandler() {
        super();
    }

    @ExceptionHandler(value = Throwable.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Response defaultError(Throwable ex, HttpServletRequest req) {

        logger.error("SERVICE-ID={};CODE={};MESSAGE={};ERROR={}", serviceId,
                eurekaErrorGeneral, "eureka server general error", ex);

        return new Response(eurekaErrorGeneral);
    }

}
