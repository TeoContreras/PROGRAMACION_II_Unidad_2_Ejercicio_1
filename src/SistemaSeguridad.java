public class SistemaSeguridad {

    private CentroMensajeria centroMensajeria;
    public SistemaSeguridad(CentroMensajeria centroMensajeria){
        this.centroMensajeria=centroMensajeria;
    }
    public void enviarAlerta(String remitente,String texto, String prioridad){
        Mensaje mensaje= new Mensaje(remitente, texto, prioridad);
        centroMensajeria.recibirMensaje(mensaje);
    }

}
