package audio;

public interface StateCDPlayer {
    
    public void on();
    
    public void off();
    
    public void eject();
    
    public void play();
    
    public void pause();
    
    public void stop();
    
    public void inserirCD(String cd);
}