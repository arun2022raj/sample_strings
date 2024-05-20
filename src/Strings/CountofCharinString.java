package Strings;

//public class CountofCharinString {
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//	    char j=sc.next().charAt(0);
//	    String z="cadksjflkjaognfvcsdkoafjidiv";
//	   // char l=z.charAt(0);
//	   // System.out.println(j.equals(z.charAt(0)));
//	    int c=0;
//	    for (int i=0;i<z.length();i++)
//	    {
//	        if (j == z.charAt(i))
//	        {
//	            c++;
//	        }
//	    }
//	    System.out.println(c);
//	}
//
//}

//class MyObject {
//    public synchronized void doSomething() {
//        System.out.println("Doing something...");
//        notify(); // Notify a waiting thread
//    }
//
//    public synchronized void waitForNotification() throws InterruptedException {
//        System.out.println("Waiting for notification...");
//        wait(); // Wait until notified
//        System.out.println("Notification received!");
//    }
//}
//	
//public class CountofCharinString {
//    public static void main(String[] args) {
//        MyObject obj = new MyObject();
//
//        Thread waitingThread = new Thread(() -> {
//            try {
//                obj.waitForNotification();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        waitingThread.start();
//
//        // Let the waitingThread start waiting
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Call doSomething, which will notify the waitingThread
//        obj.doSomething();
//    }
//}
//


class MyObject {
    public synchronized void doSomething() {
        System.out.println("Doing something...");
        notifyAll(); // Notify all waiting threads
    }

    public synchronized void waitForNotification() throws InterruptedException {
        System.out.println("Thread " + Thread.currentThread().getName() + " waiting for notification...");
        wait(); // Wait until notified
        System.out.println("Thread " + Thread.currentThread().getName() + " notification received!");
    }
}

public class CountofCharinString {
    public static void main(String[] args) {
        MyObject obj = new MyObject();

        // Create multiple threads waiting for notification
        for (int i = 0; i < 5; i++) {
            Thread waitingThread = new Thread(() -> {
                try {
                    obj.waitForNotification();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            waitingThread.start();
        }

        // Let the waitingThreads start waiting
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Call doSomething, which will notify all waitingThreads
        obj.doSomething();
    }
}
