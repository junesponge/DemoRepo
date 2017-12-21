package com.example.demo.controller;

import com.example.demo.bean.TblUser;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String say(){
        return "world.";
    }

    @RequestMapping(value = {"/findAll"}, method = RequestMethod.GET)
    public List<TblUser> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public TblUser addUser(@RequestParam("name") String name, @RequestParam("age") int age) {
        TblUser user = new TblUser();
        user.setName(name);
        user.setAge(age);
        return userRepository.save(user);
    }
}
