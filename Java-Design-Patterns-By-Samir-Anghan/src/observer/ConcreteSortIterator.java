package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
class ConcreteSortIterator<E extends Comparable<E>> implements ISortIterator<E> {

	private int cursor;
	private final List<ISort<E>> privateCopyOfList;

	public ConcreteSortIterator(final List<ISort<E>> aListOfItems) {
		this.privateCopyOfList = new ArrayList<>(aListOfItems);
	}

	public ISort<E> getNext() {
		final ISort<E> currentSortAlgorithm = this.privateCopyOfList.get(this.cursor);
		this.cursor++;
		return currentSortAlgorithm;
	}

	public boolean hasNext() {
		return this.cursor < this.privateCopyOfList.size() - 1;
	}
}
