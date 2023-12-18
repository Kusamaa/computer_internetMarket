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
@Table(name = "hardware", schema = "computers")
public class Hardware {
    //hardware_id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hardware_id", updatable = false, nullable = false)
    private Integer hardwareId;
    //hardware_type_id
    @Column(name = "hardware_type_id")
    private Integer hardwareTypeId;
    //name
    @Column(name = "name")
    private String name;
    //buying_price
    @Column(name = "buying_price")
    private BigDecimal buyingPrice;
    //selling_price
    @Column(name = "selling_price")
    private BigDecimal sellingPrice;
    //description
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "hardware_type_id", referencedColumnName = "hardware_type_id", insertable = false, updatable = false)
    private HardwareType hardwareType;
}
