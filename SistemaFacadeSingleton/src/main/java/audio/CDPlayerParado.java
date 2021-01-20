package audio;

public class CDPlayerParado implements StateCDPlayer{
    
    private final CDPlayer player;
    
    public CDPlayerParado(CDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    CDPlayer está ligado!");
    }

    @Override
    public void off() {
        System.out.println("    Desligando CD Player!");
        player.setState(new CDPlayerDesligado(player));
    }

    @Override
    public void eject() {
        System.out.println("    Ejetando '"+ player.getCd() + "'!");
        player.setCD(null);
        player.setState(new CDPlayerLigado(player));
    }

    @Override
    public void play() {
        System.out.println("    Iniciando reprodução de '"+ player.getCd() + "'!");
        player.setState(new CDPlayerReproduzindo(player));
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
    public void inserirCD(String cd) {
        System.out.println("    Ejetando '"+ player.getCd() + "'!");
        player.setCD(cd);
        System.out.println("    Inserindo '"+ player.getCd() + "'!");
        player.setState(new CDPlayerLigado(player));
    }

    @Override
    public String toString() {
        return "CDPlayer ligado! '" + player.getCd() + "' Parado!";
    }
}