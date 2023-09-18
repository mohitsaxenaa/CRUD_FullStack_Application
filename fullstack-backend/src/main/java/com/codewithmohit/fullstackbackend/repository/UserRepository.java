package com.codewithmohit.fullstackbackend.repository;

import com.codewithmohit.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
