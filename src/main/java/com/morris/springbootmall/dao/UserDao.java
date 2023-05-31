package com.morris.springbootmall.dao;

import com.morris.springbootmall.dto.UserRegisterRequest;
import com.morris.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
