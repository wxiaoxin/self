package com.xx.self.dao.impl;

import com.xx.self.base.BaseDao;
import com.xx.self.dao.IMenuDao;
import com.xx.self.entity.Menu;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 *
 * 一级菜单实体操作类
 *
 */

@Repository
public class MenuDao extends BaseDao implements IMenuDao {


    @Override
    public void save(Menu menu) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(menu);
        transaction.commit();
        session.close();
    }

    @Override
    public int del(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "delete from com.xx.self.entity.Menu where id = ? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        int row = query.executeUpdate();
        transaction.commit();
        session.close();
        return row;
    }

    @Override
    public int update(Menu menu) {
        return 0;
    }

    @Override
    public Menu get(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = " from com.xx.self.entity.Menu where id=? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        Menu menu = (Menu) query.uniqueResult();
        transaction.commit();
        session.close();
        return menu;
    }

    @Override
    public List<Menu> all() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = " from com.xx.self.entity.Menu ";
        Query query = session.createQuery(hql);
        List<Menu> menuList = query.list();
        transaction.commit();
        session.close();
        return menuList;
    }


}
