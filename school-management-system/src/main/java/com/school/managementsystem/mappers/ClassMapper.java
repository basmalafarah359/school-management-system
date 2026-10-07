package com.school.managementsystem.mappers;

import com.school.managementsystem.Dtos.ClassRequestDto;
import com.school.managementsystem.Dtos.ClassResponseDto;
import com.school.managementsystem.entities.ClassEntity;
import org.springframework.stereotype.Component;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;
import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.setName;
@Component
public class ClassMapper {

    public ClassEntity toEntity(ClassRequestDto dto) {
        if (dto == null) return null;

        ClassEntity classEntity = new ClassEntity();
        classEntity.setName(dto.getName());
        classEntity.setGrade(dto.getGrade());
        return classEntity;
    }

    public ClassResponseDto toDto(ClassEntity classEntity) {
        if (classEntity == null) return null;

        ClassResponseDto dto = new ClassResponseDto();
        dto.setId(classEntity.getId());
        dto.setName(classEntity.getName());
        dto.setGrade(classEntity.getGrade());

        if (classEntity.getClassroom() != null) {
            dto.setClassroomName(classEntity.getClassroom().getName());
        }
        /*
        if (classEntity.getAcademicYear() != null) {
            dto.setAcademicYearName(classEntity.getAcademicYear().getName());
        }
        */

        return dto;
    }
}