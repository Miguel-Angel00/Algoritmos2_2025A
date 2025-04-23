package parcia_2_poo;

public class Trenes {
    private int id_tren;
    private String tipo_carga;
    private int carga_max = 10; // Definido como máximo
    private int carga_actual;

    public Trenes(int id_tren, String tipo_carga, int carga_actual) {
        this.id_tren = id_tren;
        this.tipo_carga = tipo_carga;
        this.carga_actual = carga_actual;
    }

    public int getId_tren() {
        return id_tren;
    }

    public void setId_tren(int id_tren) {
        this.id_tren = id_tren;
    }

    public String getTipo_carga() {
        return tipo_carga;
    }

    public void setTipo_carga(String tipo_carga) {
        this.tipo_carga = tipo_carga;
    }

    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }

    public int getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(int carga_actual) {
        this.carga_actual = carga_actual;
    }
}
