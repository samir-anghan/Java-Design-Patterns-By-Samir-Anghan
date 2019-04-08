package observer;

class InternalSorts<E extends Comparable<E>> extends TypeOfSort<E> implements ITypeOfSort<E> {

	public InternalSorts() {
		super("Internal Sorts");

		this.addSortAlgorithm(new InsertionSort<E>());
		this.addSortAlgorithm(new QuickSort<E>());
		this.addSortAlgorithm(new BubbleSort<E>());
	}
}