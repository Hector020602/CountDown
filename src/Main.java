import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        final int INITIAL_VALUE = 10;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = INITIAL_VALUE; i >= 1; i--) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            int x = queue.remove();
            System.out.print(x + " ");
        }
    }
}
