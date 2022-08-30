package guyue.qywx.hhcd.bean.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午1:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AccessToken extends BaseModel{
    private String accessToken;
    private Long expiresIn;
}
