package OperadoresAsignacion;

public class operadoresAsignacion {
    public static void main(String[] args){
        double saldo = 100.50;
        System.out.println("\t\t--- Movimientos de la cuenta bancaria ---");
        System.out.println("Su saldo actual es:\t\t\t\t\t\t" + saldo + " euros.");
        System.out.println("Abono recibido:\t\t\t\t\t+27.50\t\t" + (saldo += 27.50) + " euros.");
        System.out.println("Promoción duplicado:\t\t\t\tx2\t\t" + (saldo *= 2) + " euros.");
        System.out.println("Reparaciones hogar:\t\t\t\t/2\t\t" + (saldo /= 2) + " euros.");
        System.out.println("Ingreso recibido:\t\t\t\t+250.38\t\t" + (saldo += 250.38) + " euros.");
        System.out.println("Compra del sábado:\t\t\t\t-55.37\t\t" + (saldo -= 55.37) + " euros.");
        System.out.println("Abono nómina:\t\t\t\t\t+1200.96\t" + (saldo += 1200.96) + " euros.");
        System.out.println("");
        System.out.println("Su saldo actual es:\t\t\t\t\t\t" + saldo + " euros.");
        System.out.println("Pago cena:\t\t\t\t\t-85.23\t\t" + (saldo -= 85.23) + " euros.");
        System.out.println("");
        System.out.println("Su saldo actual es:\t\t\t\t\t\t" + saldo + " euros.");
    }
}
