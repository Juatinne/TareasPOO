
package Cuenta_bancaria;
import javax.swing.JOptionPane;


public class Operaciones {
    private static String MENU = "1. Depositar\n 2.- Retirar\n 3.Salir";

    public static void main(String []args){
        Cuenta_bancaria objeto=new Cuenta_bancaria("Carlos",5468,100);
        
        objeto.mostar();
     
        
        String opcion = "";
		do {
			
			opcion = JOptionPane.showInputDialog(null,MENU, "Elija la accion a realizar", JOptionPane.PLAIN_MESSAGE);
			switch(opcion) {
			case "1":
				deposito();
                                objeto.depositar();
				break;
			case "2":
				retiro();
                                objeto.retirar();
				break;
                                        
			case "3":
				JOptionPane.showMessageDialog(null, "Gracias por preferirnos", "BANCARIO",JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción equivocada", "Revise las occiones otra vez", JOptionPane.ERROR_MESSAGE);
			}
		}while(!opcion.equals("3"));
        
    }

    private static void retiro() {
      }

    private static void deposito() {
       }
}
