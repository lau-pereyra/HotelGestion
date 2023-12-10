package com.politecnicomalaga.JJLRPP.hotelGestion.controlador;

import java.util.Scanner;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Cliente;
import com.politecnicomalaga.JJLRPP.hotelGestion.modelo.Hotel;

public class Controlador {
	
	public static void programaA(int IDCliente, Cliente[] misClientes) {
		
		Hotel.listadoCliente(IDCliente, misClientes);
		
	}
	
	public static void programaB(Scanner sc, int IDCliente, Cliente[] misClientes) {
		
		Hotel.añadirCliente(sc, IDCliente, misClientes);
		
	}
	
	public static void programaC(int IDCliente, Cliente[] misClientes) {
		
		Hotel.eliminarCliente(IDCliente, misClientes);
		
	}

	public static void programaD(Scanner sc, int IDPromo) {
		
		Hotel.crearPromocion(sc, IDPromo);
		
	}
	
}