package observer;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
final class BubbleSort<E extends Comparable<E>> extends AbstractSort<E> implements ISort<E> {

	public BubbleSort() {
		super();
	}

	public List<E> sort(final List<E> aList) {
		final E[] array = this.convertListToArray(aList);
		final int arraySize = array.length;

		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = 0; j < arraySize - 1; j++) {
				if (this.compareValuesInArray(array, j, j + 1) > 0) {
					this.swapValuesInArray(array, j, j + 1);
				}
			}
		}

		return Arrays.asList(array);
	}
}
