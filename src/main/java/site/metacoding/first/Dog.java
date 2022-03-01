package site.metacoding.first;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component //특별한 목적 없이 IOC에 등록하고 싶을 때 
public class Dog {
    private String name = "푸들"; //내가 new 하지 않는 이상 안뜸

    public Dog(){
        System.out.println("강아지가 IOC컨테이너에 등록되었어요!"); //IOC에 뜸
    }
}
