package com.example.one;

import com.example.one.ImmutableStudentClass;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "First");
        map.put("2", "Second");

        ImmutableStudentClass student = new ImmutableStudentClass("John", 121, map);

        System.out.println(student.getName());
        System.out.println(student.getRegNo());
        System.out.println(student.getMetadata());

        map.put("3", "Third");
        System.out.println(student.getMetadata());

        student.getMetadata().put("4", "Fourth");
        System.out.println(student.getMetadata());
    }
}
