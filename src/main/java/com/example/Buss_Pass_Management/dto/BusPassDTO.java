package com.example.Buss_Pass_Management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusPassDTO {

    private String studentName;
    private String department;
    private String source;
    private String destination;
    private String passType;

    public BusPassDTO() {
    }


}