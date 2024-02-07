package numero11;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        String respuesta = verificarSignoNumero(numero);

        JOptionPane.showMessageDialog(null,respuesta);


    }

    public static String verificarSignoNumero(int numero){
        if(numero<0){
            return "El numero es negativo";
        } else if (numero>0) {
            return "El numero es positivo";
        }else{
            return "El numero es 0, no tiene signo";
        }
    }
}
