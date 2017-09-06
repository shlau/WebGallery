package com.sheldon.gallery.dao;

import com.sheldon.gallery.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
    User findByConfirmationToken(String confirmationToken);
}
