package com.school.managementsystem.controller;

import com.school.managementsystem.Dtos.SubjectClassRequestDto;
import com.school.managementsystem.Dtos.SubjectClassResponseDto;
import com.school.managementsystem.base.BaseController;
import com.school.managementsystem.entities.SubjectClass;
import com.school.managementsystem.services.SubjectClassService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subject-classes")
public class SubjectClassController  extends BaseController<SubjectClass, Long> {

    public SubjectClassController(SubjectClassService service) {
        super(service);
    }



}
