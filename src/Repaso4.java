/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM - UFV
 * 
 * Repaso4 tiene que dibujar un rectángulo 
 * en el centro de la pantalla
 */

import acm.graphics.*;

public class Repaso4 extends acm.program.GraphicsProgram {

	//Declaro una variable de instancia para almacenar el rectángulo
	//Cómo es de instancia, se ve tanto desde el init como el run.
	GRect rectangulo;
	
	//Declaro otra variable de instancia que guardará el punto X 
	//de la pantalla en que empezará a pintarse el rectángulo
	int distanciaX;
	int distanciaY;
	
	double distanciaA;
	double distanciaB;
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
		//dónde está la mitad exacta del ancho de pantalla.
		distanciaX = getWidth()/2;
		//Divido el alto de la pantalla en 2 para saber
		//dónde está la mitad exacta del alto de pantalla.
		distanciaY = getHeight()/2;
		//Divido el ancho del rectángulo
		distanciaA = (rectangulo.getWidth()/2);
		//Divido el largo del rectángulo
		distanciaB = rectangulo.getHeight()/2;
		rectangulo.setLocation(distanciaX-distanciaA, distanciaY-distanciaB);
	}
}
