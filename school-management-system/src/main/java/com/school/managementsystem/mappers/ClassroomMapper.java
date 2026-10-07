package com.school.managementsystem.mappers;

import com.school.managementsystem.Dtos.ClassroomRequestDto;
import com.school.managementsystem.Dtos.ClassroomResponseDto;
import com.school.managementsystem.entities.Classroom;
import org.springframework.stereotype.Component;

@Component
public class ClassroomMapper {

    public Classroom toEntity(ClassroomRequestDto dto) {
        if (dto == null) return null;

        Classroom classroom = new Classroom();
        classroom.setName(dto.getName());
        classroom.setCapacity(dto.getCapacity());
        return classroom;
    }


    public ClassroomResponseDto toDto(Classroom classroom) {
        if (classroom == null) return null;

        ClassroomResponseDto dto = new ClassroomResponseDto();
        dto.setId(classroom.getId());
        dto.setName(classroom.getName());
        dto.setCapacity(classroom.getCapacity());
        return dto;
    }
}
