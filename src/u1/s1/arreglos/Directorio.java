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
		
		// Eventualmente se generar� un error en este m�todo
		// Alguno puede decirme cu�l error?
		// Alguno puede decirme c�mo solucionarlo?
	}
	
	/**
	 * Imprime en la consola el nombre y telefono de la persona
	 * registrada en la posici�n indicada.
	 * @param posicion valor entero con la posici�n del arreglo
	 */
	public void imprimirPersonaEnPosicion(int posicion) {
		// Sacar la persona de la posici�n indicada
		
		// Imprimir por consola el nombre y telefono
	}
	
	/**
	 * Imprime en la consola el nombre de la persona
	 * con el n�mero de tel�fono indicado como par�metro.
	 * @param telefono valor entero con el n�mero de tel�fono
	 */
	public void imprimirPersonaPorTelefono(int telefono) {
		
	}
	
	/**
	 * Imprime en la consola el tel�fono de la persona
	 * con el nombre indicado como par�metro.
	 * @param nombre 
	 */
	public void imprimirPersonaPorNombre(String nombre) {
		
	}
	
	/**
	 * Elimina a la persona que se encuentra en la posici�n determinada
	 * @param posicion
	 */
	public void eliminarPersona(int posicion) {
		
		// �Qu� problema podr�a presentarse en este m�todo?
		
		// �C�mo puede solucionarlo?
		
	}
	
}
