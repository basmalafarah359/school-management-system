package com.school.managementsystem.mappers;

import com.school.managementsystem.Dtos.SubjectClassRequestDto;
import com.school.managementsystem.Dtos.SubjectClassResponseDto;
import com.school.managementsystem.entities.SubjectClass;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;

@Component
public class SubjectClassMapper {

    public SubjectClass toEntity (SubjectClassRequestDto dto){
     if (dto == null) return null;

SubjectClass subjectClass = new SubjectClass();
return subjectClass;

    }
    public SubjectClassResponseDto toDto(SubjectClass subjectClass){
        if (subjectClass == null) return null;

        SubjectClassResponseDto dto = new SubjectClassResponseDto();
        dto.setId(subjectClass.getId());

/*
        if (subjectClass.getSubject() != null) {
            dto.setSubjectId(subjectClass.getSubject().getId());
        }
        */


        if (subjectClass.getClassEntity() != null) {
            dto.setClassId(subjectClass.getClassEntity().getId());
        }

        return dto;
    }
}
