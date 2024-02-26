package report.service;
import messaging.implementations.RabbitMqQueue;

public class StartUp {
    public static void main(String[] args) throws Exception {
        new StartUp().startUp();
    }

    private void startUp() throws Exception {
        System.out.println("startup");
        var mq = new RabbitMqQueue("rabbitMq");
        var repository = new ReportRepository();
        new ReportService(mq, repository);
    }
}