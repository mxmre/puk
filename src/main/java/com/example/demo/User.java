
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
#user  
  edit_password: 
      password_old_hash: string
      password_new_hash: string       
      return status_code: int
 */
@Controller
public class User {
    @GetMapping("/edit_password")
    public int edit_password (@RequestParam("old_hash_password") String old_hash_password, @RequestParam("new_hash_password") String new_hash_password){
        System.out.println("edit_password");
        return 1;
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
    public String MainPage (@RequestParam("login") String login){
        System.out.println("user");
        String text = new String();
        text = "<!DOCTYPE html>\n<html lang = \"ru\">\n\t<head>\n\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n\t\t<title>WriToom - " +
                login + "</title>\n\t</head>\n\t<body>\n\t\t<p>Добро пожаловать, " +
                login + "!</p>\n\t</body>\n</html>";
        //ModelAndView tmp = new ModelAndView();
        //tmp.setViewName("user_page.html");
        System.out.println("text");
        return text;
    }
}
