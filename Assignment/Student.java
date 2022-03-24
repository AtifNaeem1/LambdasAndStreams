package com.company.Assignment;

public class Student {
    int studentId,age,yearOfEnrollment;
    String name,gender, engDepartment;
    double percentageTillDate;
    Student(int studentId,
            String name,
            int age,
            String gender,
            String engDepartment,
            int yearOfEnrollment,
            double percentageTillDate)
    {
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.percentageTillDate=percentageTillDate;
    }
    public String getDepartment()
    {
        return engDepartment;
    }
    public double getPercentage()
    {
        return percentageTillDate;
    }
}
