/**
 * 
 */
package abstractFactory;

/**
 * @author Samir
 *
 */
public class Factory {
	public <E> ISort<E> getSortAlgorithm() {
		return new InsertionSort<E>();
	}
}
