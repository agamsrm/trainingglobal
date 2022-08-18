package com.globallogic.allMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allMapping.entity.RegisterEntity;


public interface RegisterRepo extends JpaRepository<RegisterEntity, Long>{

}
