package com.UserManagementSystem.controller;

import com.UserManagementSystem.model.UserManagementModel;
import com.UserManagementSystem.service.UserManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userapp")
public class UserController {
    private final UserManagementService userManagementService;
    public UserController(UserManagementService userManagementService){ this.userManagementService=userManagementService;}

    @PostMapping("/adduser")
    public void adduser(@RequestBody UserManagementModel userManagementModel){
        userManagementService.addUser(userManagementModel);
    }

    @GetMapping("/finduser/number/{number}")
        public UserManagementModel getUser(@PathVariable int number){
            return userManagementService.getUser(number);
        }

    @GetMapping("/getalluser")
    public List<UserManagementModel> getAllUser(){
        return userManagementService.getAllUser();
    }
    @PutMapping("/updateuser/number/{number}")
    public void updateuser(@PathVariable int number,@RequestBody UserManagementModel userManagementModel){
        userManagementService.updateUserInfo(number,userManagementModel);
    }

    @DeleteMapping("/deleteuser/number/{number}")
    public void deleteuser(@PathVariable int number){
        userManagementService.deleteUser(number);
    }
}
