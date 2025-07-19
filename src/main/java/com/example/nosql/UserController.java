package com.example.nosql;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.getUsers();
    }

    @GetMapping("{id}")
    public User findById(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PatchMapping
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
