public class Edad {
    public static void main (String[] args){
     Cliente cliente = new Cliente();
     cliente.edad = 14;
     cliente.telefono = 954781271;
     cliente.nombre = "Juanito Alimana";
     cliente.credito= 8000;
      System.out.println("nombre : " + cliente.nombre);
        System.out.println("edad : " + cliente.edad);
        System.out.println("telefono : " + cliente.telefono);
        System.out.println(" tu credito es de  : " + cliente.credito);



    }
}
class Persona{

    int edad;
    String nombre;
    int  telefono;
}
class Cliente extends Persona{

    int credito;
}

class Trabajador extends Cliente {
    int salario;



    }
