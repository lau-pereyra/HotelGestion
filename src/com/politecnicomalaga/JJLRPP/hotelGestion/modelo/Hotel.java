package com.politecnicomalaga.JJLRPP.hotelGestion.modelo;

import java.util.Scanner;
import com.politecnicomalaga.JJLRPP.hotelGestion.vista.Principal;

public class Hotel {

	private static final int NUM_CLIENTES_MAX = 1000;
	
    private String nombre;
    private String direccion;
    private String descripcion;
    private String codigoPostal;
    private String telefono;
    private String email;
    
    public Hotel(String nombre, String direccion, String descripcion, String codigoPostal, 
            String telefono, String email) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.email = email;
        
    }
    
    public static Cliente[] crearClientes() {
    	Cliente misClientes[] = new Cliente[NUM_CLIENTES_MAX];
        return misClientes;
    }
	
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void listadoCliente(int IDCliente, Cliente[] misClientes) {
		
		Principal.imprimirListadoCliente(IDCliente, misClientes);
    	
	}
    
    public static void añadirCliente(Scanner sc, int IDCliente, Cliente[] misClientes) {
		
		String nombre = Principal.nombreAñadeCliente(sc);
		String apellido1 = Principal.apellido1AñadeCliente(sc);
		String apellido2 = Principal.apellido2AñadeCliente(sc);
		String direccion = Principal.direccionAñadeCliente(sc);
		String dni = Principal.dniAñadeCliente(sc);
		String telefono = Principal.telefonoAñadeCliente(sc);
		String email = Principal.emailAñadeCliente(sc);
		int edad = Principal.edadAñadeCliente(sc);
		String nacimiento = Principal.nacimientoAñadeCliente(sc);
		
		misClientes[IDCliente] = new Cliente (nombre, apellido1, apellido2, direccion, dni, telefono, email, edad, nacimiento);
		
		Principal.imprimirCrearCliente(IDCliente, misClientes);
		
	}
	
	public static void eliminarCliente(int IDCliente, Cliente[] misClientes) {
		
		if (IDCliente-1<=0) {
			
			Principal.imprimirNoBorrarCliente();
			
		} else {
			
			Principal.imprimirBorrarCliente(IDCliente, misClientes);
			misClientes[IDCliente-1] = null;
			
		}
		
	}

	public static void crearPromocion(Scanner sc, int IDPromo) {
		
		int edadMin = Principal.edadMinAñadePromo(sc);
	    int edadMax = Principal.edadMaxAñadePromo(sc);
	    String nombrePromo = Principal.nombreAñadePromo(sc);

	    Promocion nuevaPromo[] = new Promocion[20];
	    nuevaPromo[IDPromo] = new Promocion (edadMax, edadMin, nombrePromo);
	    
	    Principal.imprimirPromocion(IDPromo, nuevaPromo);
		
	}

}
