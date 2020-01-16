package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 17:36
 */
public interface MyMapper<T> extends MySqlMapper<T>, Mapper<T> {
}
