package shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 주문 서비스 껍데기입니다. 강의 주제는 서비스 구현이 아니라 개발자 포털입니다.
@SpringBootApplication
@RestController
public class OrderApplication {

    @GetMapping("/orders")
    public String orders() {
        return "[]";
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
