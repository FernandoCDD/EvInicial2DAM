package evInicial;

import java.util.Random;

public class Batalla {

	public static Personaje generarBatalla (Personaje p1, Personaje p2) {
		
		int golpe = generarGolpe();
		int nuevaVidaP2 = p2.getPuntosVida();
		int nuevaVidaP1 = p1.getPuntosVida();
		
		while (p1.getPuntosVida() > 0 && p2.getPuntosVida() > 0) {
			
			System.out.println(p1+" Ataca a "+p2+" con un golpe de "+golpe+" puntos de vida");
			nuevaVidaP2 -= golpe;
			System.out.println(p2+" Ataca a "+p1+" con un golpe de "+golpe+" puntos de vida");
			nuevaVidaP1 -= golpe;
			
			if (nuevaVidaP1 < 30) {
				
				p1.buscarBotiquin();
				nuevaVidaP1 = p1.getPuntosVida();
				System.out.println("El jugador 1 se ha tomado una poción, +10 de vida. "+nuevaVidaP1+"PV");
			}
			if (nuevaVidaP2 < 30) {
				p2.buscarBotiquin();
				nuevaVidaP2 = p2.getPuntosVida();
				System.out.println("El jugador 2 se ha tomado una poción, +10 de vida. "+nuevaVidaP2+"PV");
			}
		}
		
		if (nuevaVidaP1 > nuevaVidaP2)
			return p1;
		else if (nuevaVidaP1 < nuevaVidaP2)
			return p2;
		else
			return null;
	}
	
	public static int generarGolpe() {
		
		int golpe = 0, desde = 1, hasta = 3;
		Random rnd = new Random();
		
		golpe = rnd.nextInt() * (hasta - desde + 1) + desde;
		
		return golpe;
	}
	
}
