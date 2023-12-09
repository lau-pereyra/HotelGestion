package com.politecnicomalaga.JJLRPP.hotelGestion.modelo;

import java.util.Scanner;

public class Promocion {

	private int edadMax;
	private int edadMin;
	private String nombrePromo;
	
	
	
	public Promocion(int edadMax, int edadMin, String nombrePromo) {
		this.edadMax = edadMax;
		this.edadMin = edadMin;
		this.setNombrePromo(nombrePromo);
	}
	
public static int edadMaxAñadePromo() {
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad Maxima para la promocion");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static int edadMinAñadePromo() {
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int iRespuesta;
	
		System.out.println("Introduce la Edad Minima para la promocion");
	
		respuesta = sc.nextLine();
		iRespuesta = Integer.valueOf(respuesta);
	
		return iRespuesta;
		
	}
	
	public static String nombreAñadePromo() {
    	
    	Scanner sc = new Scanner(System.in);
    	String respuesta = "";
    	
    	System.out.println("Introduce un Nombre para la promocion.");
    	
    	respuesta = sc.nextLine();
    	
    	return respuesta;
    	
    }

	public String getNombrePromo() {
		return nombrePromo;
	}

	public void setNombrePromo(String nombrePromo) {
		this.nombrePromo = nombrePromo;
	}
	
	public int getEdadMax() {
		return edadMax;
	}

	public void setEdadMax(int edadMax) {
		this.edadMax = edadMax;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}
	
	public String toString() {
        return "- Nobmbre: " + nombrePromo + "\n" + "- Edad Minima: " + edadMin + "\n" + "- Edad Maxima: "
        		+ edadMax ;
    }
	
	
}
