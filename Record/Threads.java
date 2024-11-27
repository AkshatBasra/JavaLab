class BMS extends Thread {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class CSE extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadProgram {
    public static void main(String[] args) {
	System.out.println("Akshat Basra 1BM23CS020");
        BMS bmsThread = new BMS();
        bmsThread.start();
        
        CSE cseThread = new CSE();
        cseThread.start();
    }
}
