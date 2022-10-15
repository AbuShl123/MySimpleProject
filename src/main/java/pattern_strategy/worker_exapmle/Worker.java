package pattern_strategy.worker_exapmle;

public class Worker {
    private IJob job;

    public Worker () {
        setJob(new HandJob());
    }

    public void setJob(IJob job) {
        this.job = job;
    }

    public void doWork() {
        job.doJob();
    }
}
