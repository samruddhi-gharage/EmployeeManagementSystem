package com.empmgtfb.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empmgtfb.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}