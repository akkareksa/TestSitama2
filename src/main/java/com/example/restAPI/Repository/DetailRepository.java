/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.restAPI.Repository;

import com.example.restAPI.Entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vckev
 */
public interface DetailRepository extends JpaRepository<Detail, Long>{
    
}
