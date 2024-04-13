package org.lzl.learning.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lzl.learning.mapper.UserMapper;
import org.lzl.learning.model.DemoUser;
import org.lzl.learning.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户管理
 *
 * @author liuziling
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, DemoUser> implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public DemoUser getUser(String userName) {
        LambdaQueryWrapper<DemoUser> userWrapper = new LambdaQueryWrapper<>();
        userWrapper.eq(DemoUser::getUserName, userName);
        return this.getOne(userWrapper);
    }

    @Override
    public Boolean addUser(DemoUser demoUser) {
        int result = userMapper.insert(demoUser);
        if (ObjectUtil.equals(1, result)) {
            return true;
        }
        return false;
    }
}
