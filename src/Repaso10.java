/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * Repaso10
 * Tenemos el rectángulo subdividio en 4 rectangulos a partir
 * del centro del rectángulo general. Si pulsamos en el rectángulo
 * superior derecho el rectángulo avanzará hacia arriba y hacia 
 * la derecha, mientras que si pulsamos en el superior izquierdo
 * subirá y se moverá hacia la izquierda.
 * Lo mismo pasa en los rectángulos inferiores, sólo que en vez de
 * subir, el rectángulo bajará y se moverá en la dirección de la
 * psoción del rectángulo.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso10 extends acm.program.GraphicsProgram {
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
			if (getElementAt(evento.getX(), evento.getY()) == rectangulo){
				double distanciaEnX = (evento.getY()- rectangulo.getY());

				if (distanciaEnX > rectangulo.getHeight()/2){ 
					rectangulo.move(0, 5);
				}
				else{
					rectangulo.move(0, -5);
				}
				
				double distanciaEnY = (evento.getX()- rectangulo.getX());

				if (distanciaEnY > rectangulo.getWidth()/2){
					rectangulo.move(5,0);
				}
				else{
					rectangulo.move(-5,0);
				}
			}
		}
	}
}
