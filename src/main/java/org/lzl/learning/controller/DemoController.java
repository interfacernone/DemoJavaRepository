package org.lzl.learning.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.lzl.learning.constant.ErrorCode;
import org.lzl.learning.model.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "示例controller")
@RequestMapping("/demoController")
public class DemoController {

    @GetMapping("/demoMethod")
    @ApiOperation(value = "示例方法")
    public JsonResult demoMethod(){

        return new  JsonResult(false,"返回失败", ErrorCode.PASSWORD_WRONG);
    }

    @GetMapping("/exceptionMethod")
    @ApiOperation(value = "抛出异常方法")
    public JsonResult exceptionMethod(Long id){
        if(id<0){
            throw new RuntimeException("id cannot be negative");
        }
        return new  JsonResult(false,"返回失败", ErrorCode.PASSWORD_WRONG);
    }

}
