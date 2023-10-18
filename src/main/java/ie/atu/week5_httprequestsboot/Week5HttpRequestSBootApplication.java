package ie.atu.week5_httprequestsboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class Week5HttpRequestSBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week5HttpRequestSBootApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){ return new RestTemplate();}

}
