package com.example.projectA.controller;

import com.example.projectA.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/")
 class AuthController {


    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome() {
  return "welcome to spring boot";
    }

    @GetMapping("hello1")
    public String printHelloWorld(){
        return "hello World";
    }

    @PostMapping("/hello")
    public String getMyName(@RequestParam String name, @RequestBody UserModel userModel){
        HashMap<String, String> hashMap = new HashMap<String, String>();
    /***
     * console a print koranur jonno
     */
        System.out.println(name);

        /***
//*body the postman ar body the show koranur jonno */



        return "Hello "+userModel.getName();
    }

}
