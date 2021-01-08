package com.dome.sharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dome.sharding.entity.User;

import java.util.List;

/**
 * @author hong-2000
 * @version 1.0.0
 * @description
 * @create 2020/12/16 17:25
 */
public interface UserService extends IService<User> {

    /**
     * 保存用户信息
     *
     * @param entity
     * @return
     */
    @Override
    boolean save(User entity);

    /**
     * 查询全部用户信息
     *
     * @return
     */
    List<User> getUserList();
}
