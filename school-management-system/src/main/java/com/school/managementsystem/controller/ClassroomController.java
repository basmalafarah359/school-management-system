package com.school.managementsystem.controller;

import com.school.managementsystem.Dtos.ClassroomRequestDto;
import com.school.managementsystem.Dtos.ClassroomResponseDto;
import com.school.managementsystem.base.BaseController;
import com.school.managementsystem.entities.Classroom;
import com.school.managementsystem.services.ClassroomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController extends BaseController<Classroom , Long> {
public final ClassroomService classroomService;


    public ClassroomController(ClassroomService classroomService) {
        super(classroomService);
        this.classroomService =classroomService;
    }
    @PostMapping("/dto")
    public ResponseEntity<ClassroomResponseDto> createWithDto(@RequestBody ClassroomRequestDto requestDto) {
        return ResponseEntity.ok(classroomService.createClassroom(requestDto));
    }

    @GetMapping("/dto")
    public ResponseEntity<List<ClassroomResponseDto>> getAllWithDto() {
        return ResponseEntity.ok(classroomService.getAllClassrooms());
    }

    @GetMapping("/dto/{id}")
    public ResponseEntity<ClassroomResponseDto> getWithDtoById(@PathVariable Long id) {
        ClassroomResponseDto dto = classroomService.getClassroomById(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);


    }



}
