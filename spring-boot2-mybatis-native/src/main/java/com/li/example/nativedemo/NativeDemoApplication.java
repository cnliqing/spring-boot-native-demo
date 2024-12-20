package com.li.example.nativedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.nativex.MyBatisResourcesScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.li.example.nativedemo"})
@MapperScan(basePackages = "com.li.example.nativedemo", sqlSessionTemplateRef = "sqlSessionTemplate")
@MyBatisResourcesScan(typeAliasesPackages = "com.li.example.nativedemo", mapperLocationPatterns = "mapper/**/*Mapper.xml")
public class NativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeDemoApplication.class, args);
    }

}
