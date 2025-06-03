package module_main;

public class Contacto {
    private String nombre;
    private String ciudad;
    private String telefono;
    private int anioNacimiento;
    private String etiqueta;

    public Contacto(String nombre, String ciudad, String telefono, int anioNacimiento, String etiqueta) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.anioNacimiento = anioNacimiento;
        this.setEtiqueta(etiqueta);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
    	if (telefono.matches("\\d+")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono solo debe contener números.");
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
    	 if (anioNacimiento >= 1925 && anioNacimiento <= 2025) {
             this.anioNacimiento = anioNacimiento;
         } else {
             throw new IllegalArgumentException("El año de nacimiento debe estar entre 1925 y 2025.");
         }
     }

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
}
