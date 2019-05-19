package com.jing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName:SpringConfiguration
 * @Description TODO 配置注解类代替xml
 * @author:RanMoAnRan
 * @Date:2019/5/19 18:33
 * @Version 1.0
 */
@Configuration//声明这是个配置类
@ComponentScan("com.jing")//配置包扫描
@EnableAspectJAutoProxy//开启AOP的注解扫描
public class SpringConfiguration {
}
