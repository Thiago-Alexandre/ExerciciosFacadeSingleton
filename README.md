# ExerciciosFacadeSingleton

### Exercícios realizados na disciplina de Programação VI, utilizando os padrões Facade e Singleton.

#### Descrição do problema: Considere a implementação de um sistema de Hometheater composto por diversos subsistemas, tais como: Tuner (radio), Screen (tela de projeção), PopcornPopper (máquina de fazer pipoca), CdPayer, DvdPlayer, Projector (projetor multimídia), TheaterLights (coltroles de iluminação da sala) e Amplifier (amplificador de ́audio). Devido à complexidade de operação do sistema por parte do cliente, sua tarefa ́e simplificar seu uso por meio da implementação do padrão de projeto Facade com a classe HomeTheaterFacade. Importante: além disso, você deve se certificar que a classe HomeTheaterFacade ́e um Singleton.

#### Os métodos da classe HomeTheaterFacade são descritos a seguir:

1. O método watchMovie() é utilizado para configurar a sala de projeção e reproduzir um filme em DVD. Esta operação compreende as seguintes tarefas nos subsistemas:

* Ligar a máquina de pipoca;
* Iniciar o preparo da pipoca;
* Diminuir luzes do ambiente;
* Descer a tela de projeção;
* Ligar o projetor;
* Selecionar a entrada do projetor para DVD;
* Configurar o projetor para modo widescreen;
* Ligar o amplificador de ́audio;
* Selecionar o amplificador para entrada de DVD;
* Selecionar o amplificador para som surround;
* Ajustar o volume do amplificador para “médio” (vol 5);
* Ligar o DVD player;
* Iniciar a reprodução do DVD.

2. O método endMovie() é utilizado para encerrar a reprodução de um filme em DVD e reconfigurar a sala de projeção. Esta operação compreende as seguintes tarefas nos subsistemas:

* Desligar a máquina de pipoca;
* Acender as luzes do ambiente;
* Subir a tela de projeção;
* Desligar o projetor;
* Desligar o amplificador de ́audio;
* Parar a reprodução do DVD;
* Ejetar o disco (DVD);
* Desligar o DVD player.

3. Invente novas sequências de comandos dos subsistemas para os métodos: *listenToCd()*, *endCD()*, *listenToRadio()* e *endRadio()*.

### Observações da implementação:

#### Como o Facade acessa os subsistemas sem impedir que o cliente possa acessá-los diretamente, as classes representantes dos subsistemas também foram geradas usando o Singleton, além da classe HomeTheaterFacade. Assim, o cliente pode acessar os dispositivos da mesma forma que o Facade, sem gerar novos dispositivos e mantendo suas características após o uso. Foi utilizado também o padrão State para controlar alguns subsistemas.

### Execução do Sistema

