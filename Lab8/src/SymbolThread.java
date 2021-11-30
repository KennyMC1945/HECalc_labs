/**
 * todo Document type SymbolThread
 */
public class SymbolThread extends Thread {

    public volatile StringBuilder sb;

    public SymbolThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i<100; i++)
                System.out.println(sb.toString());
            char newChar = (char) (sb.charAt(0) + 1);
            sb.replace(0, sb.length(), "" + newChar);
        }
    }
}
