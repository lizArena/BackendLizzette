/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Liz.Repository;

import com.portfolio.Liz.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RSkills extends JpaRepository<Skills, Integer> {
    public Optional <Skills> findByNombreS(String nombreS);
    public boolean existsByNombreS(String nombreS);
    
}