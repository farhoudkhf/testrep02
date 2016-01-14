/**
 * Created by Farhoud on 12/01/2016.
 */
public class Box<T> {
    T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
