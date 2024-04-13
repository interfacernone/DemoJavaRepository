package org.lzl.learning.controller;


import cn.hutool.core.util.ObjectUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.lzl.learning.constant.ErrorCode;
import org.lzl.learning.model.DemoUser;
import org.lzl.learning.model.JsonResult;
import org.lzl.learning.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "用户controller")
@RequestMapping("/UserController")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/getUser")
    @ApiOperation(value = "获取用户")
    public JsonResult getUser(@RequestParam String userName) {
        DemoUser demoUser = userService.getUser(userName);
        if (ObjectUtil.isNotEmpty(demoUser)) {
            return new JsonResult(true, "登录成功", demoUser);
        }
        return new JsonResult(false, "返回失败", ErrorCode.PASSWORD_WRONG);
    }

    @PostMapping("/addUser")
    @ApiOperation(value = "增加用户")
    public JsonResult addUser(@RequestBody DemoUser demoUser) {
        Boolean insertFlag = userService.addUser(demoUser);
        if (ObjectUtil.isNotEmpty(demoUser)) {
            return new JsonResult(true, "新增成功", demoUser);
        }
        return new JsonResult(false, "返回失败", ErrorCode.PASSWORD_WRONG);
    }
}
