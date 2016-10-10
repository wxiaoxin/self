package com.xx.self.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/8.
 * <p/>
 * 二级菜单
 */

@Entity
@Table(name = "t_menu_item")
public class MenuItem {

    /**
     * 主键
     */
    @Id
    @Column(length = 32)
    private String id;

    /**
     * 二级菜单名称
     */
    private String name;

    /**
     * 菜单编码，用于排序
     */
    private String code;

    /**
     * 菜单的链接地址
     */
    private String url;

    /**
     * 菜单状态：-1-删除 0-正常 1-禁用
     */
    private int status;

    @Column(name = "create_time")
    private Date createTime;

    public MenuItem() {
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
