package observer;

final class SimpleObserver<E extends Comparable<E>> implements ISortObserver<E> {
	@Override
	public void valuesCompared(final ComparisonEvent<E> comparisonEvent) {
		System.out.println(comparisonEvent);
	}

	@Override
	public void valuesSwapped(final SwapEvent<E> swapEvent) {
		System.out.println(swapEvent);
	}
}