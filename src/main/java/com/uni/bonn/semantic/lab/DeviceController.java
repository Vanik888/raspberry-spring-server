package com.uni.bonn.semantic.lab;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DeviceController {
    @GetMapping("/uni-bonn/devices/external")
    public ResponseEntity<String> external_device(HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "text/turtle; charset=utf-8");

        String help = "this is external device";

        return new ResponseEntity<String>("returning: " + help, responseHeaders, HttpStatus.OK);
    }

    @PutMapping("/uni-bonn/devices/external")
    public ResponseEntity<String> external_device_post(@RequestBody String body, HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "text/turtle; charset=utf-8");
        if (body.toString().contains("TurnOff")) {
            return new ResponseEntity<String>("OK", responseHeaders, HttpStatus.OK);
        } else if (body.toString().contains("TurnOn")) {
            return new ResponseEntity<String>("OK", responseHeaders, HttpStatus.OK);
        }

        String help = "Bad Request";
        return new ResponseEntity<String>("returning: " + help, responseHeaders, HttpStatus.BAD_REQUEST);
    }
}
