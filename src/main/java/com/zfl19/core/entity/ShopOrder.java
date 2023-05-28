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
@Table(value = "shop_order")
public class ShopOrder implements Serializable {

    /**
     * 主键id
     */
    @Id(keyType = KeyType.Auto)
    private Integer oid;

    
    private Integer uid;

    /**
     * 用户名
     */
    private String username;

}
