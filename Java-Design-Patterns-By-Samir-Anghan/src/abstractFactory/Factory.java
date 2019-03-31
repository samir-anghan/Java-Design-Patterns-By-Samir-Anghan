package abstractFactory;

/**
 * @author Samir Anghan
 *
 */
public class Factory {
	public <E> ISort<E> getSortAlgorithm() {
		return new InsertionSort<E>();
	}
}
