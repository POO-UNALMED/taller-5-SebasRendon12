package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio() {
		listado.add(this);
	}

	public static List<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static int cantidadAnfibios() {
		if (listado.isEmpty()) {
			return 0;
		} else {
			return listado.size();
		}
	}

	public String movimiento() {
		return "saltar";
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio newAnfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return newAnfibio;
	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio newAnfibio = new Anfibio(nombre, edad, "selva", genero, "negro", false);
		salamandras++;
		return newAnfibio;
	}
}
