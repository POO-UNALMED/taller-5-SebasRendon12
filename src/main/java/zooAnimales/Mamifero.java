package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public Mamifero() {
		listado.add(this);
	}

	public List<Mamifero> getListado() {
		return listado;
	}

	public void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public int getLeones() {
		return leones;
	}

	public void setLeones(int leones) {
		Mamifero.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static int cantidadMamiferos() {
		if (listado.isEmpty()) {
			return 0;
		} else {
			return listado.size();
		}
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero newMamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return newMamifero;
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero newMamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return newMamifero;
	}
}
