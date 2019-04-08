package observer;

import java.util.List;

/**
 * @author Samir Anghan
 *
 */
interface ISort<E extends Comparable<E>> {
	void addObserver(final ISortObserver<E> anObserver);
	List<E> sort(final List<E> aList);
}
