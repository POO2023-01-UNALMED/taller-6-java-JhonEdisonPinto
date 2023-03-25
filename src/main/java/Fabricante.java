package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int Mventas;
	
	public Fabricante(){
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		this.pais.setVFabricados(this.pais.getVFabricados()+1);
		this.Mventas=0;
		fabricante.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	public int getMventas() {
		return Mventas;
	}
	public void setMventas(int Mventas) {
		this.Mventas=Mventas;
	}
	
	private static ArrayList<Fabricante> fabricante = new ArrayList<Fabricante>();
	
	public static Fabricante fabricaMayorVentas() {
		int primero =0;
		int MasVendedor = 0;
		for(int i=0; i < fabricante.size();i++) {
			if(fabricante.get(i).getMventas() > primero) {
				primero= fabricante.get(i).getMventas();
				MasVendedor=i;
			}
		}
		return fabricante.get(MasVendedor);
	}
	
	}
	
	
