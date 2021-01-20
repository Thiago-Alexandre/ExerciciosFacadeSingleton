package audio;

import others.Amplifier;

public class CDPlayer implements AudioDevice{
    
    private String cd;
    private StateCDPlayer state;
    private static CDPlayer cdPlayer;
    private final Amplifier amplifier;
    
    private CDPlayer(){
        cd = null;
        amplifier = Amplifier.getInstance();
        state = new CDPlayerDesligado(this);
    }
    
    public static CDPlayer getInstance(){
        if (cdPlayer == null){
            cdPlayer = new CDPlayer();
        }
        return cdPlayer;
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
    
    public void inserirCD(String cd){
        state.inserirCD(cd);
    }
    
    protected void setCD(String cd){
        this.cd = cd;
    }
    
    public void setState(StateCDPlayer state){
        this.state = state;
    }

    public String getCd() {
        return cd;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}