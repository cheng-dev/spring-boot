package top.codeaworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiao
 * @date 2020/3/5 15:55
 */
@Controller
public class HelloWorldController {
    /**
     * //@RequestMapping 用来指定方法和请求质检的映射关系
     * //@ResponseBody 代表返回一个JSON格式的数组 而不是view层
     * @return 要返回的数据
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
