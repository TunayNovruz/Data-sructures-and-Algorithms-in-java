package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(34,45,0,5,100,11,73,83));

        List result = gradingStudents(nums);
        Integer[] grades = new Integer[result.size()];
        grades = (Integer[]) result.toArray(grades);

        for(int grade : grades){
            System.out.println(grade);
        }


    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int len = grades.size();
        for (int i = 0; i <len ; i++) {
            int grade = grades.get(i);
            if(grade < 38) continue;
            int carrier = 5 - grade % 5;
            if(carrier < 3) grades.set(i,grade+carrier);
        }

        return grades;
    }

}
