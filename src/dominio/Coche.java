package dominio; 

 public class Coche {

       private int ruedas;
         private int peso;


 public Coche(){

       ruedas=4;
       peso=1800;
}

public String dime_peso(){
return "El coche pesa" + peso;
}
}
