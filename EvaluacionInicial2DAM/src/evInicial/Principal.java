package evInicial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String elemento;
		
		int limiteMochila = 10, opcion = 0;
		
		String mochila[];
		
		mochila = new String [limiteMochila];
		
		mochila [0] = new String ("botiquin");
		
		Batalla.generarBatalla(new Personaje("Sebastián"), new Personaje("Fernando"));
		
	}

}
