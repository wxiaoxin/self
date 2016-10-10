package com.xx.self.dao.impl;

import com.xx.self.base.BaseDao;
import com.xx.self.dao.IMenuItemDao;
import com.xx.self.entity.MenuItem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/10/8.
 * 二级菜单操作类的实现类
 */

@Repository
public class MenuItemDao extends BaseDao implements IMenuItemDao {

    @Override
    public void save(MenuItem menuItem) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(menuItem);
        transaction.commit();
        session.close();
    }

    @Override
    public int del(String id) {
        return 0;
    }

    @Override
    public int update(MenuItem menuItem) {
        return 0;
    }

    @Override
    public MenuItem get(String id) {
        return null;
    }

}
