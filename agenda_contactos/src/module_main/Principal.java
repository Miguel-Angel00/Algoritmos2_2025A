package module_main;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
        agenda.cargarContactosDesdeArchivo(); // Carga los contactos
        agenda.menu();
	}

}
