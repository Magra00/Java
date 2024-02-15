/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vacaciones;

/**
 *
 * @author PILARES
 */
import java.util.Scanner;
public class Vacaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, departamento;
        int antiguedad, contador;
        int indice=0;
        boolean repetir=false;
        Scanner entrada=new Scanner(System.in);
        
        /*  declaracion del arreglo */
        String[]nombres=new String [5];
        int[]vacaciones=new int[5];
     
        System.out.println("*****\n BIENVENIDO AL SISTEMA \n *****");        
        
        while (indice!=5){
            
            System.out.println("Ingresa el nombre del trabajador");
            nombre=entrada.nextLine();
            nombres[indice]=nombre;
            System.out.println("Cual es la antiguedad del trabaador");
            antiguedad=entrada.nextInt();
            entrada.nextLine();
            System.out.println("En que departamento esta \n A \n B \n C " );
            departamento=entrada.nextLine();
                switch(departamento.toUpperCase()){
                case "A":
                    switch(antiguedad){
                        case 1:
                        case 2:    
                            vacaciones[indice]=5;
                            break;
                        case 3:
                        case 4:
                            vacaciones[indice]=7;
                            break;
                        case 0:
                            vacaciones[indice]=0;
                            break;
                        default:
                            vacaciones[indice]=10;
                    }
                    break;
                case "B":
                    switch(antiguedad){
                        case 1:
                        case 2:  
                            vacaciones[indice]=7;
                            break;
                        case 3:
                        case 4:  
                            vacaciones[indice]=10;
                            break;
                        case 0:
                            vacaciones[indice]=0;
                            break;
                        default:
                            vacaciones[indice]=13;
                    }
                    break;
                case "C":
                    switch(antiguedad){
                        case 1:
                        case 2:
                            vacaciones[indice]=10;
                            break;
                        case 3:
                        case 4:
                            vacaciones[indice]=13;
                            break;
                        case 0:
                            vacaciones[indice]=0;
                            break;
                        default:
                            vacaciones[indice]=15;
                    }
                    break;
                default: 
                    System.out.println("departamento no existe");
                    
            
                
                    
                                   
                    
                
                 }
                
                // System.out.println("A"+ nombres[indice] +"le corresponden "+ vacaciones[indice]+ "dias de vacaciones");
                indice++;                
            
            }
        System.out.println("nombre     dias de vacaciones");
        for(int i=0; i<nombres.length; i++){
            System.out.println(nombres[i] + "       " + vacaciones[i]);
        }
        
        
        }
        
        
    }
    

