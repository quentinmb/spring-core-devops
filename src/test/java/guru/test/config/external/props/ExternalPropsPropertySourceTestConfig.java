package guru.test.config.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsPropertySourceTestConfig {

  @Value("${guru.jms.server}")
  public String jmsServer;
  @Value("${guru.jms.port}")
  public Integer jmsPort;
  @Value("${guru.jms.user}")
  public String jmsUser;
  @Value("${guru.jms.password}")
  public String jmsPassword;

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties () {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    return propertySourcesPlaceholderConfigurer;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker () {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUrl(jmsServer);
    fakeJmsBroker.setPort(jmsPort);
    fakeJmsBroker.setUser(jmsUser);
    fakeJmsBroker.setPassword(jmsPassword);
    return fakeJmsBroker;
  }

}
