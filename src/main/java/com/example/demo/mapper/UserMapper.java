package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;

import java.util.List;

/**
 * @Title: ideaGitTest
 * @Description:
 * @Author: tuzhili
 * @Date: 2018/4/17 13:55
 * @Version:1.1.0
 * @Copyright:Copyright (c) 浙江蘑菇加电子商务有限公司 2017 ~ 2018 版权所有
 */
public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