```
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes desligadas!
      Projetor desligado!
***************************************************
Acessando dispositivos diretamente:
    Ligando Luzes!
    Ligando DVD Player!
    Inserindo 'Filme1'!
    Desligando DVD Player!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Chamando recurso FACADE:
    Ligando Máquina de Pipoca!
    Iniciando preparo da pipoca!
    Diminuindo intensidade das luzes para 10%!
    Descendo tela de projeção!
    Ligando Projetor!
    Definindo nova entrada de video: DVDPlayer Desligado!
    Definindo Modo WideScreen do Projetor!
    Ligando amplificador!
    Definindo Audio: DVDPlayer Desligado!
    Definindo modo de som Surround!
    Aumentando volume para 50!
    Ligando DVD Player!
    Iniciando reprodução de 'Filme1'!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Ligado! Reproduzindo Filme1!
      Rádio desligado!
      Amplificador ligado! Modo de Som Surround! Volume: 50
         Dispositivo de Audio: DVDPlayer Ligado! Reproduzindo Filme1!
      Máquina de pipoca ligada! Pipoca pronta!
      Tela de projeção pronta para assistir!
      Luzes ligadas! Intensidade em 10!
      Projetor ligado! Modo WideScreen ativado! Dispositivo Video conectado: DVDPlayer Ligado! Reproduzindo Filme1!
***************************************************
Acessando dispositivos diretamente:
    Pausando a reprodução de 'Filme1'!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer ligado! 'Filme1' Pausado!
      Rádio desligado!
      Amplificador ligado! Modo de Som Surround! Volume: 50
         Dispositivo de Audio: DVDPlayer ligado! 'Filme1' Pausado!
      Máquina de pipoca ligada! Pipoca pronta!
      Tela de projeção pronta para assistir!
      Luzes ligadas! Intensidade em 10!
      Projetor ligado! Modo WideScreen ativado! Dispositivo Video conectado: DVDPlayer ligado! 'Filme1' Pausado!
***************************************************
Chamando recurso FACADE:
    Desligando Máquina de Pipoca!
    Aumentando intensidade das luzes para 100%!
    Subindo tela de projeção!
    Desligando Projetor!
    Desligando amplificador!
    Parando a reprodução de 'Filme1'!
    Ejetando 'Filme1'!
    Desligando DVD Player!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Acessando dispositivos diretamente:
    Ligando CD Player!
    Inserindo 'CD1'!
***************************************************
Detalhes:
      CDPlayer Ligado! 'CD1' está inserido!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Chamando recurso FACADE:
    CDPlayer está ligado!
    Ligando amplificador!
    Definindo Audio: CDPlayer Ligado! 'CD1' está inserido!
    Diminuindo volume para 40!
    Iniciando reprodução de 'CD1'!
***************************************************
Detalhes:
      CDPlayer Ligado! Reproduzindo CD1!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador ligado! Modo de Som Surround! Volume: 40
         Dispositivo de Audio: CDPlayer Ligado! Reproduzindo CD1!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Acessando dispositivos diretamente:
    Parando a reprodução de 'CD1'!
    Ejetando 'CD1'!
    Inserindo 'CD2'!
    Iniciando reprodução de 'CD2'!
***************************************************
Detalhes:
      CDPlayer Ligado! Reproduzindo CD2!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador ligado! Modo de Som Surround! Volume: 40
         Dispositivo de Audio: CDPlayer Ligado! Reproduzindo CD2!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Chamando recurso FACADE:
    Parando a reprodução de 'CD2'!
    Ejetando 'CD2'!
    Desligando CD Player!
    Desligando amplificador!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Chamando recurso FACADE:
    Ligando o Rádio!
    Definindo sinal FM!
    Definindo a frequencia para 500!
    Ligando amplificador!
    Definindo Audio: Rádio ligado, configurado no sinal FM e na frequencia 500!
    Definindo modo de som Stereo!
    Diminuindo volume para 20!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio ligado, configurado no sinal FM e na frequencia 500!
      Amplificador ligado! Modo de Som Stereo! Volume: 20
         Dispositivo de Audio: Rádio ligado, configurado no sinal FM e na frequencia 500!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Acessando dispositivos diretamente:
    Definindo a frequencia para 1000!
    Aumentando volume para 30!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio ligado, configurado no sinal FM e na frequencia 1000!
      Amplificador ligado! Modo de Som Stereo! Volume: 30
         Dispositivo de Audio: Rádio ligado, configurado no sinal FM e na frequencia 1000!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Chamando recurso FACADE:
    Desligando o Rádio!
    Desligando amplificador!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes ligadas! Intensidade em 100!
      Projetor desligado!
***************************************************
Acessando dispositivos diretamente:
    Desligando Luzes!
***************************************************
Detalhes:
      CDPlayer Desligado!
      DVDPlayer Desligado!
      Rádio desligado!
      Amplificador desligado!
      Máquina de pipoca desligada!
      Tela de projeção erguida!
      Luzes desligadas!
      Projetor desligado!
***************************************************
```