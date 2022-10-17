package pattern_strategy.worker_exapmle;

public class HandJob implements IJob{
    @Override
    public void doJob() {
        System.out.println("Hand job");
    }
}
