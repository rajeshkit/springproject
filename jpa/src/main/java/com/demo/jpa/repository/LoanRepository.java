package com.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.Loan;

public interface LoanRepository extends JpaRepository<Loan,Integer>{

}
