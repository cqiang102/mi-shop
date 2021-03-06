package cn.lacia.mi.shop.test.controller;

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

import java.io.UnsupportedEncodingException;
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
    public void testInitIndex()  {
        MvcResult mvcResult;
        String res = null;
        Result result = null;
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders
                    .get("/initIndex")).andReturn();
            res = mvcResult.getResponse().getContentAsString(Charset.defaultCharset());
//            result = MapperUtils.json2pojo(res, Result.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("{}",res);
//        Assert.isTrue(result!=null && Result.SUCCESS_CODE==result.getStatus(),"首页初始化接口测试不通过");
    }
    @Test
    public void testSearch()  {
        MvcResult mvcResult;
        String res = null;
        Result result = null;
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders
                    .get("/search/小米")).andReturn();
            res = mvcResult.getResponse().getContentAsString(Charset.defaultCharset());
//            result = MapperUtils.json2pojo(res, Result.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("{}",res);
//        Assert.isTrue(result!=null && Result.SUCCESS_CODE==result.getStatus(),"搜索接口测试不通过");
    }
}
