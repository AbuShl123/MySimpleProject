package pattern_strategy.worker_exapmle;

public class Program {
    // Strategy is a behavioral design pattern that
    // turns a set of behaviors into objects and makes them interchangeable
    // inside original context object.

    public static void main(String[] args) {
        Worker worker = new Worker(); // <- context object
        worker.setJob(new HandJob()); // setter
        worker.doWork();
        worker.doWork();
    }
}
