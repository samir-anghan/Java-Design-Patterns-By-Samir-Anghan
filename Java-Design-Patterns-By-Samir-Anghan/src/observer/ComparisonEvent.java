package observer;

final class ComparisonEvent<E extends Comparable<E>> {
	private final E value1;
	private final E value2;
	private final E[] values;

	public ComparisonEvent(final E[] values, final E value1, final E value2) {
		this.values = values;
		this.value1 = value1;
		this.value2 = value2;
	}
	public E getValue1() {
		return this.value1;
	}
	public E getValue2() {
		return this.value2;
	}
	public E[] getValues() {
		return this.values;
	}
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Comparison of ");
		builder.append(this.value1);
		builder.append(" with ");
		builder.append(this.value2);
		return builder.toString();
	}
}