package com.example.Buss_Pass_Management.Controller;



import com.example.Buss_Pass_Management.Model.BusPass;
import com.example.Buss_Pass_Management.Service.BusPassService;
import com.example.Buss_Pass_Management.dto.BusPassDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buspass")
@CrossOrigin("*")
public class BusPassController {

    @Autowired
    private BusPassService service;

    @PostMapping
    public BusPass createPass(
            @RequestBody BusPassDTO dto) {

        return service.createPass(dto);
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
            @RequestBody BusPassDTO dto) {

        return service.updatePass(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deletePass(
            @PathVariable Long id) {

        service.deletePass(id);

        return "Deleted Successfully";
    }
}