package com.xx.self.base;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/10/10.
 * 父控制器，配置一些基础操作
 */

public class BaseController {

    protected HttpServletRequest req;

    protected HttpServletResponse resp;

    protected Logger logger = Logger.getLogger(this.getClass());

    @ModelAttribute
    protected void setReqAndResp(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }


}
