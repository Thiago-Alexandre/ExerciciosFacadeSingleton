package others;

public class PopcornPopper {
    
    private Boolean ligada;
    private Boolean preparo;
    private static PopcornPopper pipoca;
    
    private PopcornPopper(){
        ligada = false;
        preparo = false;
    }
    
    public static PopcornPopper getInstance(){
        if (pipoca == null) {
            pipoca = new PopcornPopper();
        }
        return pipoca;
    }
    
    public void on(){
        if (!ligada) {
            System.out.println("    Ligando Máquina de Pipoca!");
            ligada = true;
        }
    }
    
    public void off(){
        if (ligada) {
            System.out.println("    Desligando Máquina de Pipoca!");
            ligada = false;
            preparo = false;
        }
    }
    
    public void pop(){
        if (ligada) {
            System.out.println("    Iniciando preparo da pipoca!");
            preparo = true;
        } else{
            System.out.println("    Ligue a máquina de pipoca!");
        }
    }

    @Override
    public String toString() {
        if (ligada) {
            if (preparo) {
                return "Máquina de pipoca ligada! Pipoca pronta!";
            }
            return "Máquina de pipoca ligada!";
        }
        return "Máquina de pipoca desligada!";
    }
}