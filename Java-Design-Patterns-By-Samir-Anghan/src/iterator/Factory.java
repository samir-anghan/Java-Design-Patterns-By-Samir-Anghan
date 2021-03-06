package iterator;

/**
 * @author Samir Anghan
 *
 */
public class Factory {

	private static volatile Factory TheUniqueFactory;

	public static Factory getInstance() {
		if (Factory.TheUniqueFactory == null) {
			synchronized (Factory.class) {
				if (Factory.TheUniqueFactory == null) {
					Factory.TheUniqueFactory = new Factory();
				}
			}
		}
		return Factory.TheUniqueFactory;
	}

	private Factory() {

	}

	public <E> ISort<E> getSelectionSortAlgorithm() {
		return new SelectionSort<E>();
	}

	public <E> ISort<E> getQuickSortAlgorithm() {
		return new QuickSort<E>();
	}

	public <E> ISort<E> getMergeSortAlgorithm() {
		return new MergeSort<E>();
	}

	public <E> ISort<E> getInsertionSortAlgorithm() {
		return new InsertionSort<E>();
	}

	public <E> ISort<E> getBubbleSortAlgorithm() {
		return new BubbleSort<E>();
	}

	public <E extends Comparable<E>> ISort<E> getInternalSortAlgorithms() {
		final TypeOfSort<E> internalSorts = new TypeOfSort<E>("Internal Sorts");

		final ISort<E> bubbleSortAlgorithm = this.getBubbleSortAlgorithm();
		internalSorts.addSortAlgorithm(bubbleSortAlgorithm);

		final ISort<E> insertionSortAlgorithm = this.getInsertionSortAlgorithm();
		internalSorts.addSortAlgorithm(insertionSortAlgorithm);

		final ISort<E> mergeSortAlgorithm = this.getMergeSortAlgorithm();
		internalSorts.addSortAlgorithm(mergeSortAlgorithm);

		final ISort<E> quickSortAlgorithm = this.getQuickSortAlgorithm();
		internalSorts.addSortAlgorithm(quickSortAlgorithm);

		final ISort<E> selectionSortAlgorithm = this.getSelectionSortAlgorithm();
		internalSorts.addSortAlgorithm(selectionSortAlgorithm);

		return internalSorts;
	}

}