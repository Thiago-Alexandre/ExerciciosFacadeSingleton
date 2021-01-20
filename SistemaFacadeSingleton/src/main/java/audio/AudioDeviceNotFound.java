package audio;

public class AudioDeviceNotFound implements AudioDevice{

    private static AudioDeviceNotFound notFound;
    
    private AudioDeviceNotFound(){}
    
    public static AudioDeviceNotFound getInstance(){
        if (notFound == null) {
            notFound = new AudioDeviceNotFound();
        }
        return notFound;
    }
    
    @Override
    public String toString() {
        return "Dispositivo de audio não encontrado!";
    }
}