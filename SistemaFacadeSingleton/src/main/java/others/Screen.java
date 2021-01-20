package others;

public class Screen {
    
    private Boolean erguida;
    private static Screen screen;
    
    private Screen(){
        erguida = true;
    }
    
    public static Screen getInstance(){
        if (screen == null) {
            screen = new Screen();
        }
        return screen;
    }
    
    public void up(){
        if (!erguida) {
            System.out.println("    Subindo tela de projeção!");
            erguida = true;
        }
    }
    
    public void down(){
        if (erguida) {
            System.out.println("    Descendo tela de projeção!");
            erguida = false;
        }
    }

    @Override
    public String toString() {
        if (erguida) {
            return "Tela de projeção erguida!";
        }
        return "Tela de projeção pronta para assistir!";
    }
}