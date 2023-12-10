package com.politecnicomalaga.JJLRPP.hotelGestion.modelo;

public class Promocion {

	private int edadMax;
	private int edadMin;
	private String nombrePromo;
	
	public Promocion(int edadMax, int edadMin, String nombrePromo) {
		this.edadMax = edadMax;
		this.edadMin = edadMin;
		this.setNombrePromo(nombrePromo);
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
        return "- Nombre: " + nombrePromo + "\n" + "- Edad Mínima: " + edadMin + "\n" + "- Edad Máxima: "
        		+ edadMax ;
    }
	
	
}
