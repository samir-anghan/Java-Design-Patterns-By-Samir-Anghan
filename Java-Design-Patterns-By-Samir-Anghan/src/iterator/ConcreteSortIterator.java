package iterator;

import java.util.List;

/**
 * @author Samir Anghan
 *
 */
public class ConcreteSortIterator<E> implements ISortIterator<E> {

	private final List<ISort<E>> privateCopyOfList;
	private int cursor = 0;

	public ConcreteSortIterator(final List<ISort<E>> aListOfItems) {
		this.privateCopyOfList = aListOfItems;
	}

	@Override
	public boolean hasNext() {
		return this.cursor < this.privateCopyOfList.size();
	}

	@Override
	public ISort<E> getNext() {
		final ISort<E> currentSortAlgorithm = this.privateCopyOfList.get(this.cursor);
		this.cursor++;
		return currentSortAlgorithm;
	}

}
