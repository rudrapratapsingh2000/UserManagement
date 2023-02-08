package com.UserManagementSystem.service;

import com.UserManagementSystem.model.UserManagementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserManagementService {
    private static List<UserManagementModel> users = new ArrayList<>();
static {
    users.add(new UserManagementModel(1001,"Rudra","rudra1001","Lucknow","1234567890"));
    users.add(new UserManagementModel(1002,"Mahesh","mahesh1002","Noida","1123456789"));
    users.add(new UserManagementModel(1003,"Sanjay","sanjay1003","Bangloare","456585558"));
    users.add(new UserManagementModel(1004,"Prashant","prashant1004","Delhi","1234567890"));
    users.add(new UserManagementModel(1005,"Ajay","ajay1005","Pune","1234567890"));
}
    /*
    addUser
getUser/{userid}
getAllUser
updateUserInfo
deleteUser
     */
    public void addUser(UserManagementModel user){
        users.add(user);
    }


    public UserManagementModel getUser( int number){
        Predicate<? super UserManagementModel> predicate = user -> user.getUser_id()==number;
        UserManagementModel user=users.stream().filter(predicate).findFirst().get();
        return user;
    }

    public List<UserManagementModel> getAllUser(){ return users; }

    public void deleteUser(int number){
        Predicate<? super UserManagementModel> predicate=user ->user.getUser_id()==number;
        users.removeIf(predicate);
    }

    //Update Restaurant Information
    public void updateUserInfo(int number, UserManagementModel newuser){
        UserManagementModel user=getUser(number);
        user.setName(newuser.getName());
        user.setUser_name(newuser.getUser_name());
        user.setAddress(newuser.getAddress());
        user.setPhone_number(newuser.getPhone_number());

    }
}
