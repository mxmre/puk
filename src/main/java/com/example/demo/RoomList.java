/*   
  #roomlist
  add_room: 
      room_code: string
        
  del_room: 
      room_code: string       
      return status_code: int
  
    */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomList {
    @GetMapping("/addRoom")
    public void addRoom(@RequestParam("room_code_hash") String room_code_hash){
        System.out.println("addRoom");
    }//Добавление существующей комнаты по коду другому пользователю
    @GetMapping("/delRoom")
    public int delRoom(@RequestParam("room_code_hash") String room_code_hash){
        System.out.println("delRoom");
        return 0;
    }
    
    
}
