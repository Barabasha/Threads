public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Resource resourceObj = new Resource();
//        Thread thread1 = new Thread(new MyThread(resourceObj));
//        Thread thread2 = new Thread(new MyThread2(resourceObj));
//        Thread thread3 = new Thread(new MyThread2(resourceObj));
        Thread thread1 = new Thread(new Levak(resourceObj));
        Thread thread2 = new Thread(new Levak(resourceObj));
        Thread thread3 = new Thread(new Levak(resourceObj));


            thread1.start();
            thread2.start();
            thread3.start();
            Thread.sleep(2000);
                   System.out.println(resourceObj.getCounter());

    }
}
