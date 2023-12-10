package com.politecnicomalaga.JJLRPP.hotelGestion.vista;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Promocion;
import java.util.Scanner;
import com.politecnicomalaga.JJLRPP.hotelGestion.controlador.Controlador;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Cliente;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Hotel;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Promocion;

public class Principal {
	
    public static void main(String[] args) {
<<<<<<< HEAD
        //private Controlador trabajador;
   		boolean seguir = true;
   		String respuesta ;
   		Scanner sc = new Scanner(System.in);
   		Cliente nuevoCliente[] = new Cliente[1000];
   		   		
   		int IDCliente = 0 , IDPromo= 0;
   		
	   	Cliente misClientes[] = new Cliente[1000];
	   	
    	Hotel miHotel[] = new Hotel[1];
    	miHotel[0] = new Hotel ("Costa del Sol", "Su Casita", "5 Estrellas", "696969",
    			"+69 696969", "hotel@gmail.com", misClientes);
=======
    	
   		Scanner sc = new Scanner(System.in);
   		boolean seguir = true;
   		String respuesta;
   		
   		Cliente[] misClientes = Hotel.crearClientes();
   		int IDCliente = 0 , IDPromo= 0;
>>>>>>> b2e530eaec8ec1ce98a70906a5df19a1cf20035d
   		
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
   				
<<<<<<< HEAD
   				int cont;
   				
   				System.out.println("Lista de Clientes:");
   				
   				for (cont = 0; cont < IDCliente; cont++) {
   					
   					if(misClientes[cont] != null) {
   						System.out.println(misClientes[cont]);	
   					}
   					
   				}
   				
   				if (cont == 0) {
   					System.out.println("No existe ningún cliente");
   				}
=======
				Controlador.programaA(IDCliente, misClientes);
>>>>>>> b2e530eaec8ec1ce98a70906a5df19a1cf20035d

   //PROGRAMA B ------------------------------------------------------------------------------------------------------------------------------	
				
   			} else if(respuesta.compareToIgnoreCase("b") == 0) {
   				
<<<<<<< HEAD
   				String nombre = nombreAñadeCliente();
   				String apellido1 = apellido1AñadeCliente();
   				String apellido2 = apellido2AñadeCliente();
   				String direccion = direccionAñadeCliente();
   				String dni = dniAñadeCliente();
   				String telefono = telefonoAñadeCliente();
   				String email = emailAñadeCliente();
   				int edad = edadAñadeCliente();
   				String nacimiento = nacimientoAñadeCliente();
   				
   		   		nuevoCliente[IDCliente] = new Cliente (nombre, apellido1, apellido2, direccion, dni, telefono, email, edad, nacimiento);
   		   		
   		   		misClientes[IDCliente] = nuevoCliente[IDCliente];
   		   	
   		   		System.out.println("Nuevo Cliente:");
   		   		System.out.println(nuevoCliente[IDCliente]);
   		   	
=======
   				Controlador.programaB(sc, IDCliente, misClientes);
>>>>>>> b2e530eaec8ec1ce98a70906a5df19a1cf20035d
   				IDCliente++;

   //PROGRAMA C ------------------------------------------------------------------------------------------------------------------------------				


   			} else if(respuesta.compareToIgnoreCase("c") == 0) {
   				
<<<<<<< HEAD
   				
   				System.out.println("Cliente actual:");
   		   		System.out.println(nuevoCliente[IDCliente-1]);
   				
   				nuevoCliente[IDCliente-1] = null;
   				misClientes[IDCliente-1] = nuevoCliente[IDCliente-1];
   				System.out.println("Cliente eliminado con exito!");
=======
   				Controlador.programaC(IDCliente, misClientes);
   				IDCliente--;
>>>>>>> b2e530eaec8ec1ce98a70906a5df19a1cf20035d
   				
   //PROGRAMA D	------------------------------------------------------------------------------------------------------------------------------
   				
   			} else if(respuesta.compareToIgnoreCase("d") == 0) {
   				
<<<<<<< HEAD
   				int edadMin = Promocion.edadMinAñadePromo();
                int edadMax = Promocion.edadMaxAñadePromo();
                String nombrePromo = Promocion.nombreAñadePromo();

                Promocion nuevaPromo[] = new Promocion[20];
                   nuevaPromo[IDPromo] = new Promocion ( edadMax, edadMin, nombrePromo);
                   
                   System.out.println("Nueva Promocion:");
                System.out.println(nuevaPromo[IDPromo]);
            
                IDPromo++;
=======
   				Controlador.programaD(sc, IDPromo);
   				IDPromo++;
                
>>>>>>> b2e530eaec8ec1ce98a70906a5df19a1cf20035d
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