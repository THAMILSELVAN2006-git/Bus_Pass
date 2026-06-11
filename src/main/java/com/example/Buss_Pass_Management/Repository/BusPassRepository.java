package com.example.Buss_Pass_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Buss_Pass_Management.Model.BusPass;

public interface BusPassRepository
        extends JpaRepository<BusPass, Long> {

}