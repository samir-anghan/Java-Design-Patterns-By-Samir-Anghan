package observer;

/**
 * @author Samir Anghan
 *
 */
interface ISortIterator<E extends Comparable<E>> {
	ISort<E> getNext();
	boolean hasNext();
}
