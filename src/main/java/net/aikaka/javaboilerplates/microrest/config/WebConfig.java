package net.aikaka.javaboilerplates.microrest.config;

import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractor;
import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public GetSamplesInteractor getSamplesInteractor(){
        return new GetSamplesInteractorImpl();
    }
}
