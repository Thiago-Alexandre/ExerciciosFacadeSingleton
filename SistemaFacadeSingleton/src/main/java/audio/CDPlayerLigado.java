package audio;

public class CDPlayerLigado implements StateCDPlayer{
    
    private final CDPlayer player;
    
    public CDPlayerLigado(CDPlayer player){
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
        if (player.getCd() != null) {
            System.out.println("    Ejetando '"+ player.getCd() + "'!");
            player.setCD(null);
        } else{
            System.out.println("    Nenhum cd encontrado!");
        }
    }

    @Override
    public void play() {
        if (player.getCd() != null) {
            System.out.println("    Iniciando reprodução de '"+ player.getCd() + "'!");
            player.setState(new CDPlayerReproduzindo(player));
        } else{
            System.out.println("    Nenhum cd encontrado!");
        }
    }

    @Override
    public void pause() {
        System.out.println("    Nenhum cd em reprodução!");
    }

    @Override
    public void stop() {
        System.out.println("    Nenhum cd em reprodução!");
    }

    @Override
    public void inserirCD(String cd) {
        if (player.getCd() != null) {
            System.out.println("    Ejetando '"+ player.getCd() + "'!");
        }
        player.setCD(cd);
        System.out.println("    Inserindo '"+ player.getCd() + "'!");
    }

    @Override
    public String toString() {
        if (player.getCd() != null) {
            return "CDPlayer Ligado! '" + player.getCd() + "' está inserido!";
        }
        return "CDPlayer Ligado! Nenhum cd encontrado!";
    }
}