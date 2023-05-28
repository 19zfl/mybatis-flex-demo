package com.zfl19.test.kernel;

import com.mybatisflex.core.MybatisFlexBootstrap;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.row.Db;
import com.mybatisflex.core.row.Row;
import com.zaxxer.hikari.HikariDataSource;
import com.zfl19.core.entity.ShopOrder;
import com.zfl19.core.entity.TbAccount;
import com.zfl19.core.mapper.ShopOrderMapper;
import com.zfl19.core.mapper.TbAccountMapper;
import org.junit.Test;

import java.util.List;

/**
 * @author: 19zfl
 * @description:
 * @date 2023-05-28
 */
public class MapperTest {

    @Test
    public void test01() {
        //创建数据源
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //配置数据源
        MybatisFlexBootstrap.getInstance()
                .setDataSource(dataSource)
                .addMapper(TbAccountMapper.class)
                .start();

        TbAccountMapper mapper = MybatisFlexBootstrap.getInstance().getMapper(TbAccountMapper.class);

        // mapper接口无法实例化，需要通过MybatisFlexBootstrap对象创建mapper对象调用方法

    }

}
