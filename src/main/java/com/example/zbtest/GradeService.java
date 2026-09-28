package com.example.zbtest;

public class GradeService {

    public String grade(int score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 60) {
            return "B";
        }
        return "C";
    }
}
