package numero8;

public class Main {
    public static void main(String[] args) {
        EnvioPublic envioPublic1 = new EnvioPublic(1,"1/1/24","Documentos","1234567890",5,"Quimbaya","Armenia",500,"Sin Recibir");

        envioPublic1.calcularCostoXKilo();
        //Si cambia de peso cambia el costo
        envioPublic1.peso = 10;
        envioPublic1.calcularCostoXKilo();

        envioPublic1.verificarEntrega();
    }
}
