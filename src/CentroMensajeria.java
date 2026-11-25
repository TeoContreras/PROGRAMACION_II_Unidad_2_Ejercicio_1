public class CentroMensajeria {

    public void recibirMensaje(Mensaje m){
        System.out.println("NUEVO MENSAJE");
        System.out.println("Prioridad: "+m.getPrioridad());
        System.out.println("Remitente: "+m.getRemitente());
        System.out.println(""+m.getTexto());
        System.out.println("Estado del mensaje: Procesado existosamente.");

    }
}
