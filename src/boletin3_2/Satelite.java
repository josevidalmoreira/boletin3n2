
package boletin3_2;


public class Satelite {
  
 
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public Satelite ( double m, double p , double d )  {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println (" paralelo : "+ paralelo + "meridiano : " + meridiano+ " distancia terra: "+ distanciaTerra);
}
}