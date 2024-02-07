package numero8;

public class EnvioPublic {
    public int numeroEnvio;
    public String fecha;
    public String tipoEmbalaje;
    public String cedulaCliente;
    public int peso;
    public String ciudadOrigen;
    public String ciudadDestino;
    public int costo;
    public String estadoEnvio;

    public EnvioPublic(int numeroEnvio, String fecha, String tipoEmbalaje, String cedulaCliente, int peso, String ciudadOrigen, String ciudadDestino, int costo, String estadoEnvio) {
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

    public void calcularCostoXKilo(){
        //Suponiendo que el costo es proporcional al peso;
        int precioTotal = this.costo*this.peso;
        System.out.println("El precio total del envío es de: "+precioTotal);
    }

    public void verificarEntrega(){
        System.out.println("El paquete se encuentra: "+estadoEnvio);
    }
}
