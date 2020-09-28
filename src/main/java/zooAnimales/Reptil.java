package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil() {
		listado.add(this);
	}

	public List<Reptil> getListado() {
		return listado;
	}

	public void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}

	public int getIguanas() {
		return iguanas;
	}

	public void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public int getSerpientes() {
		return serpientes;
	}

	public void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static int cantidadReptiles() {
		if (listado.isEmpty()) {
			return 0;
		} else {
			return listado.size();
		}
	}

	public String movimiento() {
		return "reptar";
	}

	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil newReptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return newReptil;
	}

	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil newReptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return newReptil;
	}
}
