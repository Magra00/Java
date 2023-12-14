import java.util.Scanner;
public class PromedioCalificaciones1{
    public static void main(String[]args){
	String nombre_alumno, materia1, materia2, materia3, materia4, grupo, materia_alta, materia_baja;
	double calif1, calif2, calif3, calif4, promedio,calif_alta, calif_baja;
	
        Scanner entrada=new Scanner(System.in);

	System.out.println("De cuantos alumnos deseas capturara informacion");
	int numero_de_alumnos=entrada.nextInt();
	entrada.nextLine();
	
	for(int i=1; i<=numero_de_alumnos; i++){

	System.out.println("ingresa nombre del alumno " + i);
	nombre_alumno=entrada.nextLine();
	nombre_alumno=nombre_alumno.toUpperCase();
	System.out.println(nombre_alumno);

	System.out.println("Ingresa el grupo al que pertenece el alumno "+nombre_alumno);
    grupo=entrada.nextLine();
	grupo= grupo.toUpperCase();

	System.out.println("ingresa materia 1");
	materia1=entrada.nextLine();
	materia1=materia1.toUpperCase();
	System.out.println("ingresa la calificacion materia1");
	calif1=entrada.nextDouble();
	entrada.nextLine();


// revision de materia mas alta
		materia_baja=materia1;
		calif_baja=calif1;
		materia_alta=materia1;
		calif_alta=calif1;

//validacion calificacion

	if(calif1>=0 & calif1<=10 & materia1.length()==4 & grupo.equals("A")){
	    
        System.out.println("ingresa materia 2");
        materia2=entrada.nextLine();
	    materia2=materia2.toUpperCase();
	    System.out.println("ingresa la calificacion materia2");
        calif2=entrada.nextDouble();
	    entrada.nextLine();

//condicional
			if(calif2>calif_alta){
				materia_alta=materia2;
				calif_alta=calif2;
			} else if(calif2<calif_baja){
				materia_baja=materia2;
				calif_baja=calif2;
			}

		    if(calif2>=0 & calif2<=10 & materia2.length()==4){
				System.out.println("ingresa materia 3");
				materia3=entrada.nextLine();
				materia3=materia3.toUpperCase();
				System.out.println("ingresa la calificacion materia3");
				calif3=entrada.nextDouble();
				entrada.nextLine();	        


				if(calif3>calif_alta){
					materia_alta=materia3;
					calif_alta=calif3;
					} else if(calif3<calif_baja){
					materia_baja=materia3;
					calif_baja=calif3;
					}


				if(calif3>=0 & calif3<=10 & materia3.length()==4){
					System.out.println("ingresa materia 4");
					materia4=entrada.nextLine();
					materia4=materia4.toUpperCase();
					System.out.println("ingresa la calificacion materia4");
					calif4=entrada.nextDouble();
					entrada.nextLine();
					

					if(calif4>calif_alta){
					materia_alta=materia4;
					calif_alta=calif4;
					} else if(calif4<calif_baja){
					materia_baja=materia4;
					calif_baja=calif4;
					}

					if(calif4>=0 & calif4<=10 & materia4.length()==4){
					System.out.print("calificacion no valida");
								

					promedio=(calif1 + calif2 + calif3 + calif4)/4;
						System.out.println("calificaciones de "+ nombre_alumno+ ": \n"+ materia1 + " : "+calif1+", "+calif2+", "+calif3+", "+calif4+"\npromedio: "+promedio);

			// condicional

					if(promedio>=9 & promedio<=10){
						System.out.println("EXCELENTE");
						} else if(promedio<9 & promedio>=8){
					System.out.println("MUY BIEN");
					} else if(promedio<8 & promedio>=6){
					System.out.println("BIEN");
					} else{
					System.out.println("REPROBADO");
					}		
			
				
				System.out.println("promedio redondeado:\nround:" + Math.round(promedio) + "\nfloor" + Math.floor(promedio) + "\nCeil" + Math.ceil(promedio) + "\nMateria alta: " + materia_alta + "\nCalificacion alta: " + calif_alta + "\nMateria baja: " + materia_baja + "\ncalificacion baja: " + calif_baja);
					
					} else{
					System.out.print("dato no valido 2");
			} 
					} else{
					System.out.print("dato no valido 3");
			} 
					} else{
			System.out.print("dato no valido 4");
			}

			 
			
	} else{
            System.out.println("DATOS NO VALIDOS; ingresa datos correctos");
	}

//lave de cierre de for (ciclo)
	}

	
 }
}




