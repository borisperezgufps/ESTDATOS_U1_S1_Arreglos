package u1.s1.arreglos;

public class ClienteDirectorio {

	public static void main(String[] args) {
		
		// Crear el directorio de 10 entradas
		Directorio dir = new Directorio(10);
		
		dir.agregarPersona("Boris", 7556677);
		dir.agregarPersona("Paola", 7924589);
		dir.agregarPersona("Paula", 7921278);
		
		dir.imprimirPersonaEnPosicion(2);
		dir.imprimirPersonaPorNombre("Paola");
		dir.imprimirPersonaPorTelefono(8963852);
		dir.imprimirPersonaPorNombre("Molina");
		dir.imprimirPersonaEnPosicion(6);
		dir.eliminarPersona(2);
		
	}
	
}
