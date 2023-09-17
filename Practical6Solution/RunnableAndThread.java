public  class RunnableAndThread {
    public static void main(String[] args) {
        // Multithreading using Thread class
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        // Multithreading using Runnable interface
        Runnable runnable1 = new MyRunnable("Runnable 1");
        Runnable runnable2 = new MyRunnable("Runnable 2");

        Thread thread3 = new Thread(runnable1);
        Thread thread4 = new Thread(runnable2);

        thread3.start();
        thread4.start();
    }
}

// Thread class implementation
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running " + threadName + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable interface implementation
class MyRunnable implements Runnable {
    private String runnableName;

    public MyRunnable(String name) {
        runnableName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running " + runnableName + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} {
    
}
