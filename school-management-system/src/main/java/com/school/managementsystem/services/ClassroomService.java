package com.school.managementsystem.services;

import com.school.managementsystem.Dtos.ClassroomRequestDto;
import com.school.managementsystem.Dtos.ClassroomResponseDto;
import com.school.managementsystem.base.BaseService;
import com.school.managementsystem.entities.Classroom;
import com.school.managementsystem.mappers.ClassroomMapper;
import com.school.managementsystem.repositories.ClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassroomService  extends BaseService<Classroom, Long> {

  private final ClassroomMapper classroomMapper;

    public ClassroomService(ClassroomMapper classroomMapper) {
        this.classroomMapper = classroomMapper;
    }
    public ClassroomResponseDto createClassroom(ClassroomRequestDto requestDto) {
        Classroom classroom = classroomMapper.toEntity(requestDto);
        Classroom savedClassroom = save(classroom);
        return classroomMapper.toDto(savedClassroom);
    }

    public List<ClassroomResponseDto> getAllClassrooms() {
        return findAll().stream()
                .map(classroomMapper::toDto)
                .collect(Collectors.toList());
    }

    public ClassroomResponseDto getClassroomById(Long id) {
        return findById(id)
                .map(classroomMapper::toDto)
                .orElse(null);
    }


}
