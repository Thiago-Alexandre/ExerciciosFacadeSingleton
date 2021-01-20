package main;

import audio.CDPlayer;
import audio.Tuner;
import others.Amplifier;
import others.PopcornPopper;
import others.Screen;
import others.TheaterLights;
import video.DVDPlayer;
import video.Projector;

public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Como o Facade utiliza os subsistemas sem bloquear o uso direto deles,
         * fiz instâncias únicas com Singleton para cada subsistema.
         * Assim, posso ligar a luz de forma direta, por exemplo, 
         * ou manipular os subsistemas usando o HomeTheaterFacade.
         */
        CDPlayer cdPlayer = CDPlayer.getInstance();
        Tuner tuner = Tuner.getInstance();
        DVDPlayer dvdPlayer = DVDPlayer.getInstance();
        Amplifier amplifier = Amplifier.getInstance();
        PopcornPopper pipoca = PopcornPopper.getInstance();
        Screen screen = Screen.getInstance();
        TheaterLights lights = TheaterLights.getIsntance();
        Projector projector = Projector.getInstance();
        HomeTheaterFacade htf = HomeTheaterFacade.getInstance();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        lights.on();
        dvdPlayer.on();
        dvdPlayer.inserirDVD("Filme1");
        dvdPlayer.off();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.watchMovie();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        dvdPlayer.pause();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.endMovie();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        cdPlayer.on();
        cdPlayer.inserirCD("CD1");
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.listenToCD();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        cdPlayer.stop();
        cdPlayer.inserirCD("CD2");
        cdPlayer.play();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.endCD();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.listenToRadio();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        tuner.setFrequency(1000);
        amplifier.setVolume(30);
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Chamando recurso FACADE:");
        htf.endRadio();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
        System.out.println("Acessando dispositivos diretamente:");
        lights.off();
        System.out.println("***************************************************");
        System.out.println(htf);
        System.out.println("***************************************************");
    }
}