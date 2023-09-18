package evInicial;

public class Personaje implements IHabilidad{

	private String nombre;
	private int puntosVida;
	private int puntuaje;
	private int elementosMochila;
	private String [] mochila;
	private int puntosFuerza;
	
	public Personaje() {
		super();
	}


	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = 100;
		this.puntuaje = 0;
		this.elementosMochila = 10;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntosVida() {
		return puntosVida;
	}


	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}


	public int getPuntuaje() {
		return puntuaje;
	}
	
	public void setPuntuaje(int puntuaje) {
		this.puntuaje = puntuaje;
	}

	public int getPuntosFuerza() {
		return puntosFuerza;
	}

	public void setPuntosFuerza(int puntosFuerza) {
		this.puntosFuerza = puntosFuerza;
	}

	public int getElementosMochila() {
		return elementosMochila;
	}

	public String[] getMochila() {
		return mochila;
	}
	
	public int addElemento (String elemento) {
		
		if (mochila.length == 10)
			System.out.println("YA NO PUEDES CONSEGUIR MÁS ELEMENTOS, TU MOCHILA ESTÁ COMPLETA");
		else {
			
			for (int i = 0; i < mochila.length; i++) {
				this.mochila[i] = elemento;
			}
		}
		
		return mochila.length;
	}
	
	public int recibirGolpe (int golpe) {
		
		this.puntosVida = this.puntosVida  - golpe;
		
		if (this.puntosVida < 0) 
			return 0;
		else	
		return this.puntosVida;
		
	}
	
	public int buscarBotiquin () {
		
		for (int i = 0; i < mochila.length; i++) {
			if (this.mochila[i].equalsIgnoreCase("botiquin")) {
				this.puntosVida = this.puntosVida + 10;
				
			}else
				System.out.println("LO SIENTO, PERO NO TIENES NINGUNA POCIÓN DE BOTIQUÍN");
				
		}
		
		return this.puntosVida;
	}
	
}


