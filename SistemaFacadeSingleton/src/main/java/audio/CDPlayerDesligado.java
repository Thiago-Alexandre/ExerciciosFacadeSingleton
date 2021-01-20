package audio;

public class CDPlayerDesligado implements StateCDPlayer{
    
    private final CDPlayer player;
    
    public CDPlayerDesligado(CDPlayer player){
        this.player = player;
    }

    @Override
    public void on() {
        System.out.println("    Ligando CD Player!");
        player.setState(new CDPlayerLigado(player));
    }

    @Override
    public void off() {
        System.out.println("    CDPlayer está desligado!");
    }

    @Override
    public void eject() {
        System.out.println("    CDPlayer está desligado!");
    }

    @Override
    public void play() {
        System.out.println("    CDPlayer está desligado!");
    }

    @Override
    public void pause() {
        System.out.println("    CDPlayer está desligado!");
    }

    @Override
    public void stop() {
        System.out.println("    CDPlayer está desligado!");
    }

    @Override
    public void inserirCD(String cd) {
        System.out.println("C   DPlayer está desligado!");
    }

    @Override
    public String toString() {
        return "CDPlayer Desligado!";
    }
}