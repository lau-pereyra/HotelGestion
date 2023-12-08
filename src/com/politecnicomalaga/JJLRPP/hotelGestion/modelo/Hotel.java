package com.politecnicomalaga.JJLRPP.hotelGestion.modelo;
public class Hotel {
    
    private static final int NUM_CLIENTES_MAX = 1000;

    private String nombre;
    private String direccion;
    private String descripcion;
    private String codigoPostal;
    private String telefono;
    private String email;

    private Cliente[] misClientes;
    
    public Hotel(String nombre, String direccion, String descripcion, String codigoPostal, 
            String telefono, String email, Cliente[] misClientes) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.email = email;
        
        this.misClientes = new Cliente[NUM_CLIENTES_MAX];
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
    
    public String toString() {
        return "Hotel: " + nombre + ", Dirección: " + direccion;
    }
    
    public Cliente[] listaDeClientes() {
        
        Cliente[] copia;
        
        copia = new Cliente[NUM_CLIENTES_MAX];
        
        // Aquí hay que copiar cada uno de mis clientes a la nueva lista ARRAY
        
        return copia;
    }
    
    public boolean add(Cliente nuevoCliente) {
        
    	boolean bContinuar = true;
    	
        for (int i = 0; i< NUM_CLIENTES_MAX && bContinuar == true; i++) {
        	
            if (misClientes[i] == null) {
            	System.out.println("Ingresa tu Nombre");
            	
            	
            	
            	
            	
            	
            	
                misClientes[i] = nuevoCliente;  
                bContinuar = false;
                return true;
                //Variable busqueda mas facil?
                
                
                
                
                
                
                
            }
            
        }
        
        return false;
        
    }

}
