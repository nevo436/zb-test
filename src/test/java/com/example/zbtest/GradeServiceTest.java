package com.example.zbtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GradeServiceTest {

    private final GradeService gradeService = new GradeService();

    @Test
    void returnsExpectedGradeLevels() {
        assertEquals("A", gradeService.grade(95));
        assertEquals("B", gradeService.grade(80));
        assertEquals("C", gradeService.grade(65));
        assertEquals("D", gradeService.grade(40));
    }

    @Test
    void rejectsOutOfRangeScores() {
        assertThrows(IllegalArgumentException.class, () -> gradeService.grade(-1));
    }

    @Disabled("Reserved for a later end-to-end scenario")
    @Test
    void skipsPendingScenario() {
        assertEquals("C", gradeService.grade(60));
    }
}
