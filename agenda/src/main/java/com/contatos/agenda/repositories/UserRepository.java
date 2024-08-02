package com.contatos.agenda.repositories;

import com.contatos.agenda.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
