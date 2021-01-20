package video;

public class DVDPlayerLigado implements StateDVDPlayer{
    
    private final DVDPlayer player;
    
    public DVDPlayerLigado(DVDPlayer player){
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
        if (player.getDVD() != null) {
            System.out.println("    Ejetando '"+ player.getDVD() + "'!");
            player.setDVD(null);
        } else{
            System.out.println("    Nenhum dvd encontrado!");
        }
    }

    @Override
    public void play() {
        if (player.getDVD() != null) {
            System.out.println("    Iniciando reprodução de '"+ player.getDVD() + "'!");
            player.setState(new DVDPlayerReproduzindo(player));
        } else{
            System.out.println("    Nenhum dvd encontrado!");
        }
    }

    @Override
    public void pause() {
        System.out.println("    Nenhum dvd em reprodução!");
    }

    @Override
    public void stop() {
        System.out.println("    Nenhum dvd em reprodução!");
    }

    @Override
    public void inserirDVD(String dvd) {
        if (player.getDVD() != null) {
            System.out.println("    Ejetando '"+ player.getDVD() + "'!");
        }
        player.setDVD(dvd);
        System.out.println("    Inserindo '"+ player.getDVD() + "'!");
    }
    
    @Override
    public String toString() {
        if (player.getDVD() != null) {
            return "DVDPlayer Ligado! '" + player.getDVD() + "' está inserido!";
        }
        return "DVDPlayer Ligado! Nenhum cd encontrado!";
    }
}