package com.lsy.shadowapi;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncryptableProperties  // Spring Boot 3.2.x에서는 필수로 적용해야 Jasypt 복호화 동작(Jasypt 암복호화 빈 조기 등록)
@SpringBootApplication
public class ShadowApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowApiApplication.class, args);
    }

}
