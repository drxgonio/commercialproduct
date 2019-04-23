package com.spring.authentication;

import java.util.ArrayList;
import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.dao.IRoleUser;
import com.spring.dao.IUserDao;
import com.spring.entity.RoleUser;
 
@Service
public class MyDBAuthenticationService implements UserDetailsService {
 
    @Autowired
    private IUserDao userDAO;

    @Autowired
    private IRoleUser roleUser;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.spring.entity.User user = userDAO.getByName(username);
        System.out.println("UserInfo= " + user);
 
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        // [USER,ADMIN,..]
        //lấy role của thèn User đăng nhập
        RoleUser role= roleUser.getUserRoles(username);
          
        List<GrantedAuthority> grantList= new ArrayList<GrantedAuthority>();
        if(role!= null)  {
                GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role.getNameRole());
                grantList.add(authority);
        }        
         
        UserDetails userDetails = (UserDetails) new User(user.getUsername(), //
                user.getPassword(),grantList);
 
        return userDetails;
    }
     
}