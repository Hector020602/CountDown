import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("d");
        list.add("f");
        list.add("e");
        list.add("g");
        List<String> list2 = heapSort(list);
        System.out.println(list2);


    }

    public static <E>List<E> heapSort(Collection<E> collection) {
        Queue<E> queue = new PriorityQueue<>(collection);
        //System.out.println(queue);
        List<E> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }
        return result;
    }
}
