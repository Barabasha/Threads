import static java.lang.Thread.sleep;

public class MyThread2 implements Runnable {
    private Resource resourceObj;

    MyThread2(Resource resourceObj) {
        this.resourceObj = resourceObj;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                sleep(1);
                System.out.println("norm");
                resourceObj.IncrementAndPrint();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
