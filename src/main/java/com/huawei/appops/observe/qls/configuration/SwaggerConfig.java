package com.huawei.appops.observe.qls.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket restDocket(Environment environment) {
        Profiles of = Profiles.of("dev", "50020502");
        boolean flag = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("rest")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huawei.appops.observe.qls.controller"))
                .paths(PathSelectors.ant("/add/**"))
                .build();
    }

    @Bean
    public Docket jpaDocket(Environment environment) {
        Profiles of = Profiles.of("dev", "50020502");
        boolean flag = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("jpa")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huawei.appops.observe.qls.controller"))
                .paths(PathSelectors.ant("/findAllGoods"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("wsj", "http://xxx.xxx.com/", "wsj@123.com");
        return new ApiInfo(
                "Test", // 标题
                "Test Study Result", // 描述
                "v1.0", // 版本
                "http://terms.service.url/公司、组织的链接", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展，默认为空
        );
    }
}
