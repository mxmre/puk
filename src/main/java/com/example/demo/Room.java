
package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
#room       
  create_room: 
      icon: file
      name: string
      return id: string
      
  edit_room: 
      icon_new: file
      name_new: string
      return status_code: int
      
  enter_room: 
      token: string
      return status_code: int

  add_event:
      time: string
      ev_name: string   
      return status_code: int
      return ev_id: int
     
  get_event_id:
      token: string
      return ev_id
      
  del_event:
      ev_id: int
      return status_code: int
 */
@Controller
public class Room {//создание комнаты с последующим добавлением в список к создателю!!!!
    @GetMapping("/create_room")
    public String send_msg (
            @RequestParam("imgUrl") String imgUrl, 
            @RequestParam("name") String name
            ){
        System.out.println("create_room");
        return "6";
    }
    
    @GetMapping("/edit_room")
    public int edit_room (
            @RequestParam("new_imgUrl") String new_imgUrl, 
            @RequestParam("new_name") String new_name){
        System.out.println("edit_room");
        return 7;
    }
    
    @GetMapping("/enter_room")
    public int enter_room (@RequestParam("token") String token){
        System.out.println("enter_room");
        return 8;
    }
    
    @GetMapping("/add_event")
    public int add_event (
            @RequestParam("time") String time, 
            @RequestParam("ev_name") String ev_name){
        System.out.println("add_event");
        return 8+1;
    }
    
    @GetMapping("/get_event_id")
    public int get_event_id (@RequestParam("token") String token){
        System.out.println("get_event_id");
        return 10;
    }
    
    @GetMapping("/del_event")
    public int del_event (@RequestParam("ev_id") int ev_id){
        System.out.println("del_event");
        return 11;
    }
}
