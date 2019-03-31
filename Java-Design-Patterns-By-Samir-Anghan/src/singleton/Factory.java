/**
 * 
 */
package singleton;

/**
 * @author Samir
 *
 */
public class Factory {

	private static volatile Factory TheUniqueFactory;

	// static method to create instance of Factory class
	// To ensure only one instance is created
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

	// private constructor restricted to this class itself 
	private Factory() {
		
	}
	
	public <E> ISort<E> getSortAlgorithm() {
		return new InsertionSort<E>();
	}
}

// ************ HELP ON KEYWORDS ************ //

// volatile: Make some blocks of code synchronized to prevent threads to access the same block at the “same” time
// synchronized: Make some blocks of code synchronized to prevent threads to access the same block at the “same” time