public class iPhone implements ReprodutorMusical, NavegadornaInternet, Aparelhotelefonico {


    // MusicPlayer methods
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    // Phone methods
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving call...");
    }

    @Override
    public void endCall() {
        System.out.println("Call ended.");
    }

    // InternetBrowser methods
    @Override
    public void openPage(String url) {
        System.out.println("Opening page: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page...");
    }

    @Override
    public void closePage() {
        System.out.println("Closing page.");
    }
}