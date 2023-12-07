package com.politecnicomalaga.JJLRPP.hotelGestion.vista;

import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Cliente;

import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Hotel;

public class Principal {
    
    public static void main(String[] args) {
        
        /*Hotel de la costa del sol

        MENU:

        - Mostrar una lista de todos los clientes por pantalla.
        - Crear un cliente nuevo.
        - Eliminar un cliente existente
        - Crear una promoción para los clientes de edades entre un mínimo y un máximo de edad*/
        
        //ESCANER PEDIR DATOS
        //private Controlador trabajador;
    	
    	Cliente misClientes[] = new Cliente[1];
    	Hotel miHotel[] = new Hotel[1];
    	
    	miHotel[0] = new Hotel ("Costa del Sol", "Su Casita", "Pito", "696969",
    			"+69 696969", "hotel@gmail.com", misClientes);	
    	
    	misClientes[0] = new Cliente ("Juan", "Martínez", "Pérez", "Su Casa", "33", "+33 3333",
    			"juanito@gmail.com", 33, "33/33/3333");
    	
    	System.out.println(miHotel[0]);
    	System.out.println(misClientes[0]);
        
    }
    
}
