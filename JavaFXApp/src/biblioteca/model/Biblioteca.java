package biblioteca.model;


import java.util.*;
public class Biblioteca {
	
	private ArrayList<Libro> libros;
	

	public Biblioteca(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public Biblioteca() {
		libros = new ArrayList<Libro>();
		
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
 
}
