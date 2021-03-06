package com.xx.self.dao;

import com.xx.self.dao.impl.UserDao;
import com.xx.self.entity.User;
import com.xx.self.util.UUIDGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wxiao on 2016.9.19.
 *
 * UserDao测试类
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave() {
        User user = new User();
        user.setId(UUIDGenerator.randomUUID());
        user.setName("zhangsan");
        user.setPwd("123456");
        user.setStatus(0);
        user.setCreateTime(new Date());
        int result = userDao.save(user);
        System.out.println(result);
    }


    @Test
    public void testDel() {
        User user = new User();
        user.setId("3080e6b2ef6741daac217e147db880ca");
        int result = userDao.del(user);
        System.out.println(result);
    }


    @Test
    public void testUpdate() {
        User user = new User();
        user.setId("e8324b99-b6b3-47a0-b758-b2ef613ed148");
        user.setName("aa");
        user.setPwd("aa");
        user.setStatus(1);
        int result = userDao.update(user);
        System.out.println(result);
    }


    @Test
    public void testCount() {
        int count = userDao.count();
        System.out.println("记录总数：" + count);
    }


    @Test
    public void testGet() {
        String id = "3080e6b2ef6741daac217e147db880ca";
        User user = userDao.get(id);
        System.out.println(user);
    }


    @Test
    public void testGet2() {
        String id = "3080e6b2ef6741daac217e147db880ca";
        User user = userDao.get2(id);
        System.out.println(user);
    }


    @Test
    public void testGetNameById() {
        String id = "3080e6b2ef6741daac217e147db880ca";
        String name = userDao.getNameById(id);
        System.out.println(name);
    }


    @Test
    public void testListByStatus() {
        List<User> users = userDao.listByStatus(0);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testListNamesByStatus() {
        List<String> nameList = userDao.listNamesByStatus(0);
        System.out.println(nameList);
    }


}