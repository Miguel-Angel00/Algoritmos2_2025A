package biblioteca.model;

public class Libro {
	
	private String titulo, editorial, isbn, genero;

	public Libro(String titulo, String editorial, String isbn, String genero) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.isbn = isbn;
		this.genero = genero;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}

