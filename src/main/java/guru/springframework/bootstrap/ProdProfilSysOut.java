package guru.springframework.bootstrap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfilSysOut {

  @Value("${guru.springframework.profile.message}")
  private String msg;
  public ProdProfilSysOut() {
    System.out.println("#####################");
    System.out.println("#####################");
    System.out.println("##      Prod    ##");
    System.out.println(msg);
    System.out.println("#####################");

  }
}
