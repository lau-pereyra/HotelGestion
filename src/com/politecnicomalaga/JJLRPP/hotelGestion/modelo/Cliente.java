package com.politecnicomalaga.JJLRPP.hotelGestion.modelo;

public class Cliente {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String dni;
    private String telefono;
    private String email;
    private int edad;
    private String fechaNacimiento;

	public Cliente(String nombre, String apellido1, String apellido2, String direccion, String dni, String telefono,
			String email, int edad, String fechaNacimiento) {
		
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
    
	public String toString() {
        return "Cliente: " + nombre + " " + apellido1;
    }
	
}
