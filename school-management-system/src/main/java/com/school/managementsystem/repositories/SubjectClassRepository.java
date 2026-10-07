package com.school.managementsystem.repositories;

import com.school.managementsystem.base.BaseRepository;
import com.school.managementsystem.entities.SubjectClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectClassRepository  extends BaseRepository<SubjectClass,Long> {
}
