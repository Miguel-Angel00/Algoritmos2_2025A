package module_main;

public class Contacto {
    private String nombre;
    private String ciudad;
    private String telefono;
    private int anioNacimiento;

    public Contacto(String nombre, String ciudad, String telefono, int anioNacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.anioNacimiento = anioNacimiento;
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
        this.telefono = telefono;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
}
