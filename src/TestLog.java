import org.apache.log4j.Logger;

public class TestLog {
	
	private static final Logger LOG = Logger.getLogger(TestLog.class);
	
	public static void main(String args[]){
		int a = 10;
		int b = 5;
		int c = a*b;
		LOG.trace(c);
		LOG.debug(c);
		LOG.info(c);
		LOG.warn(c);
		LOG.error(c);
		LOG.fatal(c);
	}
}
