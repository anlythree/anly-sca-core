package com.anlythree.anlymysql.business.user.controller;

import com.anlythree.anlymysql.business.user.entity.UserDO;
import com.anlythree.anlymysql.business.user.param.GetUserListParam;
import com.anlythree.anlymysql.business.user.service.UserService;
import com.anlythree.common.api.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用于压测连接池的demo接口
 * @DATE: 2023/7/19
 * @USER: anlythree
 */
@RestController
@RequestMapping(value = "/pressureTest", method = RequestMethod.POST)
public class DemoController {

    @Resource
    private UserService userService;

    @PostMapping("/getUserList")
    @ResponseBody
    public Result<List<UserDO>> getUserList(@RequestBody GetUserListParam param){
        return Result.data(userService.getUserList(param));
    }
}
