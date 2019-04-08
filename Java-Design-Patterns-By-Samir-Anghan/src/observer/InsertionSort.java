package observer;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
final class InsertionSort<E extends Comparable<E>> extends AbstractSort<E>
implements ISort<E> {

	public InsertionSort() {
		super();
	}

	public List<E> sort(final List<E> aList) {
		final E[] array = this.convertListToArray(aList);
		final int arraySize = array.length;

		int j;
		for (int i = 1; i < arraySize; i++) {
			j = i;
			while (j > 0 && this.compareValuesInArray(array, j - 1, j) > 0) {
				this.swapValuesInArray(array, j - 1, j);
				j--;
			}
		}

		return Arrays.asList(array);
	}

}
