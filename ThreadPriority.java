public class ThreadPriority {

    public static void main(String[] args) {
        // Create a shared resource (counter)
        Counter counter = new Counter();

        // Create two threads with different priorities
        Thread highPriorityThread = new Thread(() -> counter.incrementAndPrint(true), "High Priority");
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        Thread lowPriorityThread = new Thread(() -> counter.incrementAndPrint(false), "Low Priority");
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start both threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

class Counter {
    private int value = 0;

    public synchronized void incrementAndPrint(boolean isHighPriority) {
        value++;
        System.out.println(Thread.currentThread().getName() + ": " + value + " (isHighPriority: " + isHighPriority + ")");
    }
}