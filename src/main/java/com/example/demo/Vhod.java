/*   
     #vhod
  registration:
      login: string
      password_hash: string
      repeat_password_hash: string        


  auth: 
      login: string
      password: string
      return token: string
         
    */
package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



//http://localhost:8080/reg
@RestController
public class Vhod {
    @GetMapping("/")
    @ResponseBody
    public ModelAndView registration (HttpServletRequest request){
        
        System.out.println("registration start ");
        String login = request.getParameter("login");
        System.out.println("login: " + login);
        String password = request.getParameter("password");
        System.out.println("password: " + password);
        
        if(login != null && password != null){
        
 
            return new ModelAndView("redirect:/user?login=" + login);
        }
        
        ModelAndView tmp = new ModelAndView();
        tmp.setViewName("reg.html");
        System.out.println("registration end ");
        return tmp;
    }
    @GetMapping("/auth")
    @ResponseBody
    public String auth (HttpServletRequest request){
        String login = request.getParameter("login");
        String password_hash = request.getParameter("password_hash");
        String token = new String();//Както получим
        System.out.println("auth");
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
          "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
    }  
}
