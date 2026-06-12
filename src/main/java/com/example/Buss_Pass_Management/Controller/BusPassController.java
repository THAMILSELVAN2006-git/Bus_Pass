package com.example.Buss_Pass_Management.Controller;

import com.example.Buss_Pass_Management.Model.BusPass;
import com.example.Buss_Pass_Management.Service.BusPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174"})
@RequestMapping("/api/buspass")
public class BusPassController {


    @Autowired
    private BusPassService service;

    @PostMapping
    public BusPass createPass(
            @RequestBody BusPass bus) {

        return service.createPass(bus);
    }

    @GetMapping
    public List<BusPass> getAllPasses() {
        return service.getAllPasses();
    }

    @GetMapping("/{id}")
    public BusPass getPassById(
            @PathVariable Long id) {

        return service.getPassById(id);
    }

    @PutMapping("/{id}")
    public BusPass updatePass(
            @PathVariable Long id,
            @RequestBody BusPass bus) {

        return service.updatePass(id, bus);
    }

    @DeleteMapping("/{id}")
    public String deletePass(
            @PathVariable Long id) {

        service.deletePass(id);

        return "Deleted Successfully";
    }

}
