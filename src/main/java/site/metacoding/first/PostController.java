package site.metacoding.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//파일을 리턴
//RequestDispatcher dis = request.getRequestDispacher("파일명"); 리턴글자 -> 파일명에 들어감
//dis.forward(request, response);
@Controller
public class PostController {

    @GetMapping("/writeForm")
    public String writeForm() {
        return "writeForm"; // writeForm이라는 파일을 리턴! 파일은 templates 폴더에 있음
    }

    @GetMapping("/updateForm")
    public String updateForm() {
        return "updateForm";
    }

}
