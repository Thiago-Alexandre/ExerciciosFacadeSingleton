package video;

public class VideoDeviceNotFound implements VideoDevice{

    private static VideoDeviceNotFound notFound;
    
    private VideoDeviceNotFound(){}
    
    public static VideoDeviceNotFound getInstance(){
        if (notFound == null) {
            notFound = new VideoDeviceNotFound();
        }
        return notFound;
    }
    
    @Override
    public String toString() {
        return "Dispositivo de video não encontrado!";
    }
}