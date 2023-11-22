package com.it;

public class Employee {

    String id;
    String name;
    String jobType;
    int age;

    public Employee() {

    }

    public Employee(String id, String name, String jobType, int age) {
        this.id = id;
        this.name = name;
        this.jobType = jobType;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobType='" + jobType + '\'' +
                ", age=" + age +
                '}';
    }
}
