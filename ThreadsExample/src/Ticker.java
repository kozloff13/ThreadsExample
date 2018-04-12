public class Ticker implements Runnable {

    private final String name;

    public Ticker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(300);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}

