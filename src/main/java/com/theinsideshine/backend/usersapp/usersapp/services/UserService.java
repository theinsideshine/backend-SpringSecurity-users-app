package com.theinsideshine.backend.usersapp.usersapp.services;

import java.util.List;
import java.util.Optional;

import com.theinsideshine.backend.usersapp.usersapp.models.dto.UserDto;
import com.theinsideshine.backend.usersapp.usersapp.models.entities.User;
import com.theinsideshine.backend.usersapp.usersapp.models.request.UserRequest;

public interface UserService {
    
    List<UserDto> findAll();

    Optional<UserDto> findById(Long id);

    UserDto save(User user);
    Optional<UserDto> update(UserRequest user, Long id);

    void remove(Long id);
}
