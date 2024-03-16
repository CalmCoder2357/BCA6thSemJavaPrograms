public class FiveThreadPriority {

    public static void main(String[] args) throws InterruptedException {
        // Create five threads with different priorities
        Thread thread1 = new Thread(new MyTask(), "Thread 1");
        Thread thread2 = new Thread(new MyTask(), "Thread 2");
        Thread thread3 = new Thread(new MyTask(), "Thread 3");
        Thread thread4 = new Thread(new MyTask(), "Thread 4");
        Thread thread5 = new Thread(new MyTask(), "Thread 5");

        // Set priorities (1 is lowest, 10 is highest)
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY - 1);
        thread3.setPriority(Thread.NORM_PRIORITY); // Default priority
        thread4.setPriority(Thread.NORM_PRIORITY + 1);
        thread5.setPriority(Thread.MAX_PRIORITY); // Highest priority

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        System.out.println("All threads started!");
    }
}

class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Message: " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}