package guyue.qywx.hhcd.conf;

import feign.Retryer;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2021/9/10 上午11:19
 */
@Slf4j
@Configuration
public class FeignConfig {
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;
    @Bean
    public Retryer feignRetryer() {
        //fegin提供的默认实现，最大请求次数为5，初始间隔时间为100ms，下次间隔时间1.5倍递增，重试间最大间隔时间为1s，
        return new Retryer.Default();
    }

    @Bean
    public ErrorDecoder feignError() {
        return (key, response) -> {
            if (response.status() == 400) {
                log.error("请求xxx服务400参数错误,返回:{}", response.body());
            }

            if (response.status() == 409) {
                log.error("请求xxx服务409异常,返回:{}", response.body());
            }

            if (response.status() == 404) {
                log.error("请求xxx服务404异常,返回:{}", response.body());
            }

            // 其他异常交给Default去解码处理
            // 这里使用单例即可，Default不用每次都去new
            return new ErrorDecoder.Default().decode(key, response);
        };
    }
    @Bean
    public Encoder getEncoder(){
        return new FeignClientEncoder(messageConverters);
    }

    @Bean
    public Decoder getDecoder(){
        return new FeignClientEncoder.FeignClientDecoder(messageConverters);
    }
   /* @Bean
    Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Logger logger() {
        return new FeignLogger();
    }*/

}
