package com.it;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmp {

    public static void main(String[] args) {
        //find the duplicate count of employee
        List<Employee> eList= new ArrayList<>();
        eList.add(new Employee("1","amol","engg",30));
        eList.add(new Employee("1","Ram","engg",21));
        eList.add(new Employee("1","amol","engg",30));
        eList.add(new Employee("1","sham","engg",35));
        eList.add(new Employee("1","Govid","engg",34));

        //1st Method to find
        Map<String, Long> nameCount= eList.stream().collect(Collectors
                .groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(nameCount);

        // 2nd Method to fond
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(Employee e: eList){
            if(!map.containsKey(e.getName())){
                map.put(e.getName(),1);

            } else {
                map.put(e.getName(),map.get(e.getName())+1);
            }
        }
           System.out.println(map);
    }
}
