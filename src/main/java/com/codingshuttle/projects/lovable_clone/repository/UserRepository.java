package com.codingshuttle.projects.lovable_clone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codingshuttle.projects.lovable_clone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByEmail(String email);
    Optional<User> findByName(String userName);
}
