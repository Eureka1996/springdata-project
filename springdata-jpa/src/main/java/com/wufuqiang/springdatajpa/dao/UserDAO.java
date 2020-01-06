package com.wufuqiang.springdatajpa.dao;

import com.wufuqiang.springdatajpa.entries.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

//@Repository
@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    @Modifying
    @Transactional
    @Query("update User u set u.pwd = ?2 where u.id = ?1")
    int updatePwdById(Long id, String pwd);
}
