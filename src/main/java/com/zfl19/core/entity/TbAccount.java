package com.zfl19.core.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "tb_account")
public class TbAccount implements Serializable {

    
    @Id(keyType = KeyType.Auto)
    private Integer id;

    
    private String userName;

    
    private Integer age;

    
    private LocalDateTime birthday;

}
