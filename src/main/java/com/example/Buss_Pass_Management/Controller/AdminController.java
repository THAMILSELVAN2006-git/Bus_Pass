package com.example.Buss_Pass_Management.Controller;

import com.example.Buss_Pass_Management.Service.BusPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174"})
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BusPassService service;

    @PutMapping("/approve/{id}")
    public String approve(
            @PathVariable Long id){

        service.approvePass(id);

        return "Approved";
    }

    @PutMapping("/reject/{id}")
    public String reject(
            @PathVariable Long id){

        service.rejectPass(id);

        return "Rejected";
    }
}