public class NotifyAndWaitExample2 {
    static int i = 0;

    public static void main(String[] args) {
    	Object o = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    if (i <= 0) {
                        System.out.println("i=" + i + "in t1");
                        System.out.println(Thread.currentThread().getName() + "is running");
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "is waken up");
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    i++;
                    System.out.println("i=" + i + "in t4");
                    System.out.println(Thread.currentThread().getName() + "is notifying");
                    try {
                        Thread.sleep(1000);
                        notify();
                        System.out.println("notified");
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t4.start();
    }
}