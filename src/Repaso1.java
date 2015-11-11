/*
 * Repaso1: pinta un rect�ngulo en la esquina superior derecha
 */

//importamos la librer�a ACM para los objetos gr�ficos
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Repaso1 extends acm.program.GraphicsProgram {
	
	//Declaro una variable de instancia
	GRect rectangulo;
	
	//Recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800,600);
		//El primer par�metro del rect�ngulo es el ancho
		//y el segundo par�metro del rect�ngulo el alto.
		rectangulo = new GRect (120,80);
	}
	
	public void run(){
		//A�ado el objeto GRect al lienzo para que se muestre, 
		//si no especificamos posici�n saldr� en (0,0)
		add(rectangulo);
	}
}
