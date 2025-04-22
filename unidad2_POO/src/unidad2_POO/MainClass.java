package unidad2_POO;

public class MainClass {
	
	
	public static void main(String[] args) {
		//crear un nuevo empleado sin valores en sus atributos:
		Empleado diego = new Empleado();
		Empresa empresa1 = new Empresa();
		
		diego.setNombre("Diego Fernando Loaiza Buitrago");
		diego.setTelefono("3216151068");
		diego.setDireccion("Calle 123 Carrera 456");
		
		System.out.println("Se acabo de crear el empleado "+ diego.getNombre()+", que vive en "+diego.getDireccion()+" y su telefono es "+diego.getTelefono()+"");
		// Se pueden modificar los atributos cuando son públicos 
		/*diego.direccion = "Calle falsa 123";
		diego.nombre = "Diego Fernando Loaiza";
		diego.eps = "Sura";
		diego.telefono = "321 6151058";
		diego.tipo = "Docente tiempo completo";
		diego.salario_base = -15000.01; //??
		*/
		
	}

}
