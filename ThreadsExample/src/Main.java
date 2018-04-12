import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Ticker first = new Ticker("first");
        Ticker second = new Ticker("Second");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);
    }
}
