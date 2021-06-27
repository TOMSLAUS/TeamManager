package com.example.TeamManager.TeamManager.service.impl;


import com.example.TeamManager.TeamManager.domain.User;
import com.example.TeamManager.TeamManager.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class UserDetailsServiceImpl implements UserDetailsService
        {
private UserRepository userRepository;
public UserDetailsServiceImpl(UserRepository userRepository)
        {
        this.userRepository = userRepository;
        }

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
        {
        User user = userRepository.findByUsername(username);
        if(user == null)
        {
        throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Collections.emptyList());
        }
        }

