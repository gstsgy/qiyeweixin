package guyue.qywx.hhcd.enable;


import guyue.qywx.hhcd.bean.client.AccessToken;
import guyue.qywx.hhcd.bean.client.PermitUserList;
import guyue.qywx.hhcd.bean.client.User;
import guyue.qywx.hhcd.client.TestClient;
import guyue.qywx.hhcd.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/29 下午5:39
 */
@Component
public class TestEnable implements CommandLineRunner {
    @Autowired
    private TestClient testClient;
    @Autowired
    private UserClient userClient;

    @Override
    public void run(String... args) throws Exception {
        String id = "wwa439a0ada396e9f9";
        String pw = "VmfuE1az94ne7aQdDlzRN-iaDW7Sx_a8BnNjBF_G5Rc";
        String token = "lZ-5j25SxoXOFvpsI6oFecc827JPh7mDcP7ITc7nrJKCA9XW5y51w9bA5Gc9vQG6NARjULJaGePm" +
                "rDBq0XTJfge4yyhEwKJePI7vM2iWe8fVBT8S2CtXVPPJywxysb-cbwu5vcwRyH0D_cNmeKMyrHcHqh9Xmj" +
                "pmUsZ1JhDgTVp-kYL8hSi9XIHwwwzbCwfdKt3joERcsMRbMkMKSQ3Jiw";
        //AccessToken token1= testClient.getToken(id,pw);
        //PermitUserList permitUserList = testClient.getPermitUserList(token);
        //User user = userClient.getUser(token, "15927249992");
        System.out.println(userClient.getUserList(token));
    }
}
