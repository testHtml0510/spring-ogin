package springLogin.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springLogin.app.model.User;
import springLogin.app.service.UserService;


@Controller
public class HomeController {


    // インスタンスを作成しDIコンテナに格納。
    @Autowired
    UserService userService;


    //userListのアドレスにアクセスした際にGetメソッドを実行。
    @GetMapping("/userList")
    public String getUserList(Model model) {

        //@Autowiredで作成したインスタンスを元に、userServiceのメソッドを呼び出す。
        List<User> userList = userService.selectMany();
        //userServiceから受け取ったデータをView側に渡す。
        model.addAttribute("userList", userList);

        //template配下のファイル名を指定することでViewを呼び出せる。
        return "userList";
    }



}
