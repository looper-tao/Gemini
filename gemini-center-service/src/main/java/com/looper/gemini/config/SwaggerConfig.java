package com.looper.gemini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  private static final String API_TITLE = "uc2.0app";
  private static final String API_DESCRIPTION = "uc2.0外部相关服务";
  private static final String API_VERSION = "2.0";

  private static final String API_PACKAGES = "com.newtank.flex.uc";

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().title(API_TITLE).description(API_DESCRIPTION).version(API_VERSION).build())
            .select()
            .apis(RequestHandlerSelectors.basePackage(API_PACKAGES))
            .paths(PathSelectors.any())
            .build();
  }

  /**
   * 定义api组，
   */
  @Bean
  public Docket wxApi() {

    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("微信接口")
            .useDefaultResponseMessages(false)
            .forCodeGeneration(true)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.newtank.flex"))
            .paths(PathSelectors.regex("/wx.*"))
            .build()
            .apiInfo(wxApiInfo());
  }

  @Bean
  public Docket userApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("用户接口")
            .useDefaultResponseMessages(false)
            .forCodeGeneration(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.newtank.flex"))
            .paths(PathSelectors.regex("/user.*"))
            .build()
            .apiInfo(userApiInfo());
  }

  @Bean
  public Docket trackApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("统计接口")
            .useDefaultResponseMessages(false)
            .forCodeGeneration(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.newtank.flex"))
            .paths(PathSelectors.regex("/event.*"))
            .build()
            .apiInfo(trackApiInfo());
  }

  private ApiInfo wxApiInfo() {
    return new ApiInfoBuilder()
            .title("Weixin API")
            .description("微信相关api")
            .version("2.0")
            .build();
  }

  private ApiInfo userApiInfo() {
    return new ApiInfoBuilder()
            .title("User API")//大标题
            .description("用户相关api")//详细描述
            .version("2.0")
            .build();
  }

  private ApiInfo trackApiInfo() {
    return new ApiInfoBuilder()
            .title("Track API")//大标题
            .description("统计api")//详细描述
            .version("2.0")//版本
            .build();
  }
}
