package com.globallogic.allMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allMapping.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}
