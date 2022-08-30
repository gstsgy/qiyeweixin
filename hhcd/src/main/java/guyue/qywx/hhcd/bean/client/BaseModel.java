package guyue.qywx.hhcd.bean.client;

import lombok.Data;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午1:11
 */
@Data
public abstract  class BaseModel {
    private int errcode;
    private String errmsg;
}
