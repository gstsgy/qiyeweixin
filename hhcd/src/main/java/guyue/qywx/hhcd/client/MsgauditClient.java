package guyue.qywx.hhcd.client;

import guyue.qywx.hhcd.bean.client.PermitUserList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午3:57
 */
@FeignClient(name = "msgauditclient",url="https://qyapi.weixin.qq.com/cgi-bin/msgaudit")
public interface MsgauditClient {
    @PostMapping("get_permit_user_list")
    PermitUserList getPermitUserList(@RequestParam(value = "access_token")String accessToken);
    @PostMapping("check_single_agree")
    String getCheckSingleAgree();
}
