package me.ixk.xkblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@MapperScan("me.ixk.xkblog.mapper")
public class XkblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(XkblogApplication.class, args);
    }

}
