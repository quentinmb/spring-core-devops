package guru.springframework.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfilSysOut {
  @Autowired
  public DefaultProfilSysOut(@Value("${guru.springframework.profile.message}") String msg) {
    System.out.println("#####################");
    System.out.println("#####################");
    System.out.println("##      Defauly    ##");
    System.out.println(msg);
    System.out.println("#####################");

  }
}
