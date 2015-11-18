/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * Repaso9
 * Si pulso en la mitad superior del rectángulo
 * este sube 5 pixels y si pulso en la mitad
 * inferior del rectángulo este baja 5 píxels.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso9 extends acm.program.GraphicsProgram {
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
			double distancia = evento.getY()-rectangulo.getY();
			if(distancia > rectangulo.getHeight()/2){
				rectangulo.move(0, 5);
			}
			else{
				rectangulo.move(0, -5);
			}
		}
	}
}
