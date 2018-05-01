package net.aikaka.javaboilerplates.microrest.api;

import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractor;
import net.aikaka.javaboilerplates.microrest.MicroRestApplication;
import net.aikaka.javaboilerplates.microrest.util.ConstantUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MicroRestApplication.class)
public class GetSamplesAPITest {

    @Autowired
    private GetSamplesInteractor getSamplesInteractor;

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testGetAll() throws Exception {
        mockMvc.perform(get("/api/v1/samples"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(ConstantUtil.CONTENT_TYPE_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name", is(this.getSamplesInteractor.all().get(0).getName())));
    }

    @Test
    public void testGetAllByName() throws Exception {
        mockMvc.perform(get("/api/v1/samples/name/ka"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(ConstantUtil.CONTENT_TYPE_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(this.getSamplesInteractor.all().get(0).getName())));
    }
}
