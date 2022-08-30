package guyue.qywx.hhcd.bean.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午1:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PermitUserList extends BaseModel{
    private List<String> ids;
}
