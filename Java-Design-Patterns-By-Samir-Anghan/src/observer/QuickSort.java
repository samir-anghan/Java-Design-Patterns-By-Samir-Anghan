package observer;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samir Anghan
 *
 */
final class QuickSort<E extends Comparable<E>> extends AbstractSort<E>
implements ISort<E> {

public QuickSort() {
super();
}

private int partition(final E[] array, int p, int r) {
final E x = array[p];
int i = p - 1;
int j = r + 1;

while (true) {
	i++;
	while (i < r && this.compareValues(array, array[i], x) < 0) {
		i++;
	}
	j--;
	while (j > p && this.compareValues(array, array[j], x) > 0) {
		j--;
	}

	if (i < j) {
		this.swapValuesInArray(array, i, j);
	}
	else {
		return j;
	}
}
}
private void quickSort(final E[] a, final int p, final int r) {
if (p < r) {
	final int q = this.partition(a, p, r);
	this.quickSort(a, p, q);
	this.quickSort(a, q + 1, r);
}
}
public List<E> sort(final List<E> aList) {
final E[] array = this.convertListToArray(aList);
this.quickSort(array, 0, array.length - 1);
return Arrays.asList(array);
}
}