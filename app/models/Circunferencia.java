package models;

import java.util.ArrayList;

public class Circunferencia {
	public double radio;
	public Punto centro;
	
	public Circunferencia(double radio, Punto centro){
		this.radio = radio;
		this.centro = centro;
	}
	
	public static Punto getInterseccion(ArrayList<Circunferencia> circunferencias){
		Punto temp, punto = null;
		double d, d1, h, x, y, x1, y1, x2, y2;
		
		for(int i = 0; i < circunferencias.size() - 1; i++){
			//System.out.println("i: " + i + "\tCircunferencia: " + circunferencias.get(i).centro.x + "," + circunferencias.get(i).centro.y + "r:" + circunferencias.get(i).radio);
			for(int j = i + 1; j < circunferencias.size(); j++){
				//System.out.println("i: " + i + "\tCircunferencia: " + circunferencias.get(i).centro.x + "," + circunferencias.get(i).centro.y + "r:" + circunferencias.get(i).radio);
				//System.out.println("j: " + j + "\tCircunferencia: " + circunferencias.get(j).centro.x + "," + circunferencias.get(j).centro.y + "r:" + circunferencias.get(j).radio);
				d = Math.sqrt(Math.pow(Math.abs(circunferencias.get(i).centro.x-circunferencias.get(j).centro.x), 2)
						+ Math.pow(Math.abs(circunferencias.get(i).centro.y-circunferencias.get(j).centro.y), 2));
				if(d < circunferencias.get(i).radio + circunferencias.get(j).radio){
				//System.out.println("d: " + d);
				d1 = (Math.pow(circunferencias.get(i).radio, 2) - Math.pow(circunferencias.get(j).radio, 2)
						+ Math.pow(d, 2)) / (2 * d);
				h = Math.sqrt(Math.pow(circunferencias.get(i).radio, 2) - Math.pow(d1, 2));
				x = circunferencias.get(i).centro.x + ((d1 * (circunferencias.get(j).centro.x - circunferencias.get(i).centro.x)) / d);
				y = circunferencias.get(i).centro.y + ((d1 * (circunferencias.get(j).centro.y - circunferencias.get(i).centro.y)) / d);
				x1 = x + ((h * (circunferencias.get(j).centro.y - circunferencias.get(i).centro.y)) / d);
				System.out.println("x1:" + x1);
				y1 = y + ((h * (circunferencias.get(j).centro.x - circunferencias.get(i).centro.x)) / d);
				System.out.println("y1:" + y1);
				x2 = x - ((h * (circunferencias.get(j).centro.y - circunferencias.get(i).centro.y)) / d);
				System.out.println("x2:" + x2);
				y2 = y - ((h * (circunferencias.get(j).centro.x - circunferencias.get(i).centro.x)) / d);
				System.out.println("y2:" + y2);
				temp = new Punto((x1+x2)/2, (y1+y2)/2);
				if (punto == null){
					punto = temp;
				}else{
					punto = (new Punto((punto.x+temp.x)/2, (punto.y+temp.y)/2));
				}
				}
				//puntos.add(new Punto(x2, y2));
			}
			
		}
		
		return punto;
	}
	
	
	
	
}
