package com.example.Buss_Pass_Management.Service;

import com.example.Buss_Pass_Management.Model.BusPass;
import com.example.Buss_Pass_Management.Repository.BusPassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusPassService {


    @Autowired
    private BusPassRepository repository;

    public BusPass createPass(BusPass bus) {

        bus.setStatus("PENDING");

        return repository.save(bus);
    }

    public List<BusPass> getAllPasses() {
        return repository.findAll();
    }

    public BusPass getPassById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public BusPass updatePass(Long id, BusPass bus) {

        BusPass pass =
                repository.findById(id).orElse(null);

        if (pass != null) {

            pass.setStudentName(bus.getStudentName());
            pass.setDepartment(bus.getDepartment());
            pass.setSource(bus.getSource());
            pass.setDestination(bus.getDestination());
            pass.setPassType(bus.getPassType());

            return repository.save(pass);
        }

        return null;
    }

    public void deletePass(Long id) {
        repository.deleteById(id);
    }

    public void approvePass(Long id){

        BusPass pass =
                repository.findById(id).orElse(null);

        if(pass != null){
            pass.setStatus("APPROVED");
            repository.save(pass);
        }
    }

    public void rejectPass(Long id){

        BusPass pass =
                repository.findById(id).orElse(null);

        if(pass != null){
            pass.setStatus("REJECTED");
            repository.save(pass);
        }
    }


}
