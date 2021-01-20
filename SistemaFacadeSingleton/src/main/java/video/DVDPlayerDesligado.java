package video;

public class DVDPlayerDesligado implements StateDVDPlayer{
    
    private final DVDPlayer player;
    
    public DVDPlayerDesligado(DVDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    Ligando DVD Player!");
        player.setState(new DVDPlayerLigado(player));
    }

    @Override
    public void off() {
        System.out.println("    DVDPlayer está desligado!");
    }

    @Override
    public void eject() {
        System.out.println("    DVDPlayer está desligado!");
    }

    @Override
    public void play() {
        System.out.println("    DVDPlayer está desligado!");
    }

    @Override
    public void pause() {
        System.out.println("    DVDPlayer está desligado!");
    }

    @Override
    public void stop() {
        System.out.println("    DVDPlayer está desligado!");
    }

    @Override
    public void inserirDVD(String dvd) {
        System.out.println("    DVDPlayer está desligado!");
    }
    
    @Override
    public String toString() {
        return "DVDPlayer Desligado!";
    }
}