package com.xx.self.dao;

import com.xx.self.base.BaseDao;
import com.xx.self.entity.MenuItem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/10/8.
 */

@Repository
public class MenuItemDao extends BaseDao {

    /**
     * 保存二级菜单项
     * @param menuItem
     */
    public void save(MenuItem menuItem) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(menuItem);
        transaction.commit();
        session.close();
    }

}
