package com.school.managementsystem.services;

import com.school.managementsystem.Dtos.SubjectClassRequestDto;
import com.school.managementsystem.Dtos.SubjectClassResponseDto;
import com.school.managementsystem.base.BaseService;
import com.school.managementsystem.entities.SubjectClass;
import com.school.managementsystem.mappers.SubjectClassMapper;
import com.school.managementsystem.repositories.SubjectClassRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectClassService extends BaseService<SubjectClass, Long> {

    public SubjectClassService(SubjectClassRepository repository) {

        super(repository);
    }
}
