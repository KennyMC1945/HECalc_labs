public class Lab8Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Decades());
        Thread th2 = new Thread(new Decades());
        Thread th3 = new Thread(new Decades());
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException ignored) {}
        StringBuilder sb = new StringBuilder("a");
        SymbolThread s1 = new SymbolThread(sb);
        SymbolThread s2 = new SymbolThread(sb);
        SymbolThread s3 = new SymbolThread(sb);
        s1.start();
        s2.start();
        s3.start();
    }



}
