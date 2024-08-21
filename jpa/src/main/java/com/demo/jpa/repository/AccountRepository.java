package com.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.Account;

public interface AccountRepository 
extends JpaRepository<Account,Integer>{

}
