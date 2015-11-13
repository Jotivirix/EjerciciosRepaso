/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * Repaso5 añade soporte al programa para poder
 * escuchar los "clicks" del raton
 * Lo que hará el programa es cambiar el color
 * de relleno de un rectángulo cada vez que clickees
 * El color se cambiara de un modo aleatorio.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso5 extends acm.program.GraphicsProgram {
	//Añadimos el rectángulo
	GRect rectangulo;
	//Declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	//Metodo init
	public void init(){
		//Declaro el tamaño de la ventana
		setSize(800,600);
		//Declaramos el rectángulo con su tamaño y lo añadimos
		rectangulo = new GRect (120,80);
		//Añadimos los mouse listeners para que detecte
		//cuando hacemos click con el ratón
		addMouseListeners();
	}

	//Método run
	public void run(){
		//Añadimos el rectángulo en el centro exacto de nuestra ventana.
		add(rectangulo, getWidth()/2-rectangulo.getWidth()/2, getHeight()/2-rectangulo.getHeight()/2);
	}

	//Añadimos el método que escucha el evento de click de ratón
	public void mouseClicked (MouseEvent evento){
		if(evento.getButton() == MouseEvent.BUTTON1){
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
		}
	}
}
