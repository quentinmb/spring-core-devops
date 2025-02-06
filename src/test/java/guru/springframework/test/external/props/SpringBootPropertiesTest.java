package guru.springframework.test.external.props;

import guru.springframework.SpringCoreDevOpsApplication;
import guru.springframework.test.jms.FakeJmsBroker;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringCoreDevOpsApplication.class)
@WebIntegrationTest
@TestPropertySource("/application.properties")
public class SpringBootPropertiesTest {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    @Ignore
    public void testPropsSet() throws Exception {
        Assert.assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        Assert.assertEquals(3330, fakeJmsBroker.getPort().intValue());
        Assert.assertEquals("Ron", fakeJmsBroker.getUser());
        Assert.assertEquals("Burgundy", fakeJmsBroker.getPassword());
    }
}
