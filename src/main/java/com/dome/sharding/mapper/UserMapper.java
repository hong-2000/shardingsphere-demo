package com.dome.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dome.sharding.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hong-2000
 * @version 1.0.0
 * @description
 * @create 2020/12/16 17:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
