
package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**   
  #room_msg
  send_msg: 
      room_code: string
      msg: string
      token: string     
      return status_code: int
  
  get_room_code:
      token: string    
      return room_code: int
      return status_code: int
 */
@Controller
public class RoomMsg {
    @GetMapping("/send_msg")
    public int send_msg (
            @RequestParam("room_code") String room_code, 
            @RequestParam("msg") String msg,
            @RequestParam("token") String token
            ){
        System.out.println("send_msg");
        return 3;
    }
    
    @GetMapping("/get_room_code")
    public int get_room_code (HttpServletRequest request){
        String token = request.getParameter("token");
        System.out.println("get_room_code");
        return 3+1;
    }
}
