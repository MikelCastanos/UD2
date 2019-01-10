public class satelite {
public double meridiano;
public double paralelo;
public double distancia_tierra;

public satelite (double m,double p,double d){
	this.meridiano=m;
	this.paralelo=p;
	this.distancia_tierra=d;
}
public satelite (){
	this.meridiano=paralelo=distancia_tierra=0;
}

public void setPosicion(double m,double p,double d){
	this.meridiano=m;
	this.paralelo=p;
	this.distancia_tierra=d;
}
public void printPosicion(){
System.out.println("El satélite se encuentra en"
		+ " el paralelo "+ this.paralelo+ " Meridiano "+this.meridiano+" a una distancia"
				+ " de la tierra de "+this.distancia_tierra+" Kilómetros");
}
}