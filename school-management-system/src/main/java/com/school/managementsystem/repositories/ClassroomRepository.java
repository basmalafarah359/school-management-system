package com.school.managementsystem.repositories;

import com.school.managementsystem.base.BaseRepository;
import com.school.managementsystem.entities.Classroom;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends BaseRepository<Classroom,Long> {
}
