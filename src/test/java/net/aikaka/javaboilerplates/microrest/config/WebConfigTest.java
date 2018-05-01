package net.aikaka.javaboilerplates.microrest.config;

import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractor;
import net.aikaka.javaboilerplates.microrest.MicroRestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MicroRestApplication.class)
public class WebConfigTest {

    @Autowired
    private WebConfig webConfig;

    @Autowired
    private GetSamplesInteractor getSamplesInteractor;


    @Test
    public void testGetSamplesInteractor() {
        assertNotNull(webConfig);
        assertNotNull(webConfig.getSamplesInteractor());
    }

    @Test
    public void TestBeanGetSamplesInteractor() {
        assertNotNull(getSamplesInteractor);
    }
}
