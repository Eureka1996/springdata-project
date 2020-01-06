package com.wufuqiang.springdatajpa;

import com.wufuqiang.springdatajpa.dao.UserDAO;
import com.wufuqiang.springdatajpa.entries.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdataJpaApplicationTests {

    @Autowired
    private UserDAO userDAO;
    @Test
    void contextLoads() {
        System.out.println("wufuqiang");
    }

    @Test
    public void testUserDAO(){
//        User user = new User();
//        user.setId(1L);
//        user.setName("风清扬");
//        user.setAccount("fengqy");
//        user.setPwd("123456");
//        userDAO.save(user);
        userDAO.updatePwdById(1L,"123456wfqhhhhhhhhhhh");
    }

}
