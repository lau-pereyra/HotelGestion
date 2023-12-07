package com.politecnicomalaga.JJLRPP.hotelGestion.vista;

import java.util.Scanner;

import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Cliente;

import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Hotel;

public class Principal {
    
    public static void main(String[] args) {
    	
        //private Controlador trabajador;
   		boolean seguir = true;
   		String respuesta ;
   		Scanner sc = new Scanner(System.in);

   		while(seguir) {

   			System.out.println("  --------------------------");
   			System.out.println(" |Hotel de la costa del sol |");
   			System.out.println("  --------------------------");
   			System.out.println("");
   			System.out.println("A: Mostrar una lista de todos los clientes por pantalla");
   			System.out.println("B: Crear un cliente nuevo");
   			System.out.println("C: Eliminar un cliente existente");
   			System.out.println("D: Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad");
   			System.out.println("E: Test");
   			System.out.println("(Cualquier otro): Salir");

   			respuesta = sc.nextLine();

   //PROGRAMA A ------------------------------------------------------------------------------------------------------------------------------

   			if (respuesta.compareToIgnoreCase("a") == 0) {

   				System.out.println("Pulsa intro para volver al menu...");
   				respuesta = sc.nextLine();

   //PROGRAMA B ------------------------------------------------------------------------------------------------------------------------------				
   			} else if(respuesta.compareToIgnoreCase("b") == 0) {

   				System.out.println("Pulsa intro para volver al menu...");
   				respuesta = sc.nextLine();

   //PROGRAMA C ------------------------------------------------------------------------------------------------------------------------------				


   			} else if(respuesta.compareToIgnoreCase("c") == 0) {

   				System.out.println("Pulsa intro para volver al menu...");
   				respuesta = sc.nextLine();


   //PROGRAMA D	------------------------------------------------------------------------------------------------------------------------------
   			} else if(respuesta.compareToIgnoreCase("d") == 0) {

   				
   				
   //PROGRAMA E	------------------------------------------------------------------------------------------------------------------------------
   				
   			} else if(respuesta.compareToIgnoreCase("e") == 0) {
   				
   				Cliente misClientes[] = new Cliente[1];
   		    	Hotel miHotel[] = new Hotel[1];
   		    	
   		    	miHotel[0] = new Hotel ("Costa del Sol", "Su Casita", "Pito", "696969",
   		    			"+69 696969", "hotel@gmail.com", misClientes);	
   		    	
   		    	misClientes[0] = new Cliente ("Juan", "Martínez", "Pérez", "Su Casa", "33", "+33 3333",
   		    			"juanito@gmail.com", 33, "33/33/3333");
   		    	
   		    	System.out.println(miHotel[0]);
   		    	System.out.println(misClientes[0]);

   				System.out.println("Pulsa intro para volver al menu...");
   				respuesta = sc.nextLine();

   //SALIR	----------------------------------------------------------------------------------------------------------------------------------
   			} else {
   				
   				seguir = false;

   			}

   		}	
    	
    	sc.close();
        
    }
    
}
