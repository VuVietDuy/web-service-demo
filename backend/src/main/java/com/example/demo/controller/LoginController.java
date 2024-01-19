package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {
    private UserService service;

    public LoginController(UserService userService) {
        this.service = userService;
    }

    @PostMapping("")
    public ResponseEntity<String> updateStudentById(@RequestBody User user) {
        User existingUser = service.findUserByUsername(user.getUsername());
        System.out.println(user);

        if (existingUser == null) {
            return new ResponseEntity<>("User does not exist", HttpStatus.NOT_FOUND);
        }

        if (existingUser.getPassword().equals(user.getPassword())) {
            // Xác thực thành công, thực hiện cập nhật thông tin sinh viên ở đây nếu cần
            // service.updateStudent(existingStudent);

            return new ResponseEntity<>("User entity updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Wrong password", HttpStatus.UNAUTHORIZED);
        }
    }
}