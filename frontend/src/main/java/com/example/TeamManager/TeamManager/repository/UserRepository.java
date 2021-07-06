package com.example.TeamManager.TeamManager.repository;

import com.example.TeamManager.TeamManager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User save(User user);
    User findByUsername(String username);
}
