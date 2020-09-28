package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	private static List<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public Ave() {
		listado.add(this);
	}

	public List<Ave> getListado() {
		return listado;
	}

	public void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public int getHalcones() {
		return halcones;
	}

	public void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public int getAguilas() {
		return aguilas;
	}

	public void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static int cantidadAves() {
		if (listado.isEmpty()) {
			return 0;
		} else {
			return listado.size();
		}
	}

	public String movimiento() {
		return "volar";
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave newAve = new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
		halcones++;
		return newAve;
	}

	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave newAve = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return newAve;
	}
}
