package com.enigmmm.userweb.repository;

import com.enigmmm.userweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
