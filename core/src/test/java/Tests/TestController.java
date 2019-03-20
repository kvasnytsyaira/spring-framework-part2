//package Tests;
//
//import com.config.WebAppInitializer;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {WebAppInitializer.class})
//public class TestController {
//
//    @Autowired
//    private WebApplicationContext wac;
//
//    private MockMvc mockMvc;

//    @Before
//    public void setup() throws Exception {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    }

//    @Test
//    public void TestGivenUrl_whenMockMVC_thenVerifyResponse() throws Exception {
//        this.mockMvc.perform(get("/"))
//                .andExpect(status().isOk()).andExpect(content()
//                .contentType("application/json;charset=UTF-8"));
//
//    }
//
//}
