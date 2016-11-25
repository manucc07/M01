package es.egc.app;
import org.apache.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log=Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
		log.info("Returning 1");
        System.out.println( "Hello World!" );
    }
	
	static int getVal(){
		return 1;
	}
	
}
