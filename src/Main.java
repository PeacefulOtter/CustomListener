package src;

import java.util.Locale;

class Main {
    public static void main(String[] args)
    {
        // instantiate a dummy with some value
        Dummy dummy1 = new Dummy( "blah" );
        // get the attribute we want to listen to and add a new listener
        dummy1.getProperty().addListener( ( observable, oldValue, newValue ) -> {
            // gets calls when the attribute's value changes
            System.out.printf( "old value: %s  new value: %s \n", oldValue, newValue );
        } );

        dummy1.setObject( "blob" );
        dummy1.setObject( "lilol" );
  }
}
