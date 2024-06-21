package com.spds.spds.dao;

import com.spds.spds.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface UserRepo extends JpaRepository<User,Integer> {
}
