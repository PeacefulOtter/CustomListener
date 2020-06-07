package src;

/**
 * Represents any class that has a ListenedObject
 */
public class Dummy
{
    private final ListenedObject<Object> dummyAttribute = new ListenedObject<>();

    public Dummy( Object newAttr ) { dummyAttribute.set( newAttr ); }

    public ListenedObject<Object> getProperty() { return dummyAttribute; }

    public Object getObject() { return dummyAttribute.get(); }

    public void setObject( Object newObj ) { dummyAttribute.set( newObj ); }
}
