package com.xx.self.controller.system;

import com.alibaba.fastjson.JSONObject;
import com.xx.self.base.BaseController;
import com.xx.self.dao.IMenuDao;
import com.xx.self.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/10/10.
 *
 * 系统菜单控制器
 *
 */

@Controller
@RequestMapping("/system/menu")
@Scope("prototype")
public class MenuController extends BaseController {


    @Autowired
    private IMenuDao menuDao;


    @RequestMapping("/index")
    public HashMap index() {
        HashMap map = new HashMap();
        return map;
    }

    /**
     * 获取所有一级菜单项
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        List<Menu> menuList = menuDao.all();
        String result = JSONObject.toJSONString(menuList);
        logger.debug(result);
        return result;
    }

}
