package com.school.managementsystem.services;

import com.school.managementsystem.Dtos.ClassRequestDto;
import com.school.managementsystem.Dtos.ClassResponseDto;
import com.school.managementsystem.base.BaseService;
import com.school.managementsystem.entities.ClassEntity;
import com.school.managementsystem.mappers.ClassMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassService extends BaseService<ClassEntity ,Long> {

    private final ClassMapper classMapper;

    public ClassService(ClassMapper classMapper) {
        this.classMapper = classMapper;
    }

    public ClassResponseDto createClass(ClassRequestDto requestDto) {
        ClassEntity classEntity = classMapper.toEntity(requestDto);
        ClassEntity savedEntity = save(classEntity);
        return classMapper.toDto(savedEntity);
    }

    public List<ClassResponseDto> getAllClasses() {
        return findAll().stream()
                .map(classMapper::toDto)
                .collect(Collectors.toList());
    }

    public ClassResponseDto getClassById(Long id) {
        return findById(id)
                .map(classMapper::toDto)
                .orElse(null);
    }



}
