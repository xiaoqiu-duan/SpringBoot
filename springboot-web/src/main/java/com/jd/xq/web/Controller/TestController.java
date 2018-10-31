package com.jd.xq.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.jd.xq.web.Controller
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/10/31
 * Time: 10:55
 * Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "test";
    }

}
