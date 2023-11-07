public class CuentaBancaria {

     public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(30103010, 100000.0, "Lionel Messi", "MeeeeessiAC@Gmail.com", "(+54 11)9039-0734");
        
     System.out.println("El Saldo actual es de " + cuenta.getSaldo());
     cuenta.depositar(200000.0);
     cuenta.retirar(150000.0);
 }

   private int Cuenta;
    private double Saldo;
    private String Cliente;
    private String Gmail;
    private String Telefono;
    

    public CuentaBancaria(int Cuenta, double Saldo, String Cliente, String Gmail, String Telefono) {
        this.Cuenta = Cuenta;
        this.Saldo = Saldo;
        this.Cliente = Cliente;
        this.Gmail = Gmail;
        this.Telefono = Telefono;
    }
    
    
  


    public int getNumeroCuenta() {
        return Cuenta;
    }
    
    public void setNumeroCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    public double getSaldo() {
        return Saldo;
    }
    
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    public String getNombreCliente() {
        return Cliente;
    }
    
    public void setNombreCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    
    public String getGmail() {
        return Gmail;
    }
    
    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    
    public String getNumeroTelefono() {
        return Telefono;
    }
    
    public void setNumeroTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
     
     public void depositar(double cantidad) {
        Saldo += cantidad;

        System.out.println("Se depositaron " + cantidad + " de unidades. El nuevo saldo es de " + Saldo );
    }
    
    public void retirar(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;

            System.out.println("Se retiraron " + cantidad + " de unidades. El nuevo saldo es de " + Saldo );

        } else {
            System.out.println("Lo sentimos, al parecer no hay fondos necesarios para realizar el retiro");
        }
    }


    
   
 
    }
        
    