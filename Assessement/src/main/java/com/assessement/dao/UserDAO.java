package com.assessement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assessement.model.User;

public interface UserDAO extends JpaRepository<User, Long>{

}
