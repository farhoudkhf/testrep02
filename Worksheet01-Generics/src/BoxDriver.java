import java.lang.*;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Farhoud on 12/01/2016.
 */
public class BoxDriver {
    public static void main(String[] args) {
        IntBox intBox = new IntBox(42);
        int x = intBox.getData();
       /**
        StrBox strBox = new StrBox("Hello");
        String s = strBox.getData();
        int y = (Integer) strBox.getData();
        intBox = strBox;
        */
    }
}
