/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaempleados1.logica;

import com.mycompany.sistemaempleados1.persistencia.ControladoraPersistencia;

/**
 *
 * @author PILARES
 */
public class ControladoraLogica {
    ControladoraPersistencia controlpersi= new ControladoraPersistencia();

    public void guardar(String text, String text0, String text1, String text2, String sexo, String text3) {
        Empleado empleado= new Empleado();
        empleado.setNombre(text);
        empleado.setTelefono(text0);
        empleado.setDireccion(text1);
        empleado.setCorreo(text2);
        empleado.setGenero(sexo);
        empleado.setNacimiento(text3);
        
        controlpersi.guardar(empleado);
    }

    
    
}
