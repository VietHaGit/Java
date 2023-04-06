package Simple;

public class WorkingThread extends Thread {
    public WorkingThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
        }
    }

    public static void main(String[] args) {
        WorkingThread workingThread = new WorkingThread("Running");

        workingThread.start();

    }
}

