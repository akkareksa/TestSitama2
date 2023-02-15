/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author vckev
 */
@Data
@Entity
@Table(name = "service_headers")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Header {
    
    @Id
//    @GeneratedValue
    private Long id;
    
    @Column(name = "service_name")
    private String serviceName;
    
    private Integer mandatory;
    
    @Column(name = "package_id")
    private Integer packageId;
    
    @Column(name = "debitur_type_id")
    private Integer debitur_type_id;
    
    @Column(name = "service_price_amount")
    private Double servicePriceAmount;
    
    @Column(name = "service_price_discount")
    private Double servicePriceDiscount;
    
    private String status;
    
    @Column(name = "created_by")
    private Integer createdBy;
    
    @Column(name = "updated_by")
    private Integer updatedBy;
    
    @Column(name = "created_at")
    private String createdAt;
    
    @Column(name = "updated_at")
    private String updatedAt;
    
    @Column(name = "deleted_at")
    private String deletedAt;
    
//    @OneToMany(targetEntity = Detail.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "detail_id", referencedColumnName = "id")
//    private List<Detail> details;
    
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "HeaderDetail",
//            joinColumns = {
//                @JoinColumn(name = "detail_id", referencedColumnName = "id")
//            },
//            inverseJoinColumns = {
//                @JoinColumn(name ="header_id", referencedColumnName = "id")
//            }
//            )
//    private Set<Detail> details;
}
