import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int i = 0;

    @Override
    public Integer call() throws Exception {
        while (i < 4) {
            i++;
            Thread.sleep(2500);
            System.out.println("Всем привет! Я " + Thread.currentThread().getName());
        }
        return i;
    }
}
