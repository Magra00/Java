/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaempleados1.persistencia;

import com.mycompany.sistemaempleados1.logica.Empleado;

/**
 *
 * @author PILARES
 */
public class ControladoraPersistencia {
    EmpleadoJpaController empleadojpa= new EmpleadoJpaController();

    public void guardar(Empleado empleado) {
        empleadojpa.create(empleado);
    }
    
}
