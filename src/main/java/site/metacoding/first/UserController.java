package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러 만들기
//component scan 함
@RestController
public class UserController {

    Dog d;

    //DI: IoC 컨테이너에 있으니까 주입해줄 수 있음
    //Dependency Injection : 의존성 주입
    public UserController(Dog d , HttpServletRequest request) { //IOC에서 dog 찾음
        System.out.println("생성자 실행됨");
        this.d = d;
    }

    @GetMapping("/home") // 실행시 어노테이션 분석해서 reflection 해서 찾아냄
    public void home() {
        System.out.println("home~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("bye!");
    }

    // return 해보기
    @GetMapping("/data")
    public String data() {
        return "<h1>data</h1>"; // print -> write -> flush
    }
}
