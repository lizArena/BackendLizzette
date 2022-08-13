/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Liz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter  @Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 100, message="No cumple con la longitudd" )
    private String nombre;
    
     @NotNull
    @Size(min = 1, max = 200, message="No cumple con la longitudd" )
    private String apellido;
     
    
    @Size(min = 1, max = 500, message="No cumple con la longitudd" )
    private String img;
      
    @NotNull
    @Size(min = 1, max = 200, message="No cumple con la longitudd" )
    private String position;
    
     @NotNull
    @Size(min = 1, max = 2000, message="No cumple con la longitudd" )
    private String aboutMe;  
}