/**
 * L'exception BiblioException est lev�e lorsqu'une transaction est inad�quate.
 * Par exemple -- livre inexistant
 */

@SuppressWarnings("serial")
public final class BiblioException extends Exception {
    public BiblioException(String message) {
        super(message);
    }
}