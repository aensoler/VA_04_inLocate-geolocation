package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

public class Emisor {
    
	public String id;
	public String mac;
	public double[] range;
	public double[] posicion;
	
	public Emisor(String id, String mac, double[] range, double[] posicion){
		this.id = id;
		this.mac = mac;
		this.range = range;
		this.posicion = posicion;
	}
	
}
