import java.util.ArrayList;
import java.util.List;

public class l {
    public static void main(String[] args) {
        // список
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}