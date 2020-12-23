package com.tistory.f5074.spring_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

@SpringBootApplication
@MapperScan(value = {"com.tistory.f5074.spring_boot"})
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        ConfigurableEnvironment  env = (ConfigurableEnvironment) context.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();
//        propertySources.addLast(new ResourcePropertySource("calsspath:app."));


//        String[] beanNames = context.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for(String beanName : beanNames){
//            System.out.println("[beanName]"+ beanName);
//        }
    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
//
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//
//        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));//spring boot mybatis settings 부분
//
//        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
//        sessionFactory.setMapperLocations(res);
//
//        return sessionFactory.getObject();
//    }
}
