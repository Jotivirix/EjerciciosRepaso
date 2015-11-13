/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * Repaso6 hace exactamente lo mismo que Repaso5
 * pero sólo cambiará el color del rectángulo si
 * se hace "click" dentro del rectángulo.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso6 extends acm.program.GraphicsProgram {
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
		
		//Si la posición en la que haces "click" está dentro
		//del rectángulo, este cambiará de color, si no, no.
		
		//La funcion se llama getElementAt
		if(getElementAt(evento.getX(), evento.getY()) == rectangulo){
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
		}
	}
}
