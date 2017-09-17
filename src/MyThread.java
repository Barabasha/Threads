import static java.lang.Thread.sleep;

public class MyThread implements Runnable {
    private Resource resourceObj;

    MyThread(Resource resourceObj) {
        this.resourceObj = resourceObj;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                sleep(2);
                System.out.println("long");
                resourceObj.IncrementAndPrint();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
