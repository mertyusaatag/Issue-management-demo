package com.merty.Dosdemo1.service;

import com.merty.Dosdemo1.entity.Issue;
import com.merty.Dosdemo1.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save(User user);
    User getById(Long id);
    Page<User> getAllPageable(Pageable pageable);
    User getByUsername(String username);


}
