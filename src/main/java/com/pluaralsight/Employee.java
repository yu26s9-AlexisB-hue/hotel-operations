package com.pluaralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int punchInTime;
    private boolean hasPunchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double withoutOT = getRegularHours() * payRate;
        double possibleOT = getOvertimeHours() * (payRate * 1.5);
        return withoutOT + possibleOT;
    }

    public double getRegularHours(){
        if (this.hoursWorked > 40){
            return 40;
        }else{
            return this.hoursWorked;
        }
    }

    public double getOvertimeHours(){
        if (this.hoursWorked > 40) {
            double OT = hoursWorked - 40;
            return OT;
        }else{
            return 0;
        }
    }

    public void punchIn(int time){
        //allows the work to punch in with a time stamp
        hasPunchedIn = true;
        punchInTime = time;
    }

    public void punchOut(int time){
        //allows the worker to punch out with a time stamp
        int newHoursWorked =  time - punchInTime;
        hasPunchedIn = false;
        hoursWorked += newHoursWorked;
    }
}
