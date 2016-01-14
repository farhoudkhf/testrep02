import java.lang.reflect.Array;

/**
 * Created by Farhoud on 12/01/2016.
 */
public class BoxDriverG {
    public static void main(String[] args) {
        Box<Integer> IntBox = new Box<Integer>(42);
        int x = IntBox.getData();

        Box<String> StrBox = new Box<String>("Helloo");
        String s = StrBox.getData();

        System.out.println("hghgfhgf");
    }
}
