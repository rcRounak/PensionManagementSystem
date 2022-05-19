package com.project.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.authorization.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
