package numero14;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<Double> notasFisica = new ArrayList<>();
        ArrayList<Double> notasQuimica = new ArrayList<>();
        ArrayList<Double> notasBiologia= new ArrayList<>();
        ArrayList<Double> notasMatematicas = new ArrayList<>();
        ArrayList<Double> notasInformatica = new ArrayList<>();

        Boolean bandera = true;

        while (bandera){
            String mensaje = JOptionPane.showInputDialog("Ingrese el nombre de la asignatura para agregar materias (fisica, quimica, biologia, matematicas, informatica)\nIngrese 'RESULTADO' para ver el resultado de todas las materias");
            if (mensaje.equals("fisica")){
                ingresarCalificaciones(notasFisica);
            } else if (mensaje.equals("quimica")) {
                ingresarCalificaciones(notasQuimica);
            } else if (mensaje.equals("biologia")) {
                ingresarCalificaciones(notasBiologia);
            } else if (mensaje.equals("matematicas")) {
                ingresarCalificaciones(notasMatematicas);
            } else if (mensaje.equals("informatica")) {
                ingresarCalificaciones(notasInformatica);
            } else if (mensaje.equalsIgnoreCase("resultado")) {
                String resultadoFisica = calcularCalificacion(notasFisica);
                String resultadoQuimica = calcularCalificacion(notasQuimica);
                String resultadoBiologia = calcularCalificacion(notasBiologia);
                String resultadoMatematicas = calcularCalificacion(notasMatematicas);
                String resultadoInformatica = calcularCalificacion(notasInformatica);
                JOptionPane.showMessageDialog(null,"Los resultados son:\nFisica: "+resultadoFisica+"\nQuimica: "+resultadoQuimica+"\nBiologia: "+
                        resultadoBiologia+"\nMatematicas: "+resultadoMatematicas+"\nInformatica: "+resultadoInformatica);
                bandera=false;
            }
        }

    }

    public static void ingresarCalificaciones(ArrayList<Double> notas) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a ingresar"));
        for (int i = 0; i < cantidad; i++) {
            Double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota#"+(i+1)+": "));
            notas.add(nota);
        }
    }

    public static String calcularCalificacion(ArrayList<Double> nota){
        Double sumaNotas = 0.0;
        Double promedio;

        for (int i = 0; i < nota.size(); i++) {
            sumaNotas += nota.get(i);
        }
        promedio = sumaNotas/nota.size();

        if (promedio>0 && promedio<=5.9){
            return  "El promedio "+promedio+" es una calificación mala";
        }else if (promedio >= 6 && promedio <= 8){
            return  "El promedio "+promedio+" es una calificación buena";
        }else{
            return  "El promedio "+promedio+" es una calificación muy buena";
        }
    }
}
