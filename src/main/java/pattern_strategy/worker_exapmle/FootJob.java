package pattern_strategy.worker_exapmle;

public class FootJob implements IJob{
    @Override
    public void doJob() {
        System.out.println("Foot job");
    }
}
