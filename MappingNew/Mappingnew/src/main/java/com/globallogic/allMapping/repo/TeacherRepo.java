package com.globallogic.allMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.globallogic.allMapping.entity.TeacherEntity;

public interface TeacherRepo extends JpaRepository<TeacherEntity, Long> {

}
