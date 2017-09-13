package ifpb.dac.projeto.dac.projeto.web.cdi;


import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    private static final String RESOURCE = "java:global/dac-core/UserSevice!ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice";
    @Produces
    @Dependent
    @Default
    private InterfaceUserservice getContactService() {
        return  new ServiceLocator().lookup(RESOURCE, InterfaceUserservice.class);
    }

}
