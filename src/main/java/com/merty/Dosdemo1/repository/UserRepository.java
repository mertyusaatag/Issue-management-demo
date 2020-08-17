package com.merty.Dosdemo1.repository;

import com.merty.Dosdemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
User findByUsername (String username);
}
