package Utils.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author admin
 */
public class LoggerHelper {
    private  static final Logger logger= LoggerFactory.getLogger(LoggerHelper.class);

    private LoggerHelper(){

    }
    public static void logInfo(String info){
        if(logger.isInfoEnabled())
        {
            logger.info("================================:          "+info);
        }
    }

    public static void logError(String error){
        if(logger.isInfoEnabled())
        {
            logger.error("================================:          "+error);
        }
    }
}
