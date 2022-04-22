
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.HtmlBuilder;
import java.io.IOException;

/**
#user  
  edit_password: 
      password_old_hash: string
      password_new_hash: string       
      return status_code: int
 */
@Controller
public class User {
    @GetMapping("/edit")
    @ResponseBody
    public String edit_password (@RequestParam("old_hash_password") String old_hash_password, @RequestParam("new_hash_password") String new_hash_password){
        System.out.println("edit_password");
        return new String("redirect:/");
    }
    /*
    <!DOCTYPE html>
<html lang = "ru">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>WriToom - свободное общение</title>
    </head>
    <body>
        <form id="data"></form>
        <p><input placeholder="Логин" name="login" form="data"></p>
        <p><input placeholder="Пароль" name="password" form="data"></p>
        <p><input type="submit" value="Регистрация" form="data"></p>
    </body>
</html> 
    */
    @GetMapping("/user")
    @ResponseBody
    public String MainPage (@RequestParam("token") String token) throws IOException{
        System.out.println("user");
        String text = HtmlBuilder.UserPageMake(ApiGlobals.Base.getUserLogin(token));
        return text;
    }
    
    
}
