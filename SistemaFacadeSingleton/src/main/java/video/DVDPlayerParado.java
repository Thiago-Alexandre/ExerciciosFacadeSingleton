package video;

public class DVDPlayerParado implements StateDVDPlayer{
    
    private final DVDPlayer player;
    
    public DVDPlayerParado(DVDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    DVDPlayer está ligado!");
    }

    @Override
    public void off() {
        System.out.println("    Desligando DVD Player!");
        player.setState(new DVDPlayerDesligado(player));
    }

    @Override
    public void eject() {
        System.out.println("    Ejetando '"+ player.getDVD() + "'!");
        player.setDVD(null);
        player.setState(new DVDPlayerLigado(player));
    }

    @Override
    public void play() {
        System.out.println("    Iniciando reprodução de '"+ player.getDVD() + "'!");
        player.setState(new DVDPlayerReproduzindo(player));
    }

    @Override
    public void pause() {
        System.out.println("    Reprodução parada!");
    }

    @Override
    public void stop() {
        System.out.println("    Reprodução parada!");
    }

    @Override
    public void inserirDVD(String dvd) {
        System.out.println("    Ejetando '"+ player.getDVD() + "'!");
        player.setDVD(dvd);
        System.out.println("    Inserindo '"+ player.getDVD() + "'!");
        player.setState(new DVDPlayerLigado(player));
    }

    @Override
    public String toString() {
        return "DVDPlayer ligado! '" + player.getDVD() + "' Parado!";
    }
}