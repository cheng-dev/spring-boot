package top.codeaworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * 其他类要放在同包下或子包
 * @author xiao
 * @date 2020/3/5 13:29
 */
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        //使用SpringApplication类静态类方法 启动SpringBoot程序
        //方法的参数 程序的入口类 main函数
        SpringApplication.run(ApplicationStart.class,args);
    }

}
