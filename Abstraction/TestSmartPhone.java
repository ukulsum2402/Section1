// Interface 1: Camera
interface Camera {
    void takePhoto();
}

// Interface 2: MusicPlayer
interface MusicPlayer {
    void playMusic();
}

// Class SmartPhone implements both Camera and MusicPlayer
class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with SmartPhone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on SmartPhone");
    }
}

// Test class
public class TestSmartPhone {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.takePhoto();   // Camera method
        sp.playMusic();   // MusicPlayer method
    }
}
