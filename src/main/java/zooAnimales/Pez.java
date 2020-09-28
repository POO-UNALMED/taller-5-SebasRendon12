package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	private static List<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez() {
		listado.add(this);
	}

	public List<Pez> getListado() {
		return listado;
	}

	public void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static int cantidadPeces() {
		if (listado.isEmpty()) {
			return 0;
		} else {
			return listado.size();
		}
	}

	public String movimiento() {
		return "nadar";
	}

	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez newPez = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return newPez;
	}

	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez newPez = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return newPez;
	}
}
