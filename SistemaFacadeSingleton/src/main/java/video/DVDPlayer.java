package video;

import audio.AudioDevice;
import others.Amplifier;

public class DVDPlayer implements VideoDevice, AudioDevice{
    
    private final Amplifier amplifier;
    private String dvd;
    private Boolean twoChannel;
    private StateDVDPlayer state;
    private static DVDPlayer dvdPlayer;
    
    private DVDPlayer(){
        dvd = null;
        twoChannel = true;
        state = new DVDPlayerDesligado(this);
        amplifier = Amplifier.getInstance();
    }
    
    public static DVDPlayer getInstance(){
        if (dvdPlayer == null) {
            dvdPlayer = new DVDPlayer();
        }
        return dvdPlayer;
    }
    
    public void on(){
        state.on();
    }
    
    public void off(){
        state.off();
    }
    
    public void eject(){
        state.eject();
    }
    
    public void pause(){
        state.pause();
    }
    
    public void play(){
        state.play();
    }
    
    public void stop(){
        state.stop();
    }
    
    public void inserirDVD(String dvd){
        state.inserirDVD(dvd);
    }
    
    protected void setDVD(String dvd){
        this.dvd = dvd;
    }
    
    public void setSurroundAudio(){
        System.out.println("    Definindo audio Surround!");
        twoChannel = false;
    }
    
    public void setTwoChannelAudio(){
        System.out.println("    Definindo audio 2.0!");
        twoChannel = true;
    }

    public void setState(StateDVDPlayer state){
        this.state = state;
    }
    
    public String getDVD(){
        return dvd;
    }
    
    public Boolean getChannel(){
        return twoChannel;
    }
    
    @Override
    public String toString() {
        return state.toString();
    }
}