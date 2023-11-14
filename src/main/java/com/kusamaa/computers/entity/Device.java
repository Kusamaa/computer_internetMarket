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
@Table(name = "devices", schema = "computers")
public class Device {
    //device_id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id", updatable = false, nullable = false)
    private Integer deviceId;
    //device_type_id
    @Column(name = "device_type_id")
    private Integer deviceTypeId;
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

    // ссылка на объект DeviceType
    // платеж может иметь только один тип (с обратной стороны - один и тот же тип может использоваться для множества устройств)
    @ManyToOne
    @JoinColumn(name = "device_type_id", referencedColumnName = "device_type_id", insertable = false, updatable = false) // по каким полям связывать (foreign key)
    private DeviceType deviceType;

}
