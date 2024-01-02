package com.kusamaa.computers.repository;

import com.kusamaa.computers.entity.Device;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends PagingAndSortingRepository<Device, Integer> {
    // SpringData / SpringJPA
    public List<Device> findAllByDeviceTypeId(Integer deviceTypeId);
    public List<Device> findAllByDeviceId(Integer deviceId);

    public List<Device> findAllByDeviceIdBefore(Integer deviceId);
    public List<Device> findAllByDeviceIdGreaterThanEqual(Integer deviceId);


}
