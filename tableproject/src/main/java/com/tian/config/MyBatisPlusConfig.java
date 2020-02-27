package com.tian.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class MyBatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
        //设置请求的页面大于最大页后操作，true调回到首页，false 继续请求   默认false;
        //paginationInterceptor.setOverflow(false);
        //设置最大单页限制数量,默认500调，-1不受限制
        //paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }



}
