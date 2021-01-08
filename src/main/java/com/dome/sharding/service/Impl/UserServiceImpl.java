package com.dome.sharding.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dome.sharding.entity.User;
import com.dome.sharding.mapper.UserMapper;
import com.dome.sharding.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hong-2000
 * @version 1.0.0
 * @description
 * @create 2020/12/16 17:26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }
}
