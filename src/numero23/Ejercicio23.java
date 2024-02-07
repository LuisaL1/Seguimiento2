package numero23;

import javax.swing.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bienvenido a SandwichOrder, cree su sandwich a su propio gusto!");
        Double precioTotal = 0.0;

        Boolean bandera = true;
        while(bandera){
            String tamanio = JOptionPane.showInputDialog("¿Desea su sandwich en tamaño 'pequeño' o 'grande'?");
            if (tamanio.equalsIgnoreCase("pequeño")){
                precioTotal += 6000;
                bandera=false;
            } else if (tamanio.equalsIgnoreCase("grande")) {
                precioTotal += 12000;
                bandera=false;
            } else {
                JOptionPane.showMessageDialog(null,"Opcion equivocada");
                bandera = true;
            }
        }
    }
}
