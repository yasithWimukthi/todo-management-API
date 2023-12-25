package com.alphacoder.todomanager.service;

import com.alphacoder.todomanager.dto.LoginDto;
import com.alphacoder.todomanager.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}