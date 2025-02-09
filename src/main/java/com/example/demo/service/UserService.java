package com.example.demo.service;

import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final List<User> users = Arrays.asList(new User(1L, "Arthur", "adsfas"));

    public String getUserName(long id) {
        return users.stream().
                filter(user1 -> user1.getId() == id)
                .findFirst()
                .orElseGet(() -> null)
                .getName();
    }
}
