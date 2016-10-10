package com.xx.self.base;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2016/9/20.
 *
 * 对JdbcTemplate NamedParameterJdbcTemplate封装
 *
 */

public class BaseDao {

    @Autowired
    protected JdbcTemplate jt;

    @Autowired
    protected NamedParameterJdbcTemplate nJt;

    @Autowired
    protected SessionFactory sessionFactory;

}
