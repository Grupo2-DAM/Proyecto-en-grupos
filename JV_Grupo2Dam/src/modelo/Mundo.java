package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Mundo implements Leyes, Serializable{
	
	private final static int TAMAÑO = 12;
	private String nombre;
	private List<Integer> constantes;
	private Map<Patron, Posicion> distribucion;
	private byte[][] espacio;

	
	public void setConstantes(List<Integer> parametros){
		if (parametros == null){
			this.constantes = new ArrayList<Integer>();
		}
		else {
			this.constantes = parametros;
		}
	}
	
	public void setDistribucion (Map)
	
	public void setEspacio(byte[][] espacio){
		if(espacio == null || espacio.length == 0) {
			this.espacio = new byte[TAMAÑO] [TAMAÑO];
			for(int i = 0; i < espacio.length; i++){
				for(int j = 0; j < espacio.length; j++){
					espacio[i][j] = 0;
				}
			}
		}
	}
	
	public void actualizarMundo(){
		int tam = espacio.length;
		byte[][] nuevaRealidad = new byte[tam][tam];
		
		for (int i = 0; i < tam; i++){
			for(int j = 0; j <=11; j++){
				int vecina = 0;
				try {
					vecina += espacio [i][j];
				}
			}
		}
	
	
	}









}
