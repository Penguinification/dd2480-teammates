package teammates.logic.external;

import org.testng.annotations.Test;
import teammates.logic.api.BaseLogicTest;

public class LocalLoggingServiceTest extends BaseLogicTest {

    private final LocalLoggingService localLoggingService = new LocalLoggingService();

    @Test
    public void testIsRequestFilterSatisfied_allNullReturnTrue() {

        assertTrue(localLoggingService.isRequestFilterSatisfied(null, null, null, null, null, null, null));
    }
}

    @Test
    public void testIsRequestFilterSatisfied_logDetailsNotREQUEST_LOG() {

        LogDetails logDetails = new LogDetails;
        logDetails.setEvent(LogEvent.EXCEPTION_LOG);

        assertFault(localLoggingService.isRequestFilterSatisfied(logDetails, "foodoo", null, null, null, null, null));
    }
