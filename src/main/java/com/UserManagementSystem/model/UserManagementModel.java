package com.UserManagementSystem.model;

public class UserManagementModel {
    private int user_id;
    private String name;
    private String user_name;
    private  String address;
    private String phone_number;

    public UserManagementModel() {
    }

    public UserManagementModel(int user_id, String name, String user_name, String address, String phone_number) {
        this.user_id = user_id;
        this.name = name;
        this.user_name = user_name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "UserManagementModel{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
