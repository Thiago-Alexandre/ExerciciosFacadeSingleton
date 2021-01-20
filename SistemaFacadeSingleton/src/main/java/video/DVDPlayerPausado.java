package video;

public class DVDPlayerPausado implements StateDVDPlayer{
    
    private final DVDPlayer player;
    
    public DVDPlayerPausado(DVDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    DVDPlayer está ligado!");
    }

    @Override
    public void off() {
        System.out.println("    Parando a reprodução de '" + player.getDVD() + "'!");
        System.out.println("    Desligando DVD Player!");
        player.setState(new DVDPlayerDesligado(player));
    }

    @Override
    public void eject() {
        System.out.println("    DVD pausado!");
    }

    @Override
    public void play() {
        System.out.println("    Reproduzindo '"+ player.getDVD() + "'!");
        player.setState(new DVDPlayerReproduzindo(player));
    }

    @Override
    public void pause() {
        System.out.println("    Reprodução pausada!");
    }

    @Override
    public void stop() {
        System.out.println("    Parando a reprodução de '" + player.getDVD() + "'!");
        player.setState(new DVDPlayerParado(player));
    }

    @Override
    public void inserirDVD(String dvd) {
        System.out.println("    DVD pausado!");
    }
    
    @Override
    public String toString() {
        return "DVDPlayer ligado! '" + player.getDVD() + "' Pausado!";
    }
}