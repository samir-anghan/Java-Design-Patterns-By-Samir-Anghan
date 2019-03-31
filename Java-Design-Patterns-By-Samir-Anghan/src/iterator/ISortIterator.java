package iterator;

/**
 * @author Samir Anghan
 *
 */
public interface ISortIterator<E> {
	boolean hasNext();
	ISort<E> getNext();
}
