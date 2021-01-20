package video;

public class Projector {
    
    private VideoDevice dispositivo;
    private Boolean wideScreen;
    private Boolean ligado;
    private static Projector projector;
    
    private Projector(){
        dispositivo = VideoDeviceNotFound.getInstance();
        wideScreen = false;
        ligado = false;
    }
    
    public static Projector getInstance(){
        if (projector == null) {
            projector = new Projector();
        }
        return projector;
    }
    
    public void on(){
        if (!ligado) {
            System.out.println("    Ligando Projetor!");
            ligado = true;
        }
    }
    
    public void off(){
        if (ligado) {
            System.out.println("    Desligando Projetor!");
            ligado = false;
            wideScreen = false;
        }
    }
    
    public void tvMode(VideoDevice dispositivo){
        if (ligado) {
            this.dispositivo = dispositivo;
            System.out.println("    Definindo nova entrada de video: " + this.dispositivo);
        } else{
            System.out.println("    Projetor desligado!");
        }
    }
    
    public void wideScreenMode(){
        if (ligado) {
            System.out.println("    Definindo Modo WideScreen do Projetor!");
            wideScreen = true;
        } else{
            System.out.println("    Projetor desligado!");
        }
    }

    @Override
    public String toString() {
        if (ligado) {
            if (wideScreen) {
                return "Projetor ligado! Modo WideScreen ativado! Dispositivo Video conectado: " + dispositivo;
            }
            return "Projetor ligado! Modo WideScreen desativado! Dispositivo Video conectado: " + dispositivo;
        }
        return "Projetor desligado!";
    }
}