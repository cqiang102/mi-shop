package cn.lacia.mi.shop.controller;

import cn.lacia.mi.shop.utils.MapperUtils;
import cn.lacia.mi.shop.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.nio.charset.Charset;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 18:43
 */
@SpringBootTest
@Slf4j
@AutoConfigureMockMvc
@Transactional
public class IndexControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInitIndex() throws Exception {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                    .get("/initIndex")).andReturn();
        String res = mvcResult.getResponse().getContentAsString(Charset.defaultCharset());
        log.info("{}",res);
        Result result = MapperUtils.json2pojo(res, Result.class);
        Assert.isTrue(result!=null && Result.SUCCESS_CODE==result.getStatus(),"首页初始化接口测试不通过");
    }

}
