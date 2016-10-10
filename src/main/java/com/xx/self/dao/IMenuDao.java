package com.xx.self.dao;

import com.xx.self.entity.Menu;

import java.util.List;

/**
 * Created by Administrator on 2016/10/10.
 *
 * 一级菜单的操作接口
 *
 */

public interface IMenuDao {

    /**
     * 保存一级菜单
     * @param menu
     */
    void save(Menu menu);


    /**
     * 删除一级菜单
     * @param id 将要被删除一级菜单的id
     * @return 操作结果，1-删除成功 0-删除失败
     */
    int del(String id);


    /**
     * 更新一级菜单项
     * @param menu 需要更新的一级菜单项
     * @return 更新结果：1-更新成功 0-更新失败
     */
    int update(Menu menu);

    /**
     * 获取一级菜单
     * @param id 一级菜单id
     * @return 一级菜单
     */
    Menu get(String id);


    /**
     * 获取所有一级菜单项
     * @return 所有一级菜单的集合
     */
    List<Menu> all();

}
