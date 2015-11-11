/*
 * Repaso1: pinta un rectángulo en la esquina superior derecha
 */

//importamos la librería ACM para los objetos gráficos
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Repaso1 extends acm.program.GraphicsProgram {
	
	//Declaro una variable de instancia
	GRect rectangulo;
	
	//Recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800,600);
		//El primer parámetro del rectángulo es el ancho
		//y el segundo parámetro del rectángulo el alto.
		rectangulo = new GRect (120,80);
	}
	
	public void run(){
		//Añado el objeto GRect al lienzo para que se muestre, 
		//si no especificamos posición saldrá en (0,0)
		add(rectangulo);
	}
}
