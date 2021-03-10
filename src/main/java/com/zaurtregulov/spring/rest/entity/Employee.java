package com.zaurtregulov.spring.rest.entity;

public class Employee {
    private int id;

    private String name;

    private String surname;

    private String department;

    private int salary;

    private String patronymic;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.patronymic = patronymic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
