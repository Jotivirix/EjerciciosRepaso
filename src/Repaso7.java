/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * Repaso7
 * Cuando se hace click en un rectángulo central
 * genera un nuevo rectángulo aleatorio de cualquier
 * tamaño, color y en cualquier lugar de la pantalla.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso7 extends acm.program.GraphicsProgram {
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
		
		if(getElementAt(evento.getX(), evento.getY()) == rectangulo){
			GRect auxiliar = new GRect(aleatorio.nextInt(200), aleatorio.nextInt(200));
			auxiliar.setFilled(true);
			auxiliar.setFillColor(aleatorio.nextColor());
			add(auxiliar, aleatorio.nextInt(800), aleatorio.nextInt(600));
			
		}
	}
}
