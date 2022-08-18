package com.globallogic.allMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allMapping.entity.AddressEntity;


public interface AddressRepo extends JpaRepository<AddressEntity, Long>{

}
