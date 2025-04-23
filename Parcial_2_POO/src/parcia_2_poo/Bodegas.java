package parcia_2_poo;

public class Bodegas {
    private int id_bodega;
    private int capacidad_trenes = 5;
    private int capacidad_ton = 10;
    private String tipo_almacenamiento;
    private int cap_ton_actual = 0;
    private int cap_tren_actual = 0;

    public Bodegas(int id_bodega, String tipo_almacenamiento) {
        this.id_bodega = id_bodega;
        this.tipo_almacenamiento = tipo_almacenamiento;
    }

    public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getTipo_almacenamiento() {
        return tipo_almacenamiento;
    }

    public void setTipo_almacenamiento(String tipo_almacenamiento) {
        this.tipo_almacenamiento = tipo_almacenamiento;
    }

    public int getCapacidad_trenes() {
        return capacidad_trenes;
    }

    public void setCapacidad_trenes(int capacidad_trenes) {
        this.capacidad_trenes = capacidad_trenes;
    }

    public int getCapacidad_ton() {
        return capacidad_ton;
    }

    public void setCapacidad_ton(int capacidad_ton) {
        this.capacidad_ton = capacidad_ton;
    }

    public int getCap_ton_actual() {
        return cap_ton_actual;
    }

    public void setCap_ton_actual(int cap_ton_actual) {
        this.cap_ton_actual = cap_ton_actual;
    }

    public int getCap_tren_actual() {
        return cap_tren_actual;
    }

    public void setCap_tren_actual(int cap_tren_actual) {
        this.cap_tren_actual = cap_tren_actual;
    }
}
