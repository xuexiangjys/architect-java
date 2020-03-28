package designpattern.behavior.iterator;

public class StringCollection implements Collection<String> {

    public String[] mArray = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator<String> iterator() {
        return new StringIterator(this);
    }

    @Override
    public String get(int i) {
        return mArray[i];
    }

    @Override
    public int size() {
        return mArray.length;
    }
}
