package org.lzl.learning.globalexceptionhandler;

import org.lzl.learning.model.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public JsonResult exceptionHandler(Exception e){

        return new JsonResult(false,e.getMessage());
    }
}
