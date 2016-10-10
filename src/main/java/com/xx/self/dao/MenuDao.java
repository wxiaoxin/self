package com.xx.self.dao;

import com.xx.self.base.BaseDao;
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
public class MenuDao extends BaseDao {


    public void save(Menu menu) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(menu);
        transaction.commit();
        session.close();
    }

    /**
     * 获取菜单
     * @param id
     * @return
     */
    public List<Menu> get(String id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = " from com.xx.self.entity.Menu where id=? ";
        Query query = session.createQuery(hql);
        query.setString(0, id);
        List<Menu> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }


}
