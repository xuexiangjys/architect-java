package designpattern.behavior.iterator;

public class StringIterator implements Iterator<String> {

    private Collection<String> mCollection;
    private int mPos = -1;

    public StringIterator(Collection<String> collection) {
        mCollection = collection;
    }

    @Override
    public String previous() {
        if (mPos > 0) {
            mPos--;
        }
        return mCollection.get(mPos);
    }

    @Override
    public String next() {
        if (mPos < mCollection.size() - 1) {
            mPos++;
        }
        return mCollection.get(mPos);
    }

    @Override
    public boolean hasNext() {
        return mPos < mCollection.size() - 1;
    }

    @Override
    public String first() {
        mPos = 0;
        return mCollection.get(mPos);
    }

}
