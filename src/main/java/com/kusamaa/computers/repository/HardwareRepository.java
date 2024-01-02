package com.kusamaa.computers.repository;

import com.kusamaa.computers.entity.Hardware;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HardwareRepository extends PagingAndSortingRepository<Hardware, Integer> {

    List<Hardware> findAllByHardwareTypeId(Integer hardwareTypeId);
}
