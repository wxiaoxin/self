package com.xx.self.dao;

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
        menuItem1.setName("百度");
        menuItem1.setUrl("http://www.baidu.com");
        menuItem1.setCreateTime(new Date());

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setId(UUIDGenerator.randomUUID());
        menuItem2.setName("网易");
        menuItem2.setUrl("http://www.163.com");
        menuItem2.setCreateTime(new Date());

        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(menuItem1);
        menuItemList.add(menuItem2);


        // 一级菜单
        Menu menu = new Menu();
        menu.setId(UUIDGenerator.randomUUID());
        menu.setName("友情链接");
        menu.setHas(true);
        menu.setSubMenuItemList(menuItemList);
        menu.setCreateTime(new Date());


        menuItemDao.save(menuItem1);
        menuItemDao.save(menuItem2);

        menuDao.save(menu);

    }


    /**
     * 查询
     */
    @Test
    public void testGet() {
        String id = "34b12821b2e94059beeb7c1eb4d903aa";
        List<Menu> menuList = menuDao.get(id);
        System.err.println(menuList);
        System.out.println(menuList.get(0).getSubMenuItemList());
    }

}