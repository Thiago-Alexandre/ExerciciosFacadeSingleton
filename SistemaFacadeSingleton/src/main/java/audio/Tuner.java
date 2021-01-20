package audio;

import others.Amplifier;

public class Tuner implements AudioDevice{
    
    private Boolean ligado;
    private Boolean sinalAM;
    private Integer frequencia;
    private static Tuner tuner;
    private final Amplifier amplifier;
    
    private Tuner(){
        ligado = false;
        sinalAM = true;
        frequencia = 0;
        amplifier = Amplifier.getInstance();
    }
    
    public static Tuner getInstance(){
        if (tuner == null) {
            tuner = new Tuner();
        }
        return tuner;
    }
    
    public void on(){
        if (!ligado) {
            System.out.println("    Ligando o Rádio!");
            ligado = true;
        }
    }
    
    public void off(){
        if (ligado) {
            System.out.println("    Desligando o Rádio!");
            ligado = false;
        }
    }
    
    public void setAM(){
        if (ligado) {
            System.out.println("    Definindo sinal AM!");
            sinalAM = true;
        } else{
            System.out.println("    Ligue o Rádio!");
        }
    }
    
    public void setFM(){
        if (ligado) {
            System.out.println("    Definindo sinal FM!");
            sinalAM = false;    
        } else{
            System.out.println("    Ligue o Rádio!");
        }
    }
    
    public void setFrequency(Integer frequencia){
        if (ligado) {
            this.frequencia = frequencia;
            System.out.println("    Definindo a frequencia para " + this.frequencia + "!");    
        } else{
            System.out.println("    Ligue o Rádio!");
        }
    }

    @Override
    public String toString() {
        if (ligado) {
            if (sinalAM) {
                return "Rádio ligado, configurado no sinal AM e na frequencia " + this.frequencia + "!";
            }
            return "Rádio ligado, configurado no sinal FM e na frequencia " + this.frequencia + "!";
        }
        return "Rádio desligado!";
    }
}