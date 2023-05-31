package com.morris.springbootmall.service;

import com.morris.springbootmall.dto.UserLoginRequest;
import com.morris.springbootmall.dto.UserRegisterRequest;
import com.morris.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
