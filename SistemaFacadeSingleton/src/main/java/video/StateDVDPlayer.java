package video;

public interface StateDVDPlayer {
    
    public void on();
    
    public void off();
    
    public void eject();
    
    public void play();
    
    public void pause();
    
    public void stop();
    
    public void inserirDVD(String dvd);
}