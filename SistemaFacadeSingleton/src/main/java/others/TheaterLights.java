package others;

public class TheaterLights {
    
    private Boolean ligada;
    private Integer intensidade;
    private static TheaterLights lights;
    
    private TheaterLights(){
        ligada = false;
        intensidade = 100;
    }
    
    public static TheaterLights getIsntance(){
        if (lights == null) {
            lights = new TheaterLights();
        }
        return lights;
    }
    
    public void on(){
        if (!ligada) {
            System.out.println("    Ligando Luzes!");
            ligada = true;
        }
    }
    
    public void off(){
        if (ligada) {
            System.out.println("    Desligando Luzes!");
            ligada = false;
        }
    }
    
    public void dim(Integer intensidade){
        if (intensidade > 100) {
            intensidade = 100;
        }
        if (intensidade <= 0) {
            this.off();
        }
        if (this.intensidade > intensidade) {
            System.out.println("    Diminuindo intensidade das luzes para " + intensidade + "%!");
        } 
        if (this.intensidade < intensidade) {
            System.out.println("    Aumentando intensidade das luzes para " + intensidade + "%!");
        }
        this.intensidade = intensidade;
    }

    @Override
    public String toString() {
        if (ligada) {
            return "Luzes ligadas! Intensidade em " + intensidade + "!";
        }
        return "Luzes desligadas!";
    }
}