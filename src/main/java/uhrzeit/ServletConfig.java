package uhrzeit;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Ports umkonfigurieren damit es parallel mit ein Defult-Tomcat (auf 8080) laufen kann
 */

@Controller
public class ServletConfig {
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            container.setPort(1111);
        });
    }
}
