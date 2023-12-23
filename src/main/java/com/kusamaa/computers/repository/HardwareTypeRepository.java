package com.kusamaa.computers.repository;

import com.kusamaa.computers.entity.HardwareType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareTypeRepository extends PagingAndSortingRepository<HardwareType, Integer> {

}