public class Main {
    static void main(String[] args) {
    CentroMensajeria centroMensajeria = new CentroMensajeria();
    SistemaSeguridad sistemaSeguridad = new SistemaSeguridad(centroMensajeria);

    sistemaSeguridad.enviarAlerta("Luis","Esta todo bien y controlado","Baja");
    sistemaSeguridad.enviarAlerta("Sistema de seguridad","Peligro enminente, abandonar lugar.","Extrema");
    }
}
