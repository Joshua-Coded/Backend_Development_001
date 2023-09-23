public class CdPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Rocking the music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the music...");
    }
}