package com.example.kotlinsample.app.controller

import com.example.kotlinsample.domain.entity.User
import com.example.kotlinsample.domain.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    // 全件取得
    @GetMapping("users")
    fun getUserList(): List<User> {
        return userService.getUserList()
    }

    // 1件取得
    @CrossOrigin
    @GetMapping("user/{id}")
    fun getUserById(@PathVariable("id") id: Int?): User {
        return userService.getUserById(id)
    }

    // 1件作成
    @PostMapping("/user")
    fun createUserById(@RequestBody user: User): List<User> {
        return userService.getInsertUser(user)
    }

    // 1件編集
    @CrossOrigin
    @PutMapping("/user/{id}")
    fun updateUserById(@PathVariable("id") id: Int, @RequestBody user: User): User {
        return userService.getUpdateUser(id, user)
    }

    // 1件削除
    @DeleteMapping("/user/{id}")
    fun deleteUserById(@PathVariable("id") id: Int?): User {
        return userService.getDeleteUserById(id)
    }
}