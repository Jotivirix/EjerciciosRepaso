/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1� DAM - UFV
 * 
 * Repaso2 tiene que dibujar un rect�ngulo a
 * partir del centro de la pantalla, en el 
 * lado superior de la pantalla
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Repaso2 extends acm.program.GraphicsProgram {

	//Declaro una variable de instancia para almacenar el rect�ngulo
	//C�mo es de instancia, se ve tanto desde el init como el run.
	GRect rectangulo;
	
	//Declaro otra variable de instancia que guardar� el punto X 
	//de la pantalla en que empezar� a pintarse el rect�ngulo
	int distanciaX;
	
	//M�todo init para inicializar la pantalla
	public void init(){
		//Cambio el tama�o de la pantalla
		setSize(800, 600);
		
		//Creo el rect�ngulo de 120 de ancho por 80 de alto
		rectangulo = new GRect (120,80);
		add(rectangulo);
	}
	
	public void run(){
		//Divido el ancho de la pantalla en 2 para saber
		//d�nde est� la mitad exacta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX, 0);
	}

}
