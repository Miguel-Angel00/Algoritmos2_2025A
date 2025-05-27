import java.io.*;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void cargarContactosDesdeArchivo() {
    	String nombreArchivo = "data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String nombre = partes[0].trim();
                    String ciudad = partes[1].trim();
                    String telefono = partes[2].trim();
                    int anioNacimiento = Integer.parseInt(partes[3].trim());

                    Contacto c = new Contacto(nombre, ciudad, telefono, anioNacimiento);
                    contactos.add(c);
                }
            }
        } catch (IOException e) {
            System.out.println("error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("error en formato numerico: " + e.getMessage());
        }
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}
