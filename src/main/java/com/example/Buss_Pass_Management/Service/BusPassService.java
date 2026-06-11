package com.example.Buss_Pass_Management.Service;



import com.example.Buss_Pass_Management.Model.BusPass;
import com.example.Buss_Pass_Management.Repository.BusPassRepository;
import com.example.Buss_Pass_Management.dto.BusPassDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusPassService {

    @Autowired
    private BusPassRepository repository;

    // Create
    public BusPass createPass(BusPassDTO dto) {

        BusPass pass = new BusPass();

        pass.setStudentName(dto.getStudentName());
        pass.setDepartment(dto.getDepartment());
        pass.setSource(dto.getSource());
        pass.setDestination(dto.getDestination());
        pass.setPassType(dto.getPassType());
        pass.setStatus("PENDING");

        return repository.save(pass);
    }

    // Get All
    public List<BusPass> getAllPasses() {
        return repository.findAll();
    }

    // Get By Id
    public BusPass getPassById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update
    public BusPass updatePass(Long id, BusPassDTO dto) {

        BusPass pass = repository.findById(id).orElse(null);

        if (pass != null) {
            pass.setStudentName(dto.getStudentName());
            pass.setDepartment(dto.getDepartment());
            pass.setSource(dto.getSource());
            pass.setDestination(dto.getDestination());
            pass.setPassType(dto.getPassType());

            return repository.save(pass);
        }

        return null;
    }

    // Delete
    public void deletePass(Long id) {
        repository.deleteById(id);
    }
}