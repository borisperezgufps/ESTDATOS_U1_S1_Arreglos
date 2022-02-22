package u1.s1.arreglos;

public class Directorio {

	private Persona[] personas;
	private int contador;
	
	public Directorio(int cantidad) {
		personas = new Persona[cantidad];
	}
	
	/**
	 * Agrega una persona al directorio
	 * @param nombres
	 * @param telefono
	 */
	public void agregarPersona(String nombres, int telefono) {
		Persona p = new Persona(nombres, telefono);
		personas[contador] = p;
		contador++;
		
		// Eventualmente se generará un error en este método
		// Alguno puede decirme cuál error?
		// Alguno puede decirme cómo solucionarlo?
	}
	
	/**
	 * Imprime en la consola el nombre y telefono de la persona
	 * registrada en la posición indicada.
	 * @param posicion valor entero con la posición del arreglo
	 */
	public void imprimirPersonaEnPosicion(int posicion) {
		// Sacar la persona de la posición indicada
		
		// Imprimir por consola el nombre y telefono
	}
	
	/**
	 * Imprime en la consola el nombre de la persona
	 * con el número de teléfono indicado como parámetro.
	 * @param telefono valor entero con el número de teléfono
	 */
	public void imprimirPersonaPorTelefono(int telefono) {
		
	}
	
	/**
	 * Imprime en la consola el teléfono de la persona
	 * con el nombre indicado como parámetro.
	 * @param nombre 
	 */
	public void imprimirPersonaPorNombre(String nombre) {
		
	}
	
	/**
	 * Elimina a la persona que se encuentra en la posición determinada
	 * @param posicion
	 */
	public void eliminarPersona(int posicion) {
		
		// ¿Qué problema podría presentarse en este método?
		
		// ¿Cómo puede solucionarlo?
		
	}
	
}
