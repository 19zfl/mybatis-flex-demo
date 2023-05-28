package com.zfl19.core.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "shop_product")
public class ShopProduct implements Serializable {

    /**
     * 主键id
     */
    @Id(keyType = KeyType.Auto)
    private Integer pid;

    /**
     * 商品名称
     */
    private String pname;

    /**
     * 商品价格
     */
    private Double pprice;

    /**
     * 库存
     */
    private Integer stock;

}
