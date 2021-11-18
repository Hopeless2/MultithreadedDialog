import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<MyCallable> list = new ArrayList<>();
        list.add(new MyCallable());
        list.add(new MyCallable());
        list.add(new MyCallable());
        list.add(new MyCallable());

        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        threadPool.invokeAll(list);
        final int resultOfTask = threadPool.invokeAny(list);
        System.out.println(resultOfTask);

        threadPool.shutdown();
    }
}
