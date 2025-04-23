package parcia_2_poo;

import java.util.Scanner;

public class Principal {

    public static void clear() {
        for (int i = 0; i <= 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bodegas[] bodegas = new Bodegas[10];
        Trenes[] trenes = new Trenes[10];
        int[] ids_ocupados = new int[10];
        int[] ids_trenes = new int[10];

        boolean continuar = true;

        while (continuar) {
            System.out.println("A. crear nueva bodega");
            System.out.println("B. crear nuevo tren");
            System.out.println("C. gestionar bodegas");
            System.out.println("D. salir");

            String opcion = sc.nextLine().toUpperCase();

            if (opcion.equals("A")) {
                clear();
                String tipo_bodega = null;
                int id_bodega = 0;

                while (tipo_bodega == null || id_bodega == 0) {
                    if (tipo_bodega == null) {
                        System.out.println("ingrese el tipo de bodega");
                        System.out.println("A. alimentos");
                        System.out.println("B. insumos quimicos");
                        String tipo = sc.nextLine().toUpperCase();

                        if (tipo.equals("A")) {
                            tipo_bodega = "alimentos";
                        } else if (tipo.equals("B")) {
                            tipo_bodega = "insumos quimicos";
                        }
                    }

                    if (id_bodega == 0) {
                        System.out.println("ingrese el id de la bodega entre 1 y 10");
                        int id = sc.nextInt();
                        sc.nextLine();

                        if (id < 1 || id > 10) {
                            System.out.println("id fuera de rango");
                        } else if (ids_ocupados[id - 1] != 0) {
                            System.out.println("ya existe una bodega con ese id");
                        } else {
                            ids_ocupados[id - 1] = id;
                            id_bodega = id;
                        }
                    }
                }

                bodegas[id_bodega - 1] = new Bodegas(id_bodega, tipo_bodega);
                System.out.println("bodega creada correctamente");

            } else if (opcion.equals("B")) {
                clear();
                System.out.println("crear nuevo tren");

                int id_tren = 0;
                while (id_tren == 0) {
                    System.out.println("ingrese id del tren [1 - 10]");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (id < 1 || id > 10) {
                        System.out.println("id fuera de rango");
                    } else if (ids_trenes[id - 1] != 0) {
                        System.out.println("ya existe un tren con ese id");
                    } else {
                        ids_trenes[id - 1] = id;
                        id_tren = id;
                    }
                }

                String tipo_carga = null;
                while (tipo_carga == null) {
                    System.out.println("ingrese tipo de carga del tren");
                    System.out.println("A. alimentos");
                    System.out.println("B. insumos quimicos");
                    String tipo = sc.nextLine().toUpperCase();

                    if (tipo.equals("A")) {
                        tipo_carga = "alimentos";
                    } else if (tipo.equals("B")) {
                        tipo_carga = "insumos quimicos";
                    }
                }

                System.out.println("ingrese la carga actual del tren");
                int carga_actual = sc.nextInt();
                sc.nextLine();

                Trenes nuevo_tren = new Trenes(id_tren, tipo_carga, carga_actual);
                trenes[id_tren - 1] = nuevo_tren;
                System.out.println("tren creado correctamente");

            } else if (opcion.equals("C")) {
                clear();
                System.out.println("gestionar bodegas");
                System.out.println("ingrese id de la bodega a gestionar [1 - 10]");
                int id = sc.nextInt();
                sc.nextLine();

                if (id < 1 || id > 10 || bodegas[id - 1] == null) {
                    System.out.println("no existe una bodega con ese id");
                    continue;
                }

                Bodegas bodega = bodegas[id - 1];

                System.out.println("tipo de carga de la bodega: " + bodega.getTipo_almacenamiento());
                System.out.println("uso actual en toneladas: " + bodega.getCap_ton_actual() + " / " + bodega.getCapacidad_ton());
                System.out.println("uso actual en trenes: " + bodega.getCap_tren_actual() + " / " + bodega.getCapacidad_trenes());

                System.out.println("A. recibir tren");
                System.out.println("B. dar salida a tren");
                System.out.println("C. volver");

                String subopcion = sc.nextLine().toUpperCase();

                if (subopcion.equals("A")) {
                    System.out.println("ingrese id del tren que desea ingresar [1 - 10]");
                    int id_tren = sc.nextInt();
                    sc.nextLine();

                    if (id_tren < 1 || id_tren > 10 || trenes[id_tren - 1] == null) {
                        System.out.println("tren no existe");
                        continue;
                    }

                    Trenes tren = trenes[id_tren - 1];

                    if (!tren.getTipo_carga().equals(bodega.getTipo_almacenamiento())) {
                        System.out.println("tipo de carga incompatible");
                    } else if (bodega.getCap_tren_actual() >= bodega.getCapacidad_trenes()) {
                        System.out.println("la bodega ya esta llena en trenes");
                    } else if (bodega.getCap_ton_actual() + tren.getCarga_actual() > bodega.getCapacidad_ton()) {
                        System.out.println("la bodega no tiene espacio suficiente en toneladas");
                    } else {
                        bodega.setCap_tren_actual(bodega.getCap_tren_actual() + 1);
                        bodega.setCap_ton_actual(bodega.getCap_ton_actual() + tren.getCarga_actual());
                        trenes[id_tren - 1] = null;
                        ids_trenes[id_tren - 1] = 0;
                        System.out.println("tren recibido en la bodega");
                    }

                } else if (subopcion.equals("B")) {
                    if (bodega.getCap_tren_actual() == 0) {
                        System.out.println("no hay trenes en la bodega");
                    } else {
                        System.out.println("ingrese toneladas del tren que va a salir");
                        int carga_salida = sc.nextInt();
                        sc.nextLine();

                        if (carga_salida <= 0 || carga_salida > bodega.getCap_ton_actual()) {
                            System.out.println("carga invalida");
                        } else {
                            bodega.setCap_tren_actual(bodega.getCap_tren_actual() - 1);
                            bodega.setCap_ton_actual(bodega.getCap_ton_actual() - carga_salida);
                            System.out.println("tren ha salido de la bodega");
                        }
                    }
                }

            } else if (opcion.equals("D")) {
                continuar = false;
                System.out.println("programa finalizado");
            } else {
                System.out.println("opcion no valida");
            }
        }

    }
}
