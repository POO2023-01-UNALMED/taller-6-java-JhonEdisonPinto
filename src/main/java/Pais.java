package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int Vfabricados;
	
	public Pais(String nombre) {
		this.nombre=nombre;
		this.Vfabricados=0;
		pais.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getVFabricados() {
		return Vfabricados;
	}
	public void setVFabricados(int fabricas) {
		this.Vfabricados=fabricas;
	}
	
	private static ArrayList<Pais> pais = new ArrayList<Pais>();

	public static Pais paisMasVendedor() {
		int primero =0;
		int MasVendedor = 0;
		for(int i=0; i < pais.size();i++) {
			if(pais.get(i).getVFabricados() > primero) {
				primero= pais.get(i).getVFabricados();
				MasVendedor=i;
			}
		}
		return pais.get(MasVendedor);
	}
}
