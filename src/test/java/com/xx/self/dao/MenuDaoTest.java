package com.xx.self.dao;

import com.alibaba.fastjson.JSONObject;
import com.xx.self.dao.impl.MenuDao;
import com.xx.self.dao.impl.MenuItemDao;
import com.xx.self.entity.Menu;
import com.xx.self.entity.MenuItem;
import com.xx.self.util.UUIDGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuDaoTest {


    @Autowired
    private MenuDao menuDao;

    @Autowired
    private MenuItemDao menuItemDao;

    @Test
    public void testSave() throws Exception {

        // 二级菜单
        MenuItem menuItem1 = new MenuItem();
        menuItem1.setId(UUIDGenerator.randomUUID());
        menuItem1.setName("菜单");
        menuItem1.setCode("2005");
        menuItem1.setUrl("http://www.baidu.com");
        menuItem1.setCreateTime(new Date());

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setId(UUIDGenerator.randomUUID());
        menuItem2.setName("用户");
        menuItem2.setCode("2010");
        menuItem2.setUrl("http://www.163.com");
        menuItem2.setCreateTime(new Date());

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setId(UUIDGenerator.randomUUID());
        menuItem3.setName("字典");
        menuItem3.setCode("2015");
        menuItem3.setUrl("http://www.dict.com");
        menuItem3.setCreateTime(new Date());

        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(menuItem1);
        menuItemList.add(menuItem2);
        menuItemList.add(menuItem3);


        // 一级菜单
        Menu menu = new Menu();
        menu.setId(UUIDGenerator.randomUUID());
        menu.setName("首页");
        menu.setCode("2");
        menu.setType(1);
//        menu.setSubMenuItemList(menuItemList);
        menu.setUrl("http://www.index.com");
        menu.setCreateTime(new Date());


//        menuItemDao.save(menuItem1);
//        menuItemDao.save(menuItem2);
//        menuItemDao.save(menuItem3);

        menuDao.save(menu);

    }


    /**
     * 查询
     */
    @Test
    public void testGet() {
        String id = "e8cd79b7948f46568e8b84667a2637b4";
        Menu menu = menuDao.get(id);
        System.err.println(JSONObject.toJSON(menu));
    }


    @Test
    public void testAll() {
        List<Menu> menuList = menuDao.all();
        System.err.println(menuList);
    }

}