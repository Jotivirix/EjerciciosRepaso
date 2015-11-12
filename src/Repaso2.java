/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM - UFV
 * 
 * Repaso2 tiene que dibujar un rectángulo a
 * partir del centro de la pantalla, en el 
 * lado superior de la pantalla
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Repaso2 extends acm.program.GraphicsProgram {

	//Declaro una variable de instancia para almacenar el rectángulo
	//Cómo es de instancia, se ve tanto desde el init como el run.
	GRect rectangulo;
	
	//Declaro otra variable de instancia que guardará el punto X 
	//de la pantalla en que empezará a pintarse el rectángulo
	int distanciaX;
	
	//Método init para inicializar la pantalla
	public void init(){
		//Cambio el tamaño de la pantalla
		setSize(800, 600);
		
		//Creo el rectángulo de 120 de ancho por 80 de alto
		rectangulo = new GRect (120,80);
		add(rectangulo);
	}
	
	public void run(){
		//Divido el ancho de la pantalla en 2 para saber
		//dónde está la mitad exacta de la pantalla
		distanciaX = getWidth()/2;
		rectangulo.setLocation(distanciaX, 0);
	}

}
