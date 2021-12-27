package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    @Id
    @GeneratedValue
    private long employeeId;


    @NotNull
    @Column(unique = true)
    private long employeeCode;

    @NotNull
    private String employeeName;

    @NotNull
    @Column(unique = true)
    private long employeeContactNumber;

    @NotNull
    private String employeeCurrentAddress;

    @NotNull
    private String employeePostalAddress;

    @NotNull
    @Column(unique = true)
    private long employeeUID;

    @NotNull
    @Column(unique = true)
    private String employeePanCardNumber;

    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date employeeDOB;


    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date employeeJoingDate;


    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date employeeLastWorkingDate;

    @NotNull
    private String employeeGender;

    @NotNull
    private String employeeEducationInstitueName;

    @NotNull
    private String employeeHighestEducation;

    @NotNull
    private int employeeEducationPassoutYear;

    @NotNull
    private double employeeHighestEducationMarks;

    @NotNull
    private String employeeParentName;

    @NotNull
    @Column(unique = true)
    private long employeeParentContactNumber;

    @NotNull
    private double employeeLastWithdrawnSalary;

    @NotNull
    @Column(unique = true)
    private String employeeEmailId;

    @NotNull
    private String employeePassword;


}