public class ClienteVIP {

    public static void main(String[] args) {
    ClienteVIP cliente_1 = new ClienteVIP();
    ClienteVIP cliente_2 = new ClienteVIP("Elias Calero",    800);
    ClienteVIP cliente_3 = new ClienteVIP("Elvin Garcia", 10000, "ElvinGmartinez@gmail.com");

    System.out.println("Nombre del cliente 1: " + cliente_1.getNombre());
    System.out.println("Límite de crédito del cliente 2: " + cliente_2.getLimiteCredito());
    System.out.println("Correo electrónico del cliente 3: " + cliente_3.getCorreo());
}



    private String Nombre;
    private static double limiteCredito;
    private String Correo;

  
    public ClienteVIP() {
        this("Martin Elias", 60000,  "Pepe23HJ_9@gmail.com");
    }

   
    public ClienteVIP(String Nombre, double limiteCredito) {
        this(Nombre, limiteCredito, "Pepe23HJ_9@gmail.com");
    }


    public ClienteVIP(String Nombre, double limiteCredito, String Correo) {
        this.Nombre = Nombre;
        ClienteVIP.limiteCredito = limiteCredito;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String getCorreo() {
        return Correo;
    }




}

