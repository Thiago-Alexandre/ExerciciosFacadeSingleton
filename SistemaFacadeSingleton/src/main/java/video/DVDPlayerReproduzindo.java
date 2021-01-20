package video;

public class DVDPlayerReproduzindo implements StateDVDPlayer{
    
    private final DVDPlayer player;
    
    public DVDPlayerReproduzindo(DVDPlayer player){
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
        System.out.println("    DVD em reprodução!");
    }

    @Override
    public void play() {
        System.out.println("    Em reprodução: '"+ player.getDVD() + "'!");
    }

    @Override
    public void pause() {
        System.out.println("    Pausando a reprodução de '" + player.getDVD() + "'!");
        player.setState(new DVDPlayerPausado(player));
    }

    @Override
    public void stop() {
        System.out.println("    Parando a reprodução de '" + player.getDVD() + "'!");
        player.setState(new DVDPlayerParado(player));
    }

    @Override
    public void inserirDVD(String dvd) {
        System.out.println("    DVD em reprodução!");
    }
    
    @Override
    public String toString() {
        return "DVDPlayer Ligado! Reproduzindo " + player.getDVD() + "!";
    }
}