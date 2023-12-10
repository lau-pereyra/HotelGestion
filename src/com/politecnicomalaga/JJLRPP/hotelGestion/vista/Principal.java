package com.politecnicomalaga.JJLRPP.hotelGestion.vista;

import java.util.Scanner;
import com.politecnicomalaga.JJLRPP.hotelGestion.controlador.Controlador;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Cliente;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Hotel;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Promocion;

public class Principal {
	
    public static void main(String[] args) {
    	
   		Scanner sc = new Scanner(System.in);
   		boolean seguir = true;
   		String respuesta;
   		
   		Cliente[] misClientes = Hotel.crearClientes();
   		int IDCliente = 0 , IDPromo= 0;
   		
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
   				
				Controlador.programaA(IDCliente, misClientes);

   //PROGRAMA B ------------------------------------------------------------------------------------------------------------------------------	
				
   			} else if(respuesta.compareToIgnoreCase("b") == 0) {
   				
   				Controlador.programaB(sc, IDCliente, misClientes);
   				IDCliente++;

   //PROGRAMA C ------------------------------------------------------------------------------------------------------------------------------				


   			} else if(respuesta.compareToIgnoreCase("c") == 0) {
   				
   				Controlador.programaC(IDCliente, misClientes);
   				IDCliente--;
   				
   //PROGRAMA D	------------------------------------------------------------------------------------------------------------------------------
   				
   			} else if(respuesta.compareToIgnoreCase("d") == 0) {
   				
   				Controlador.programaD(sc, IDPromo);
   				IDPromo++;
                
   //SALIR	----------------------------------------------------------------------------------------------------------------------------------
                
   			} else {
   				
   				seguir = false;

   			}
   			
   			if (seguir) {
   				
   				pulsaEnter(sc);
   				
   			}

   		}	
    	
    	sc.close();
        
    }
	
    public static String dniAñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce el DNI");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String nombreAñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce tu Nombre");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String apellido1AñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce tu Primer Apellido");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String apellido2AñadeCliente(Scanner sc) {
	
    	String respuesta;
    	
    	System.out.println("Introduce tu Segundo Apellido");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String direccionAñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce tu Direccion");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String emailAñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce el Email");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
    
    public static String telefonoAñadeCliente(Scanner sc) {
    	
    	String respuesta;
    	
    	System.out.println("Introduce el Teléfono");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }

	public static int edadAñadeCliente(Scanner sc) {
	
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static String nacimientoAñadeCliente(Scanner sc) {
		
		String respuesta = "";
	
		System.out.println("Introduce la Fecha de Nacimiento");
	
		respuesta = sc.nextLine();
	
		return respuesta;
		
	}
	
	public static void pulsaEnter(Scanner sc) {
		
		System.out.println("Pulsa ENTER para volver al menú...");
		@SuppressWarnings("unused")
		String respuesta = sc.nextLine();
			
	}
	
	public static int edadMaxAñadePromo(Scanner sc) {
		
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad Maxima para la promocion");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static int edadMinAñadePromo(Scanner sc) {
		
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad Minima para la promocion");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static String nombreAñadePromo(Scanner sc) {
    	
    	String respuesta = "";
    	
    	System.out.println("Introduce un Nombre para la promocion.");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }
	
	public static void imprimirPromocion(int IDPromo, Promocion[] nuevaPromo) {
    	
		System.out.println("Nueva Promocion:");
		separadores();
	    System.out.println(nuevaPromo[IDPromo]);
	    separadores();
    	
    }
	
	public static void imprimirCrearCliente(int IDCliente, Cliente[] misClientes) {
    	
		System.out.println("Nuevo Cliente:");
	   	separadores();
	   	System.out.println(misClientes[IDCliente]);
	   	separadores();
    	
    }
	
	public static void imprimirBorrarCliente(int IDCliente, Cliente[] misClientes) {
    	
		System.out.println("Cliente Eliminado:");
		separadores();
	   	System.out.println(misClientes[IDCliente-1]);
	   	separadores();
    	
    }
	
	public static void imprimirNoBorrarCliente() {
    	
		separadores();
		System.out.println("No existe ningún cliente");
	   	separadores();
    	
    }
	
	public static void imprimirListadoCliente(int IDCliente, Cliente[] misClientes) {
    	
		int cont;
		
		System.out.println("Lista de Clientes:");
		separadores();
			
		for (cont = 0; cont < IDCliente; cont++) {
				
			if(misClientes[cont] != null) {
				
				System.out.println(misClientes[cont]);	
				separadores();
				
			}
				
		}
			
		if (cont == 0) {
				
			System.out.println("No existe ningún cliente");
			separadores();
				
		}
    	
    }
	
	public static void separadores() {
		
		System.out.println("----------------------------");
		
	}
	
}
