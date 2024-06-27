public class Main {
    public static void main(String[] args) {
        //OnTaskDoneListener listener = System.out::println;
        OnTaskDoneListener listener = result -> System.out.println("Success: " + result);

        Worker worker = new Worker(listener);
        worker.start();
    }
}