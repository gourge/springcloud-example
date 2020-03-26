package com.imooc.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by 廖师兄
 * 2018-07-11 16:52
 */
@Data
@Component
@ConfigurationProperties(prefix = "girl")  //自动加载配置文件中前缀为“girl”的属性值
@RefreshScope //有改变自动刷新
public class GirlConfig {

	private String name;

	private Integer age;
}
