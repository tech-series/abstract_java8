package com.abs;

import java.time.LocalDate;

public abstract class Employee {
    public static final String DefaultName = "Unknown";
    private static int nextId ;

    private int id;
    private String name;
    private LocalDate hireDate;

    public Employee(){
        this(DefaultName);
    }

    public Employee(String name){
        id = nextId++;
        this.name = name;
        hireDate = LocalDate.now();
    }

    public abstract double getSalary();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
