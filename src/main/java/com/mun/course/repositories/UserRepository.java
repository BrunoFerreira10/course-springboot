package com.mun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mun.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
