package modelo;

import util.Formato;

public class Nif { 
	
	// Atributo
	private String texto;

	// Constructores
	/**
	 * Constructor convencional.
	 * Establece el valor inicial del atributo.
	 * Recibe un par�metro que se corresponden con el atributo
	 */
	public Nif(String texto) {
		setTexto(texto);
	}

	/**
	 * Constructor por defecto.
	 */
	public Nif() {
		this("00000000A");
	}

	/**
	 * Constructor copia.
	 */
	public Nif(Nif nif) {
		this(nif.texto);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		assert nifValido(texto);
		this.texto = texto;
	}
	
	/**
	 * Comprueba la validez de un nif.
	 * @param texto.
	 * @return true si cumple.
	 */
	private boolean nifValido(String texto) {		
		if (texto != null
				&& util.Formato.validar(texto, Formato.PATRON_NIF)
				&& letraValida(texto)) {
			return true;
		}
		return false;		
	}
	
	/**
	 * Comprueba la letra del un nif.
	 * @param nif.
	 * @return true si es correcta.
	 */
	private boolean letraValida(String textoNif) {
		// Algoritmo de obtenci�n letra
		//--Pendiente--
		return true;
	}

	@Override
	public String toString() {
		return texto;
	}
	
} //class
