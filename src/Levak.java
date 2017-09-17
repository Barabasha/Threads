import static java.lang.Thread.sleep;


public class Levak extends Thread{
    Resource resourceObj;

    public Levak(Resource resourceObj) {
        this.resourceObj = resourceObj;
    }

    @Override
    public void run() {
           for (int i = 0; i < 1000; i++) {
                resourceObj.IncrementAndPrint();
            }

        }
    }

