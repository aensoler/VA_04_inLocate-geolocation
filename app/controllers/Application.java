package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	
	public static List<Emisor> emisores;
	

    public static void index() {
    	if(emisores == null){
    		inicializarEmisores();
    		//entrenamiento();
    	}
    	ArrayList<Circunferencia> circunferencias = new ArrayList<Circunferencia>();
    	/* Caso 1
    	circunferencias.add(new Circunferencia(getDistancia(-70), new Punto(100, 100)));
    	circunferencias.add(new Circunferencia(getDistancia(-60), new Punto(400, 100)));
    	circunferencias.add(new Circunferencia(getDistancia(-90), new Punto(250, 400)));
    	*/
    	circunferencias.add(new Circunferencia(getDistancia(-77), new Punto(100, 100)));
    	circunferencias.add(new Circunferencia(getDistancia(-64), new Punto(400, 100)));
    	circunferencias.add(new Circunferencia(getDistancia(-79), new Punto(400, 400)));
    	circunferencias.add(new Circunferencia(getDistancia(-81), new Punto(100, 400)));
    	Punto punto = Circunferencia.getInterseccion(circunferencias);
    	/*System.out.println();
    	for(Punto p : puntos){
    		System.out.println(p.x + " , " + p.y);
    	}
    	System.out.println();
        */
        render(circunferencias, punto);
    }
    
    private static void inicializarEmisores(){
    	emisores = new ArrayList<Emisor>();
    	emisores.add(new Emisor( "1", "", new double[]{-30.0,-100.0}, new double[]{0.0,0.0} ));
    	emisores.add(new Emisor( "2", "", new double[]{-30.0,-100.0}, new double[]{1.0,0.0} ));
    	emisores.add(new Emisor( "3", "", new double[]{-30.0,-100.0}, new double[]{1.0,1.0} ));
    }

    private static void entrenamiento(){
    	
    }
    
    private static int getDistancia(int intensidad){
    	int distancia; //En centimetros
    	if(intensidad > -35){
    		distancia = 50;
    	}else if(intensidad > -50){
    		distancia = 100;
    	}else if(intensidad > -65){
    		distancia = 60;
    	}else if(intensidad > -70){
    		distancia = 150;
    	}else if(intensidad > -80){
    		distancia = 250;
    	}else{
    		distancia = 400;
    	}
    	return distancia;
    }
    
    public static double[] getPosicion(ArrayList<Double> intensidades, ArrayList<String> macs){
    	double[] posicion = new double[2];
    	for(int i = 0; i < intensidades.size(); i++){
    		
    	}
    	return posicion;
    }
}