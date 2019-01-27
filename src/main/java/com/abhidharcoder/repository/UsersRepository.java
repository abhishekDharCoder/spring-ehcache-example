package com.abhidharcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhidharcoder.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
