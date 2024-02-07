package numero8;

class EnvioPrivate {
    private int numeroEnvio;
    private String fecha;
    private String tipoEmbalaje;
    private String cedulaCliente;
    private int peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int costo;
    private String estadoEnvio;

    public static void main(String[] args) {
        EnvioPrivate envioPrivate1 = new EnvioPrivate(2,"23/1/24","Paqueteria","1234567890",5,"Alcalá","Pereira",3000,"Recibido");

        envioPrivate1.calcularCostoXKilo();
        envioPrivate1.verificarEntrega();
    }

    private EnvioPrivate(int numeroEnvio, String fecha, String tipoEmbalaje, String cedulaCliente, int peso, String ciudadOrigen, String ciudadDestino, int costo, String estadoEnvio) {
        this.numeroEnvio = numeroEnvio;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.estadoEnvio = estadoEnvio;
    }

    private void calcularCostoXKilo(){
        //Suponiendo que el costo es proporcional al peso;
        int precioTotal = this.costo*this.peso;
        System.out.println("El precio total del envío es de: "+precioTotal);
    }

    private void verificarEntrega(){
        System.out.println("El paquete se encuentra: "+estadoEnvio);
    }
}
