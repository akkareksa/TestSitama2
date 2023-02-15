/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author vckev
 */

@Data
@Entity
@Table(name = "service_details")
@AllArgsConstructor 
@NoArgsConstructor
public class Detail {
    
    @Id
//    @GeneratedValue
    private Long id;
    
    @Column(name = "service_id")
    private Long serviceId;
    
    private String group;
    private String description;
    private Integer mandatory;
    private Integer sequence;
    private String parent;
    private String type;
    
    @Column(name = "is_multiplied")
    private Integer isMultiplied;
    
    private String remark;
    private String status;
    
    @Column(name = "created_by")
    private String createdBy;
    
    @Column(name = "updated_by")
    private String updatedBy;
    
    @Column(name = "created_at")
    private String createdAt;
    
    @Column(name = "updated_at")
    private String updatedAt;
    
    @Column(name = "deleted_at")
    private String deletedAt;
    
//    @ManyToMany(mappedBy = "headers", fetch = FetchType.LAZY)
//    private Set<Header> headers;
    
}
