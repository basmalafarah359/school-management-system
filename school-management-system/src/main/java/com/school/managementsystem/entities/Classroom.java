package com.school.managementsystem.entities;

import com.school.managementsystem.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "classroom")
@Getter
@Setter
public class Classroom  extends BaseEntity {

    private String name;
    private Integer capacity;
    private String location;
    private String status;




}
