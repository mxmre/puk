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

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


//http://localhost:8080
@RestController
public class Vhod {
    private String main_page = "reg.html";
    @GetMapping("/")
    @ResponseBody
    public ModelAndView StartingPage (HttpServletRequest request) throws IOException{
        
        System.out.println("registration start ");
        this.main_page = "reg.html";
        
        ApiGlobals.Base.Log();
        
        String login = request.getParameter("login");
        System.out.println("login: " + login);
        String password = request.getParameter("password");
        System.out.println("password: " + password);
        
        if(login != null && password != null){
            
            System.out.println("password hash: " + password.hashCode());
            System.out.println("login hash: " + login.hashCode());
            System.out.println("registration end ");
            return new ModelAndView("redirect:/init?token=" + ApiGlobals.GetHash(login, password)
            + "&login=" + login);
            
        }
        
        ModelAndView tmp = new ModelAndView();
        tmp.setViewName(main_page);
        System.out.println("registration end ");
        return tmp;
    }
    @GetMapping("/init")
    @ResponseBody
    public ModelAndView UserInit (@RequestParam("token") String token,
                            @RequestParam("login") String login) throws IOException{
        System.out.println("initialization");
        this.main_page = "reg.html";
        if(ApiGlobals.Base.checkLogin(login)){
            if(ApiGlobals.Base.checkUser(token)){
                System.out.println(ApiGlobals.Base.getUserLogin(token) + " entered!");
            }
            else
            {
                this.main_page = "reg_1.html";
                System.out.println("login \"" + login +  "\"already exist!");
                return new ModelAndView("redirect:/");
            }
        }
        else{
            
            ApiGlobals.Base.addUser(token, login);
        }
        
        return new ModelAndView("redirect:/user?token=" + token);
    }
}
