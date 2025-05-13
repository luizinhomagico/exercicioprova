package br.com.unicuritiba.exercicioprova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.exercicioprova.models.User;

public interface UserRepository 
	extends JpaRepository<User, Long>{
}
