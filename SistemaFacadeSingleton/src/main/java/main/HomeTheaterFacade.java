package main;

import audio.CDPlayer;
import audio.Tuner;
import others.Amplifier;
import others.PopcornPopper;
import others.Screen;
import others.TheaterLights;
import video.DVDPlayer;
import video.Projector;

public class HomeTheaterFacade {
    
    private static HomeTheaterFacade objetoHTF;
    private final CDPlayer cdPlayer;
    private final DVDPlayer dvdPlayer;
    private final Tuner tuner;
    private final Amplifier amplifier;
    private final PopcornPopper pipoca;
    private final Screen screen;
    private final TheaterLights lights;
    private final Projector projector;
    
    private HomeTheaterFacade(){
        cdPlayer = CDPlayer.getInstance();
        tuner = Tuner.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
        amplifier = Amplifier.getInstance();
        pipoca = PopcornPopper.getInstance();
        screen = Screen.getInstance();
        lights = TheaterLights.getIsntance();
        projector = Projector.getInstance();
    }
    
    public static HomeTheaterFacade getInstance(){
    
        if (objetoHTF == null){
            objetoHTF = new HomeTheaterFacade();
        }
        return objetoHTF;
    }
    
    public void watchMovie(){
        pipoca.on();
        pipoca.pop();
        lights.on();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.tvMode(dvdPlayer);
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setAudio(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(50);
        dvdPlayer.on();
        dvdPlayer.play();
    }
    
    public void endMovie(){
        pipoca.off();
        lights.dim(100);
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
    
    public void listenToCD(){
        cdPlayer.on();
        amplifier.on();
        amplifier.setAudio(cdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(40);
        cdPlayer.play();
    }
    
    public void endCD(){
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.off();
        amplifier.off();
    }
    
    public void listenToRadio(){
        tuner.on();
        tuner.setFM();
        tuner.setFrequency(500);
        amplifier.on();
        amplifier.setAudio(tuner);
        amplifier.setStereoSound();
        amplifier.setVolume(20);
    }
    
    public void endRadio(){
        tuner.off();
        amplifier.off();
    }

    @Override
    public String toString() {
        String homeTheater = "Detalhes:";
        homeTheater += "\n      " + cdPlayer.toString();
        homeTheater += "\n      " + dvdPlayer;
        homeTheater += "\n      " + tuner;
        homeTheater += "\n      " + amplifier;
        homeTheater += "\n      " + pipoca;
        homeTheater += "\n      " + screen;
        homeTheater += "\n      " + lights;
        homeTheater += "\n      " + projector;
        return homeTheater;
    }
}