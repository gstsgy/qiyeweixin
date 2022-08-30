package guyue.qywx.hhcd.client;

import guyue.qywx.hhcd.bean.client.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/30 下午2:04
 */
@FeignClient(name = "userClient",url="https://qyapi.weixin.qq.com/cgi-bin/user")
public interface UserClient {
    @GetMapping("get")
    User getUser(@RequestParam("access_token") String accessToken, @RequestParam("userid")String userId);
    @PostMapping("list_id")
    String getUserList(@RequestParam("access_token") String accessToken);
}
