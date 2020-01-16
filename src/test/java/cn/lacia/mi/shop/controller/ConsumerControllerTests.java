package cn.lacia.mi.shop.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 18:43
 */
@SpringBootTest
@Slf4j
@AutoConfigureMockMvc
public class ConsumerControllerTests {

    @Autowired
    private MockMvc mockMvc;
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    @BeforeAll
//    public void initMockMvc(){
//        log.debug("mockMvc");
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }

    @Test
    public void testLogin(){
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                    .post("/consumer/login/auth")
                    .param("username", "damu")
                    .param("password", "123456"))
                    .andReturn();
            log.info("{}",mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
