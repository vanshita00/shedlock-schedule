package com.vanshita.spring_boot_scheduler.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vanshita.spring_boot_scheduler.model.User;
public interface UserDao extends JpaRepository<User, Integer>{

}
