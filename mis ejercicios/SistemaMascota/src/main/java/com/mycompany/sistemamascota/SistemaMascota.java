
package com.mycompany.sistemamascota;

import com.mycompany.sistemamascota.logica.RecibeMascota;
import java.util.ArrayList;

public class SistemaMascota {

    public static void main(String[] args) {
        
        //creamos objeto del constructor vacio
        RecibeMascota mascota1=new RecibeMascota();
        mascota1.setNombre_mascota("boby");
        mascota1.setEdad_mascota(4);
        mascota1.setRaza("chihuahua");
        mascota1.setTamaño(17.3);
        mascota1.setNombre_dueño("Juan Perez\n");
        
        mascota1.mostrarDatos();
        
        RecibeMascota mascota2=new RecibeMascota("toby", 6, "pug", 10.5, "Lupita\n");
        mascota2.mostrarDatos();
        
        
      // declaramos el ArrayList
        ArrayList<RecibeMascota> mascotas=new ArrayList<>();
        mascotas.add(0, mascota1);
        mascotas.add(0, mascota2);
        
        System.out.println("mascotas registradas: " + mascotas.size());
        
        
        
    }
}
