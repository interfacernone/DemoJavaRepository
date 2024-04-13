package org.lzl.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lzl.learning.model.DemoUser;

/**
 * 用户管理
 * */
public interface UserService extends IService<DemoUser> {
    /**
     * 获取用户
     * */
    DemoUser getUser(String userName);

    /**
     * 新增用户
     * */
    Boolean addUser(DemoUser demoUser);
}
