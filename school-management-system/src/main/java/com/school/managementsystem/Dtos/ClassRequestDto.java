package com.school.managementsystem.Dtos;

import com.school.managementsystem.enums.Grade;
import lombok.Data;

@Data
public class ClassRequestDto {
    private String name;
    private Grade grade;
    private Long classroomId;
    private Long academicYearId;

}
