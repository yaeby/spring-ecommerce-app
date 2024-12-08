package com.c8a.dream_shops.service.user;

import com.c8a.dream_shops.dto.UserDto;
import com.c8a.dream_shops.request.CreateUserRequest;
import com.c8a.dream_shops.request.UserUpdateRequest;
import com.c8a.dream_shops.model.User;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}
