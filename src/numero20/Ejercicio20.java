package numero20;

import javax.swing.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        while(true){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a nuestra aplicación de resolución de problemas de computadora, ingrese su problema\n" +
                    "1. La computadora emite un pitido al iniciarse y el disco duro gira\n2. La computadora emite un pitido al iniciar y la unidad no gira\n3. La computadora no emite un pitido y el disco duro no gira" +
                    "\n4. La computadora no emite un pitido y el disco duro gira"));
            if (opcion == 1){
                JOptionPane.showMessageDialog(null, "Póngase en contacto con el técnico apoyo");
            }else if (opcion == 2){
                JOptionPane.showMessageDialog(null, "Verificar contactos de la unidad");
            }else if (opcion == 3){
                JOptionPane.showMessageDialog(null, "Traiga la computadora para repararla en la central");
            }else if (opcion == 4){
                JOptionPane.showMessageDialog(null, "Compruebe las conexiones de altavoces");
            } else{
                JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        }
    }
}
