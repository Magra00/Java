/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegoadivinarnum.logico;

import java.util.Scanner;

/**
 *
 * @author PILARES
 */
public class AdivinaNumero {
    // atributos
    protected String nickname;
    protected int score;
    
    //metodo constructor

    public AdivinaNumero() {
    }

    public AdivinaNumero(String nickname, int score) {
        this.nickname = nickname;
        this.score = score;
    }
    
    //getter and setter

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    public void jugar(){
        Scanner entrada = new Scanner(System.in);

        long inicio = System.currentTimeMillis();
        long fin = inicio + 120000; // 2 minutos en milisegundos

        int atinadas = 0;   //almacenará el número de aciertos
        System.out.println("#######################################\n ADIVINA LA OPERACION, TIENES DOS MINUTOS\n #######################################");
        int numer1 = 0;
        int numer2 = 0;

         
        


        while (System.currentTimeMillis() < fin) {  //IGUAL A jugar==true, dará 5 minutos de juego antes de terminar
            int opcion;
            opcion = (int) (Math.random() * (5 - 1)) + 1;
            boolean adivinoCorrectamente = false;  //cambiará al atinar de forma correecta 
            numer1 = (int) (Math.random() * (99 - 1)) + 1;
            numer2 = (int) (Math.random() * (9 + 1)) + 1;
            double res;
            switch (opcion) {  
                case 1:
                    System.out.print(" " + numer1 + " + " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();

                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 + numer2) {
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos" );
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            System.out.print(" " + numer1 + " + " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                         
                    }
                    break;
                    
                    


                case 2:
                    System.out.print(" " + numer1 + " - " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 - numer2) {
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            System.out.print(" " + numer1 + " - " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                         
                    }
                    break;
                    
                    

                case 3:
                    System.out.print(" " + numer1 + " / " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 / numer2) {
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            System.out.print(" " + numer1 + " / " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                         
                    }
                    break;
                    
                case 4:
                    System.out.print(" " + numer1 + " * " + numer2 + " = ");
                    res = entrada.nextDouble();
                    entrada.nextLine();
                    while(!adivinoCorrectamente){   //para no cambiar hasta adivinar la respuesta
                        if (res == numer1 * numer2) {
                            System.out.println("¡CORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            adivinoCorrectamente = true;   //cambia el valor para permanecer en el ciclo
                            atinadas++; //sumo 1 a atinadas
                        } else {
                            System.out.println("¡INCORRECTO!, te quedan " + (fin - System.currentTimeMillis())/1000 + " segundos");
                            System.out.print(" " + numer1 + " * " + numer2 + " = ");
                            res = entrada.nextDouble();
                            entrada.nextLine();
                        }
                         
                    }
                    break;
                    

                default:
                    System.out.println("Opción inválida");
            }

          

           
        }
        
        this.score=atinadas;
        
        System.out.println("¡Gracias por jugar! Lograste atinar a " + atinadas + " operaciones ");
        entrada.close();
        
    }
    
    public void verDatos(){
        System.out.println("\nNombre de usuario: " + this.nickname + "\nPuntuación: " + this.score);
    }
}
