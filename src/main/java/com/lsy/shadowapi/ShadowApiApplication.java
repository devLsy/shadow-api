package com.lsy.shadowapi;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncryptableProperties    // springBoot 3.2.x버전에서 애노테이션 적용해야 복호화 가능
@SpringBootApplication
public class ShadowApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowApiApplication.class, args);
    }

}
