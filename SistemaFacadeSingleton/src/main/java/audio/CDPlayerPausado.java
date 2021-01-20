package audio;

public class CDPlayerPausado implements StateCDPlayer{
    
    private final CDPlayer player;
    
    public CDPlayerPausado(CDPlayer player){
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
        System.out.println("    CD pausado!");
    }

    @Override
    public void play() {
        System.out.println("    Reproduzindo '"+ player.getCd() + "'!");
        player.setState(new CDPlayerReproduzindo(player));
    }

    @Override
    public void pause() {
        System.out.println("    Reprodução pausada!");
    }

    @Override
    public void stop() {
        System.out.println("    Parando a reprodução de '" + player.getCd() + "'!");
        player.setState(new CDPlayerParado(player));
    }

    @Override
    public void inserirCD(String cd) {
        System.out.println("    CD pausado!");
    }
    
    @Override
    public String toString() {
        return "CDPlayer ligado! '" + player.getCd() + "' Pausado!";
    }
}