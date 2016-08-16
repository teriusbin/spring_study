package com.netmarble.springstudy.controller;

import com.netmarble.springstudy.constant.ResultStatus;
import com.netmarble.springstudy.domain.Response;
import com.netmarble.springstudy.exception.BoardException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by mydus on 2016-08-17.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(BoardException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response exceptionHandler(BoardException e){
        return new Response(e.getResultStatus());
    }
}
