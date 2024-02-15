

package com.mycompany.juegoadivinarnum;

import com.mycompany.juegoadivinarnum.logico.AdivinaNumero;


public class JuegoAdivinarNum {

    public static void main(String[] args) {
       AdivinaNumero jugador1=new AdivinaNumero("juan",0);
       AdivinaNumero jugador2=new AdivinaNumero("pedro",0);
       AdivinaNumero jugador3=new AdivinaNumero("Maria",0);
       
       jugador1.jugar();
       jugador2.jugar();
       jugador3.jugar();
       
       
       
       
       jugador1.verDatos();
       
    }
}
