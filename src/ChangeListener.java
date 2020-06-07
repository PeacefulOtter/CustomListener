package src;

/**
 * Almost the same as the ActionListener interface, but in this one,
 * the method actionPerformed takes three params namely :
 *  - The listened attribute, named observable
 *  - The old value of the attribute
 *  - The new value of the attribute
 * @param <T> : attribute type
 */
public interface ChangeListener<T>
{
    void actionPerformed( Object observable, T oldValue, T newValue  );
}
