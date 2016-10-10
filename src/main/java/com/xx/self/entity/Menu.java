package com.xx.self.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 *
 * 一级菜单项
 *
 */

@Entity
@Table(name = "t_menu")
public class Menu {

    @Id
    @Column(length = 32)
    private String id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单链接的地址
     */
    private String url;

    /**
     * 是否是一级菜单
     */
    private boolean has;

    /**
     * 二级菜单
     */
    @OneToMany
    @JoinColumn(name = "menu_id")
    private List<MenuItem> subMenuItemList;

    /**
     * 菜单状态：-1 删除 0 正常 1 禁用
     */
    private int status;


    @Column(name = "create_time")
    private Date createTime;


    public Menu() {}


    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHas() {
        return has;
    }

    public void setHas(boolean has) {
        this.has = has;
    }

    public List<MenuItem> getSubMenuItemList() {
        return subMenuItemList;
    }

    public void setSubMenuItemList(List<MenuItem> subMenuItemList) {
        this.subMenuItemList = subMenuItemList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
