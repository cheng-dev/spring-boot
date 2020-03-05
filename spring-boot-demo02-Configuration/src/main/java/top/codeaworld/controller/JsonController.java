package top.codeaworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.codeaworld.bean.Food;
import top.codeaworld.config.FoodConfig;

/**
 * @author xiao
 * @date 2020/3/5 16:33
 * //@RestCOntroller
 * 是@controller和@ResponseBody组合
 * 返回json形式的响应结果 而不是视图(jsp html)
 */
@RestController
public class JsonController {
//    @Value("${food.rice}")
//    String rice;
//    @Value("${food.meat}")
//    String meat;
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("json")
    public Food json(){
        Food food = new Food();
//        food.setMeat(rice);
//        food.setRice(meat);

        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
