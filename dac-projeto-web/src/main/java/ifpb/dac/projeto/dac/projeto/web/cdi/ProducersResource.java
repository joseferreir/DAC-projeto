package ifpb.dac.projeto.dac.projeto.web.cdi;


import ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {

   
    @Produces
    @Resource(lookup ="host-core/java:global/dac-projeto-core/UserSevice!ifpb.dac.projeto.dac.projeto.shared.interfaces.InterfaceUserservice")
    private InterfaceUserservice userService;

}
