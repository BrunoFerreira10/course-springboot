package com.mun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mun.course.entities.User;

@Repository // Optional, because JpaRepository already use the Repository annotation
public interface UserRepository extends JpaRepository<User, Long>{

}
