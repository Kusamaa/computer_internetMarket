package com.kusamaa.computers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "device_type_s1", schema = "computers")
public class DeviceType {
    //device_id
    @Id
    @Column(name = "device_type_id", updatable = false, nullable = false)
    private Integer deviceTypeId;
    //name
    @Column(name = "name")
    private String name;
    //description
    @Column(name = "description")
    private String description;
}
