package com.xx.self.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 * 一级菜单项
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
     * 菜单编码，用于排序
     */
    private String code;

    /**
     * 菜单链接的地址
     */
    private String url;

    /**
     * 菜单类型：
     * 1-单级菜单
     * 2-多级菜单
     */
    private int type;

    /**
     * 二级菜单
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private List<MenuItem> subMenuItemList;

    /**
     * 菜单状态：-1 删除 0 正常 1 禁用
     */
    private int status;


    @Column(name = "create_time")
    private Date createTime;


    public Menu() {
    }


    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int isType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
