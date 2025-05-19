package com.neueda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Matt", 10000.0));
        employees.add(new Employee(2, "Fergus", 20000.0));
        employees.add(new Employee(3, "Teresa", 30000.0));

        System.out.println(employees);

        ObjectMapper om = new ObjectMapper();
        String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
        System.out.println(json);
    }
}