package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public abstract class AbstractSort<E extends Comparable<E>> {
    private final List<ISortObserver<E>> listOfObservers;

    public AbstractSort() {
        this.listOfObservers = new ArrayList<ISortObserver<E>>();
    }
    public void addObserver(final ISortObserver<E> anObserver) {
        // No need to add twice the same observer.
        if (!this.listOfObservers.contains(anObserver)) {
            this.listOfObservers.add(anObserver);
        }
    }
    protected final int compareValues(
        final E[] array,
        final E value1,
        final E value2) {

        /* TODO: Something is missing here [done] */
        this.notifyObserversOfAComparison(array, value1, value2);

        return value1.compareTo(value2);
    }
    protected final int compareValuesInArray(
        final E[] array,
        final int position1,
        final int position2) {

        final E value1 = array[position1];
        final E value2 = array[position2];

        /* TODO: Something is missing here [done] */
        this.notifyObserversOfAComparison(array, value1, value2);

        return value1.compareTo(value2);
    }
    protected final E[] convertListToArray(final List<E> aList) {
        // See http://stackoverflow.com/a/6522958
        // See http://stackoverflow.com/a/3617972
        @SuppressWarnings("unchecked")
        final E[] array = (E[]) java.lang.reflect.Array
            .newInstance(aList.get(0).getClass(), aList.size());
        for (int i = 0; i < aList.size(); i++) {
            array[i] = aList.get(i);
        }
        return array;
    }
    private final void notifyObserversOfAComparison(
        final E[] values,
        final E value1,
        final E value2) {

        final ComparisonEvent<E> event =
            new ComparisonEvent<E>(values, value1, value2);

        /* TODO: Something is missing here */
        final Iterator<ISortObserver<E>> itr = this.listOfObservers.iterator();
        while (itr.hasNext()) {
            /* TODO: Something is missing here */
            final ISortObserver<E> sortObserver = (ISortObserver<E>) itr.next();
            sortObserver.valuesCompared(event);
        }
    }
    private final void notifyObserversOfASwap(
        final E[] values,
        final E value1,
        final E value2) {

        final SwapEvent<E> event = new SwapEvent<E>(values, value1, value2);

        /* TODO: Something is missing here */
        final Iterator<ISortObserver<E>> itr = this.listOfObservers.iterator();
        while (itr.hasNext()) {
            /* TODO: Something is missing here */
            final ISortObserver<E> sortObserver = (ISortObserver<E>) itr.next();
            sortObserver.valuesSwapped(event);
        }
    }
    protected final void swapValuesInArray(
        final E[] array,
        final int i,
        final int j) {

        /* TODO: Something is missing here */
        this.notifyObserversOfASwap(array, array[i], array[j]);

        final E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
