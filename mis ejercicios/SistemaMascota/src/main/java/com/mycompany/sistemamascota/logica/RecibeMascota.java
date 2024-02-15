/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamascota.logica;

/**
 *
 * @author PILARES
 */
public class RecibeMascota {
    
     // atributos
        private String nombre_mascota;
        private int edad_mascota;
        private String raza;
        private double tamaño;
        private String nombre_dueño;
        
        
     // metodos
        //metodo constructor, click derecho, inser code, constructor (generar vacio y con datos)

    public RecibeMascota() {
    }

    public RecibeMascota(String nombre_mascota, int edad_mascota, String raza, double tamaño, String nombre_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.edad_mascota = edad_mascota;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombre_dueño = nombre_dueño;
    }
    
    // getters y setters. boton secundario insert code- getter and setters , selecionar todo y crear

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }
    
    
       // crear metodo para ver todos los datos de la mascota
    
    public void mostrarDatos(){
        System.out.println("nombre mascota: " + this.nombre_mascota + "\nEdad: " + this.edad_mascota + "\nRaza: " + this.raza + "\ntamaño: " + this.tamaño + "\nnombre dueño: " + this.nombre_dueño);
            
    }
        
       
    
}
