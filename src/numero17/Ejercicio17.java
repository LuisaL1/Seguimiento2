package numero17;

import javax.swing.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        int mensaje = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a nuestro gimnasio ¿Qué plan desea contratar?\n1. 15 dias \n2. 30 dias \n3. 3 meses"));
        if (mensaje == 1){
            JOptionPane.showMessageDialog(null, "La cantidad a pagar es 18000");
        } else if (mensaje == 2) {
            JOptionPane.showMessageDialog(null, "La cantidad a pagar es 35000");
        } else if (mensaje == 3) {
            JOptionPane.showMessageDialog(null,"La cantidad a pagar es 86000");
        } else {
            JOptionPane.showMessageDialog(null,"Opción incorrecta!");
        }

    }
}
