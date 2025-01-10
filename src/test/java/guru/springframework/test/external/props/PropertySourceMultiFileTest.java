package guru.springframework.test.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import guru.test.config.external.props.ExternalPropsEnvironnementConfig;
import guru.test.config.external.props.ExternalPropsMultiFileConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsMultiFileConfig.class)
public class PropertySourceMultiFileTest {

  @Autowired
  FakeJmsBroker fakeJmsBroker;

  @Test
  public void fakeJmsPropertiesCheck () throws Exception{
    Assert.assertEquals("10.10.10.11", fakeJmsBroker.getUrl());
    Assert.assertEquals(3330, fakeJmsBroker.getPort().intValue());
    Assert.assertEquals("quentin", fakeJmsBroker.getUser());
    Assert.assertEquals("pass", fakeJmsBroker.getPassword());

  }
}
