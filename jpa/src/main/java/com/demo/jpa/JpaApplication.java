package com.demo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.jpa.repository.AccountRepository;
import com.demo.jpa.repository.LoanRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner{
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	LoanRepository loanRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("main method is called");
		Loan loan=new Loan();
		loan.setLoanAmount(767767);
		loan.setLoanName("Personal Loan");
		
		Account account=new Account();
		account.setBalance(45455);
		account.setEmail("rajesh.kit@gmail.com");
		account.setName("Rajesh");
		// account.setLoan(loan);
		// loan.setAccount(account);
	
		accountRepository.save(account);
		
		
	}

}
