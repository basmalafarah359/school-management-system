package com.school.managementsystem.controller;

import com.school.managementsystem.Dtos.ClassRequestDto;
import com.school.managementsystem.Dtos.ClassResponseDto;
import com.school.managementsystem.base.BaseController;
import com.school.managementsystem.entities.ClassEntity;
import com.school.managementsystem.services.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassController  extends BaseController<ClassEntity,Long> {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        super(classService);
        this.classService = classService;
    }

    @PostMapping("/dto")
    public ResponseEntity<ClassResponseDto> createWithDto(@RequestBody ClassRequestDto requestDto) {
        return ResponseEntity.ok(classService.createClass(requestDto));
    }

    @GetMapping("/dto")
    public ResponseEntity<List<ClassResponseDto>> getAllWithDto() {
        return ResponseEntity.ok(classService.getAllClasses());
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<ClassResponseDto> getWithDtoById(@PathVariable Long id) {
        ClassResponseDto dto = classService.getClassById(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }



}

