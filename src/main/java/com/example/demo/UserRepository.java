package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    // check duplicate email
    UserDetails findByEmail(String email);

    // login query
    @Query(value = "SELECT * FROM register WHERE uname = :uname AND password = :password", nativeQuery = true)
    UserDetails login(@Param("uname") String uname, @Param("password") String password);
}
