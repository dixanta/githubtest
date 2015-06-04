/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.loginexample.dao.impl;

import com.loginexample.dao.UserDAO;
import com.loginexample.entity.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author forsell
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public List<User> getAll() {
        List<User> userList=new ArrayList<User>();
        userList.add(new User(1, "admin", "admin"));
        userList.add(new User(2,"dixanta","admin"));
        userList.add(new User(3,"dix","admin"));
        return userList;
        
    }

    @Override
    public User authenticate(String username, String password) {
        User u=null;
        for(User user:getAll()){
            if(user.getUserName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)){
                u=user;
                break;
            }
        }
        return u;
    }

}
