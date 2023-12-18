package com.kusamaa.computers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hardware_type_s1", schema = "computers")
public class HardwareType {
    //hardware_type_id
    @Id
    @Column(name = "hardware_type_id", nullable = false, updatable = false)
    private Integer hardwareTypeId;
    //name
    @Column(name = "name")
    private String name;
    //description
    @Column(name = "description")
    private String description;
}
