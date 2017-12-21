package com.example.demo.repository;

import com.example.demo.bean.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TblUser, Integer> {
}
