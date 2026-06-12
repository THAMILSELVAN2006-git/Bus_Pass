package com.example.Buss_Pass_Management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

@Entity
@Table(name="bus_pass")
public class BusPass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    private String department;

    private String source;

    private String destination;

    private String passType;

    private String status;



    public BusPass() {
    }



    // Getters and Setters
}