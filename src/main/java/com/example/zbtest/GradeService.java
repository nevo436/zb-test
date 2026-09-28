package com.example.zbtest;

public class GradeService {

    public String grade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("score must be between 0 and 100");
        }
        if (score >= 90) {
            return "A";
        }
        if (score >= 75) {
            return "B";
        }
        if (score >= 60) {
            return "C";
        }
        return "D";
    }

    public boolean isPassing(int score) {
        return score >= 60;
    }
}
