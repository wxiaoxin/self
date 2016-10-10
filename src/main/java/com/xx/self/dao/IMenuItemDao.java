package com.xx.self.dao;

import com.xx.self.entity.MenuItem;

/**
 * Created by Administrator on 2016/10/10.
 * 二级菜单操作接口
 */

public interface IMenuItemDao {

    /**
     * 保存二级菜单项
     *
     * @param menuItem 二级菜单项
     */
    void save(MenuItem menuItem);

    /**
     * 删除二级菜单项
     *
     * @param id 二级菜单项的主键id
     * @return 删除操作结果
     */
    int del(String id);

    /**
     * 更新二级菜单
     *
     * @param menuItem 将要更新的二级菜单项
     * @return 更新操作结果
     */
    int update(MenuItem menuItem);

    /**
     * 获取二级菜单项
     * @param id 二级菜单项的主键id
     * @return 二级菜单 null表示没有查询到指定的二级菜单
     */
    MenuItem get(String id);

}
