package guyue.qywx.hhcd.client;

import feign.Param;
import guyue.qywx.hhcd.bean.client.AccessToken;
import guyue.qywx.hhcd.bean.client.PermitUserList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/29 下午5:34
 */
@FeignClient(name = "test",url="https://qyapi.weixin.qq.com/cgi-bin/")
public interface TestClient {
    @GetMapping("gettoken")
    AccessToken getToken(@RequestParam(value = "corpid") String corpid, @RequestParam(value = "corpsecret")String secret);

    @PostMapping("msgaudit/get_permit_user_list")
    PermitUserList getPermitUserList(@RequestParam(value = "access_token")String accessToken);
}
