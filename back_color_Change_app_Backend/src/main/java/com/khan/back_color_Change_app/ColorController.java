package com.khan.back_color_Change_app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ColorController {
    @GetMapping("/getColor")
    public ResponseDto getColor(){
        //return new  ResponseDto("blue");
        //return new  ResponseDto("black");
        //return new  ResponseDto("red");
        return new  ResponseDto("green");
    }
}
