package others;

import audio.AudioDevice;
import audio.AudioDeviceNotFound;
import video.VideoDevice;

public class Amplifier {
    
    private Boolean ligado;
    private Boolean stereoSound;
    private AudioDevice audio;
    private Integer volume;
    private static Amplifier amplifier;
    
    private Amplifier(){
        ligado = false;
        stereoSound = true;
        audio = AudioDeviceNotFound.getInstance();
        volume = 10;
    }
    
    public static Amplifier getInstance(){
        if (amplifier == null) {
            amplifier = new Amplifier();
        }
        return amplifier;
    }
    
    public void on(){
        if (!ligado) {
            System.out.println("    Ligando amplificador!");
            ligado = true;
        }
    }
    
    public void off(){
        if (ligado) {
            System.out.println("    Desligando amplificador!");
            ligado = false;
        }
    }
    
    public void setStereoSound(){
        if (!stereoSound) {
            System.out.println("    Definindo modo de som Stereo!");
            stereoSound = true;
        }
    }
    
    public void setSurroundSound(){
        if (stereoSound) {
            System.out.println("    Definindo modo de som Surround!");
            stereoSound = false;
        }
    }

    public void setAudio(AudioDevice audio) {
        if (ligado) {
            this.audio = audio;
            System.out.println("    Definindo Audio: " + this.audio.toString());
        } else{
            System.out.println("    Amplificador desligado!");
        }
    }

    public void setVolume(Integer volume) {
        if (volume > 100) {
            volume = 100;
        }
        if (volume < 0) {
            volume = 0;
        }
        if (this.volume > volume) {
            System.out.println("    Diminuindo volume para " + volume + "!");
        } 
        if (this.volume < volume){
            System.out.println("    Aumentando volume para " + volume + "!");
        }
        this.volume = volume;
    }

    @Override
    public String toString() {
        if (ligado) {
            String amplificador = "Amplificador ligado!";
            if (stereoSound) {
                amplificador += " Modo de Som Stereo!";
            } else{
                amplificador += " Modo de Som Surround!";
            }
            amplificador += " Volume: " + volume;
            amplificador += "\n         Dispositivo de Audio: " + audio;
            return amplificador;
        }
        return "Amplificador desligado!";
    }
}