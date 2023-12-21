package com.kusamaa.computers.repository;

import com.kusamaa.computers.entity.DeviceType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeRepository extends PagingAndSortingRepository<DeviceType, Integer> {

}
