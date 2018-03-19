package com.example.Backend.controller;

import com.example.Backend.dao.UserDao;
import com.example.Backend.model.User;
import com.example.Backend.model.UserDto;
import com.example.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge = 5000)
public class UserController {

	
	
	
	@Autowired
    private UserService userService;
    
    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(){
    	System.out.println("ALL block");
        return userService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }
    
    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public User saveUser(@RequestBody UserDto user){
    	/*if(userService.findOne(user.getUsername())!=null){
    		return userService.findOne(user.getUsername());
    	}*/
        return userService.save(user);
    }
    
    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public void deleteOne(@PathVariable(value = "id") Long id){
        userService.delete(id);
    }
    
    public long id;
    
    @RequestMapping(value = "/user/update/{id}", method = RequestMethod.PUT)
    public void updateOne(@PathVariable(value="id") Long id,@RequestBody UserDto user){
    	System.out.println(id);
    	System.out.println("update block");
    	User updatedUser=userService.findById(id);
    	updatedUser.setName(user.getName());
    	updatedUser.setUsername(user.getUsername());
    	//updatedUser.setPassword(user.getPassword());
    	updatedUser.setEmail(user.getEmail());
    	updatedUser.setTel(user.getTel());
    	updatedUser.setGender(user.getGender());
    	updatedUser.setSpecialist(user.getSpecialist());
    	
    	userDao.save(updatedUser);
    }
}


