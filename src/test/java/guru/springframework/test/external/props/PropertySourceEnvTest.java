package guru.springframework.test.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import guru.test.config.external.props.ExternalPropsEnvironnementConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsEnvironnementConfig.class)
public class PropertySourceEnvTest {

  @Autowired
  FakeJmsBroker fakeJmsBroker;

  @Test
  public void fakeJmsPropertieCheck () throws Exception{
    Assert.assertEquals("10.10.10.11", fakeJmsBroker.getUrl());
    Assert.assertEquals(3330, fakeJmsBroker.getPort().intValue());
    Assert.assertEquals("quentin", fakeJmsBroker.getUser());
    Assert.assertEquals("pass", fakeJmsBroker.getPassword());

  }
}
