package ie.atu.week5_httprequestsboot.NonBlockingApproach;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
}
