package com.jakego.ebproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 이것 때문에 3단 패키지 구조 내에 컴포넌트 스캔이 이루어져서 bean으로 관리 가능
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
