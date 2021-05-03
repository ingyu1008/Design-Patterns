public class SystemSpeaker {
    private static SystemSpeaker instance;
    private int volume;

    private SystemSpeaker(){
        this.volume = 0;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}