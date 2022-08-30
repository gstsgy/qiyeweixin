package guyue.qywx.hhcd.bean.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午2:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseModel{
    private String userid;
    private String name;
    private int status;
    private String telephone;
    private int enable;
}
