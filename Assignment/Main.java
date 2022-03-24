package com.company.Assignment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.min;
import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {

        List<Student> studentDetail= new ArrayList<>();
        new AddStudentDetails().addDetails(studentDetail);


//         1. Print the name of all departments in the college?
        Set<String> departmentName = studentDetail.stream()
                .map(p->p.engDepartment)
                .collect(Collectors.toSet());
        System.out.println(departmentName);


//        2.Get the names of all students who have enrolled after 2018?
        List<String> studentEnrollAfter2018 = studentDetail.stream()
                .filter(p->p.yearOfEnrollment>2018)
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(studentEnrollAfter2018);


//         3. Get the details of all male student in the computer sci department?
        List<Student> maleStudentInComputerScienceDetails = studentDetail.stream()
                .filter(p -> p.gender == "Male" && p.engDepartment=="Computer Science")
                .collect(Collectors.toList());
        for(Student s : maleStudentInComputerScienceDetails)
        {
            System.out.println(s.name + " " + s.studentId);
        }


//        4. How many male and female student are there ?
        Map<String,Long> maleFemaleCount = studentDetail.stream()
                .map(p->p.gender)
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(maleFemaleCount);


//        5.What is the average age of male and female students?
        double averageAgeMale = studentDetail.stream()
                .filter(p->p.gender=="Male")
                .collect(Collectors.averagingDouble(p->p.age));
        double averageFemale = studentDetail.stream()
                .filter(p->p.gender=="Female")
                .collect(Collectors.averagingDouble(p->p.age));
        System.out.println((averageAgeMale + averageFemale)/2);


//        6.Get the details of highest student having highest percentage ?
        Student highestPercentage = studentDetail.stream()
                .max(Comparator.comparing(p->p.percentageTillDate)).get();
        System.out.println(highestPercentage.name);


//        7.Count the number of students in each department?
        Map<String,Long> studentInEachDepartment = studentDetail.stream()
                .map(p->p.engDepartment)
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(studentInEachDepartment);


//        8. What is the average percentage achieved in each department?
        Map<String,Double> averagePercentage = studentDetail.stream()
                .collect(groupingBy(Student::getDepartment,
                        Collectors.averagingDouble(p->p.percentageTillDate)));
        System.out.println(averagePercentage);


//        9. Get the details of youngest male student in the Electronic department?
        Student youngestMaleInElectronics = studentDetail.stream()
                .filter(p->p.engDepartment=="Electronic" && p.gender=="Male")
                .min(Comparator.comparing(p->p.age)).get();
        System.out.println(youngestMaleInElectronics.studentId +
                " " + youngestMaleInElectronics.name);


//        10.How many male and female students are there in the computer science department?
        Map<String,Long> countMaleFemaleInCS = studentDetail.stream()
                .filter(p->p.engDepartment=="Computer Science")
                .map(p->p.gender)
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMaleFemaleInCS);

    }
}
