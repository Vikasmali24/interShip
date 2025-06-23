package Demo;

class SharedResource {
    public synchronized void printMessage(String message) {
        System.out.print("[ " + message);
        try {
            Thread.sleep(500); // simulate delay
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(" ]");
    }
}

class SyncThread extends Thread {
    SharedResource resource;
    String message;

    SyncThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.printMessage(message);
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        SyncThread t1 = new SyncThread(resource, "Hello");
        SyncThread t2 = new SyncThread(resource, "World");
        t1.start();
        t2.start();
    }
}