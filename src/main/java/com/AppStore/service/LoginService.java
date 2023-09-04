package com.AppStore.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AppStore.entity.Login;
import com.AppStore.repository.LoginRepository;



@Service
public class LoginService {
    
    @Autowired
    LoginRepository repo;
    public Login  login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
  
    

}