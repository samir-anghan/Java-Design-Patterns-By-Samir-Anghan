package observer;

interface ISortObserver<E extends Comparable<E>> {
	void valuesCompared(final ComparisonEvent<E> comparisonEvent);
	void valuesSwapped(final SwapEvent<E> swapEvent);
}