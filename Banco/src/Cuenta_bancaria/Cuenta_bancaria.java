
package Cuenta_bancaria;

import javax.swing.JOptionPane;



public class Cuenta_bancaria {
    String nombre_titular;
    int numero_cuenta;
    double saldo;
    double depo;
    double retiro;
    

    public Cuenta_bancaria(String nombre_titular, int numero_cuenta, double saldo) {
        this.nombre_titular = nombre_titular;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }
    public void mostar (){
        System.out.println("Los datos de la cuenta son: \n Nombre del titular: "+nombre_titular+"\n El numero de la cuenta es: "
                +numero_cuenta+"\n El saldo de la cuenta es: "+saldo);
    }
    
    public void depositar (){
     double depo =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la cantidad a depositar "));
     saldo= saldo+depo;
        JOptionPane.showMessageDialog(null,"Su saldo actual es: "+saldo);
         
    }
    
    public void retirar (){
     double retiro =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar "));
      if(retiro<=saldo){
     saldo= saldo-retiro;
        JOptionPane.showMessageDialog(null,"Su saldo actual es: "+saldo);
        }
        else{
            JOptionPane.showMessageDialog(null,"No cuenta con la cantidad que desea retirrar: ");  
        }
        
     
    }
}
