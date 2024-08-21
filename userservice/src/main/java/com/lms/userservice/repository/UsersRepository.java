package com.lms.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.userservice.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{

}
