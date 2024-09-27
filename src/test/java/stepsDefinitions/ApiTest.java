package stepsDefinitions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ApiTest {
    private static final Logger logger = LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void testGetPost() {
        logger.info("getPost");
    }
}
