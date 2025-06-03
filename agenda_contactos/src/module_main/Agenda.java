package module_main;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Agenda {
	private String nombreArchivo = "data.txt";
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    // FUNCIONALIDAD: CARGAR DESDE ARCHIVO
    //Cargar los contactos desde el archivo de txt
    public void cargarContactosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 5) {
                    String nombre = partes[0].trim();
                    String ciudad = partes[1].trim();
                    String telefono = partes[2].trim();
                    int anioNacimiento = Integer.parseInt(partes[3].trim());
                    String etiqueta = partes[4];

                    Contacto existente = new Contacto(nombre, ciudad, telefono, anioNacimiento, etiqueta);
                    contactos.add(existente);
                }
            }
        } catch (Exception e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        }
    }

    // FUNCIONALIDAD: AGREGAR CONTACTO
    //Escribir un contacto en el archivo txt
    public void guardarContactosDesdeConsola(Scanner sc) {
    	 
    	System.out.println("Nombre: " );
    	 String nombre = sc.nextLine();
    	System.out.println("Ciudad: " );
    	 String ciudad = sc.nextLine();
    	System.out.println("Telefono: " );
    	 String telefono = sc.nextLine();
    	int anioNacimiento;
    	System.out.println("Año de nacimiento: " );
    	//Validar que el usuario ingrese un caracter valido
    	try { anioNacimiento = Integer.parseInt(sc.nextLine());}
    	//Si hay algun error se sale del metodo
    	catch(NumberFormatException e) { System.out.println("Año invalido, ingrese un numero entre 1925 y 2025"); return; }
    	System.out.println("Etiqueta (Familia, Amigos, Trabajo, etc): ");
    	String etiqueta = sc.nextLine();
    	//Validar que el usuario haya ingresado datos validos segun los Setters de Contactos
    	try {
    	Contacto nuevo = new Contacto(nombre, ciudad, telefono, anioNacimiento, etiqueta);
    	contactos.add(nuevo);
    	//Si hay algun error se sale del metodo
    	}catch (IllegalArgumentException e) {
    		System.out.println("Error al crear el contacto" + e.getMessage());
    		return;
    	}
    	

    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))){
    		String linea = nombre + ";" + ciudad + ";" + telefono + ";" + anioNacimiento + ";" + etiqueta;
    		bw.write(linea);
    		bw.newLine();
    		System.out.println("Contacto guardado con exito");
    	}catch(Exception e) { System.out.println("Error al guardar el contacto" + e.getMessage());}
    	
    }
    
    //Editar un contacto
    public void editarContacto(Scanner sc) {

        System.out.print("Ingrese el nombre del contacto a editar o eliminar: ");
        //Buscar un contacto por nombre
        String nombreBuscado = sc.nextLine();

        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombreBuscado)) {
                contactoEncontrado = c;
                break;
            }
        }

        if (contactoEncontrado == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }

        System.out.println("Contacto encontrado: " + contactoEncontrado.getNombre());
        System.out.print("Desea editar (E) o eliminar (D) este contacto ");
        String opcion = sc.nextLine().trim().toUpperCase();

        if (opcion.equals("E")) {
            System.out.print("Nuevo nombre (enter para no cambiar): ");
            String nuevoNombre = sc.nextLine();
            if (!nuevoNombre.isEmpty()) {
                contactoEncontrado.setNombre(nuevoNombre);
            }

            System.out.print("Nueva ciudad (enter para no cambiar): ");
            String nuevaCiudad = sc.nextLine();
            if (!nuevaCiudad.isEmpty()) {
                contactoEncontrado.setCiudad(nuevaCiudad);
            }

            System.out.print("Nuevo telefono (enter para no cambiar): ");
            String nuevoTelefono = sc.nextLine();
            if (!nuevoTelefono.isEmpty()) {
                contactoEncontrado.setTelefono(nuevoTelefono);
            }

            System.out.print("Nuevo año de nacimiento (enter para no cambiar): ");
            String nuevoAnioStr = sc.nextLine();
            if (!nuevoAnioStr.isEmpty()) {
                try {
                    int nuevoAnio = Integer.parseInt(nuevoAnioStr);
                    contactoEncontrado.setAnioNacimiento(nuevoAnio);
                } catch (NumberFormatException e) {
                    System.out.println("Año invalido, no se actualizo.");
                }
            }
            
            System.out.print("Nueva etiqueta (enter para no cambiar): ");
            String nuevaEtiqueta = sc.nextLine();
            if (!nuevaEtiqueta.isEmpty()) {
                contactoEncontrado.setEtiqueta(nuevaEtiqueta);
            }

            System.out.println("Contacto actualizado.");
        } else if (opcion.equals("D")) {
            contactos.remove(contactoEncontrado);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Opción no valida. No se realizaron cambios.");
            return;
        }

        // Guardar la lista actualizada sobrescribiendo el archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
        	// Se recorre la lista guardando la informacion actualizada de los contactos en el archivo
            for (Contacto c : contactos) {
                String linea = c.getNombre() + ";" 
                             + c.getCiudad() + ";" 
                             + c.getTelefono() + ";" 
                             + c.getAnioNacimiento() + ";"
                			 + c.getEtiqueta();
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo actualizado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
	// FUNCIONALIDAD: BUSCAR POR NOMBRE
	// Buscar contacto por nombre
    public void buscarPorNombre(Scanner sc) {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = sc.nextLine();

        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Nombre: " + c.getNombre() + ", Ciudad: " + c.getCiudad() + 
                                   ", Teléfono: " + c.getTelefono() + ", Año Nac: " + c.getAnioNacimiento());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }
    
    // FUNCIONALIDAD: BUSCAR POR ETIQUETA
    public void buscarPorEtiqueta(Scanner sc) {
        System.out.print("Ingrese la etiqueta para buscar: ");
        String etiquetaBuscada = sc.nextLine().trim();

        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getEtiqueta().equalsIgnoreCase(etiquetaBuscada)) {
                System.out.println(c.getNombre() + " - " + c.getCiudad() + " - " + c.getTelefono() + " - " + c.getAnioNacimiento() + " - " + c.getEtiqueta());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron contactos con la etiqueta '" + etiquetaBuscada + "'");
        }
    }

    // FUNCIONALIDAD: MOSTRAR TODOS LOS CONTACTOS
    // Listar todos los contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
            return;
        }
        System.out.println("Lista de contactos:");
        for (Contacto c : contactos) {
            System.out.println("- " + c.getNombre() + ", " + c.getCiudad() + ", " + c.getTelefono() + ", " + c.getAnioNacimiento());
        }
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n=== Agenda de Contactos ===");
            System.out.println("1. Cargar contactos desde archivo");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Editar o eliminar contacto");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Buscar contacto por etiqueta");
            System.out.println("6. Listar todos los contactos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    cargarContactosDesdeArchivo();
                    break;
                case "2":
                    guardarContactosDesdeConsola(sc);
                    break;
                case "3":
                    editarContacto(sc);
                    break;
                case "4":
                    buscarPorNombre(sc);
                    break;
                case "5":
                	buscarPorEtiqueta(sc);
                	break;
                case "6":
                    listarContactos();
                    break;
                case "7":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("7"));

        sc.close();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
}
