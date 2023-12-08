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
   		
   		int IDCliente = 0;
   		
	   	Cliente misClientes[] = new Cliente[1000];
	   	
    	Hotel miHotel[] = new Hotel[1];
    	miHotel[0] = new Hotel ("Costa del Sol", "Su Casita", "5 Estrellas", "696969",
    			"+69 696969", "hotel@gmail.com", misClientes);
   		
   		while(seguir) {

   			System.out.println("  --------------------------");
   			System.out.println(" |Hotel de la costa del sol |");
   			System.out.println("  --------------------------");
   			System.out.println("");
   			System.out.println("A: Mostrar una lista de todos los clientes por pantalla");
   			System.out.println("B: Crear un cliente nuevo");
   			System.out.println("C: Eliminar un cliente existente");
   			System.out.println("D: Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad");
   			System.out.println("(Cualquier otro): Salir");

   			respuesta = sc.nextLine();

   //PROGRAMA A ------------------------------------------------------------------------------------------------------------------------------

   			if (respuesta.compareToIgnoreCase("a") == 0) {
   				
   				int cont;
   				
   				System.out.println("Lista de Clientes:");
   				
   				for (cont = 0; cont < IDCliente; cont++) {
   					
   					System.out.println(misClientes[cont]);
   					
   				}
   				
   				if (cont == 0) {
   					System.out.println("No existe ningún cliente");
   				}

   //PROGRAMA B ------------------------------------------------------------------------------------------------------------------------------				
   			} else if(respuesta.compareToIgnoreCase("b") == 0) {
   				
   				String nombre = nombreAñadeCliente();
   				String apellido1 = apellido1AñadeCliente();
   				String apellido2 = apellido2AñadeCliente();
   				String direccion = direccionAñadeCliente();
   				String dni = dniAñadeCliente();
   				String telefono = telefonoAñadeCliente();
   				String email = emailAñadeCliente();
   				int edad = edadAñadeCliente();
   				String nacimiento = nacimientoAñadeCliente();

   				Cliente nuevoCliente[] = new Cliente[1000];
   		   		nuevoCliente[IDCliente] = new Cliente (nombre, apellido1, apellido2, direccion, dni, telefono, email, edad, nacimiento);
   		   		
   		   		misClientes[IDCliente] = nuevoCliente[IDCliente];
   		   	
   		   		System.out.println("Nuevo Cliente:");
   		   		System.out.println(nuevoCliente[IDCliente]);
   		   	
   				IDCliente++;

   //PROGRAMA C ------------------------------------------------------------------------------------------------------------------------------				


   			} else if(respuesta.compareToIgnoreCase("c") == 0) {


   //PROGRAMA D	------------------------------------------------------------------------------------------------------------------------------
   				
   			} else if(respuesta.compareToIgnoreCase("d") == 0) {

   //SALIR	----------------------------------------------------------------------------------------------------------------------------------
   			} else {
   				
   				seguir = false;

   			}
   			
   			if (seguir) {
   				pulsaEnter();
   			}

   		}	
    	
    	sc.close();
        
    }
	
    public static String dniAñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce el DNI");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String nombreAñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce tu Nombre");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String apellido1AñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce tu Primer Apellido");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String apellido2AñadeCliente() {
	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce tu Segundo Apellido");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String direccionAñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce tu Direccion");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String emailAñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce el Email");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String telefonoAñadeCliente() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce el Teléfono");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }

	public static int edadAñadeCliente() {
	
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static String nacimientoAñadeCliente() {
		
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
	
		System.out.println("Introduce la Fecha de Nacimiento");
	
		respuesta = sc.nextLine();
	
		return respuesta;
		
	}
	
	public static void pulsaEnter() {
		
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		
		System.out.println("Pulsa ENTER para volver al menú...");
		respuesta = sc.nextLine();
			
	}
}
