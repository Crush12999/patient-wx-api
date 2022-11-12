package com.sryzzz.patient.wxapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 患者端微信小程序-后端启动类
 *
 * @author sryzzz
 */
@EnableAsync
@ServletComponentScan
@MapperScan("com.sryzzz.patient.wxapi.db.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PatientWxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientWxApiApplication.class, args);
    }

}
