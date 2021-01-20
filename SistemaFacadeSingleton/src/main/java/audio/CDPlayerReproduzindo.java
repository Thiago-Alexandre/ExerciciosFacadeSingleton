package audio;

public class CDPlayerReproduzindo implements StateCDPlayer{
    
    private final CDPlayer player;
    
    public CDPlayerReproduzindo(CDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    CDPlayer está ligado!");
    }

    @Override
    public void off() {
        System.out.println("    Parando a reprodução de '" + player.getCd() + "'!");
        System.out.println("    Desligando CD Player!");
        player.setState(new CDPlayerDesligado(player));
    }

    @Override
    public void eject() {
        System.out.println("    CD em reprodução!");
    }

    @Override
    public void play() {
        System.out.println("    Em reprodução: '"+ player.getCd() + "'!");
    }

    @Override
    public void pause() {
        System.out.println("    Pausando a reprodução de '" + player.getCd() + "'!");
        player.setState(new CDPlayerPausado(player));
    }

    @Override
    public void stop() {
        System.out.println("    Parando a reprodução de '" + player.getCd() + "'!");
        player.setState(new CDPlayerParado(player));
    }

    @Override
    public void inserirCD(String cd) {
        System.out.println("    CD em reprodução!");
    }

    @Override
    public String toString() {
        return "CDPlayer Ligado! Reproduzindo " + player.getCd() + "!";
    }
}