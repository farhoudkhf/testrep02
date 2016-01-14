/**
 * Created by Farhoud on 11/01/2016.
 */
class Storage<T> {
    T x;

    public void setValue(T value) {
        this.x = value;
    }

    public T getValue() {
        return x;
    }
}
