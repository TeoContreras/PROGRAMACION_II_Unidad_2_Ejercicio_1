import javax.swing.plaf.PanelUI;

public class Mensaje {
    private String remitente;
    private String texto;
    private String prioridad;

    public Mensaje(String remitente, String texto, String prioridad){
        this.prioridad=prioridad;
        this.remitente=remitente;
        this.texto=texto;
    }
    public String getRemitente(){
        return remitente;
    }
    public String getTexto(){
        return texto;
    }
    public String getPrioridad(){
        return prioridad;
    }
}
