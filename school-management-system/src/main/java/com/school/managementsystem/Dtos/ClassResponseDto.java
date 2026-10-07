package com.school.managementsystem.Dtos;

import com.school.managementsystem.enums.Grade;
import lombok.Data;

@Data
public class ClassResponseDto {

    private Long id;
    private String name;
    private Grade grade;
    private String classroomName;
    private String academicYearName;
}
