//package com.example.superheroes.config;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RedisConfig {

//    @Value("{redis.hostname}")
//    private String redisHostName;
//
//    @Value("{redis.port}")
//    private int redisPort;
//
//    @Value("{redis.username}")
//    private String redisUsername;
//
//    @Value("{redis.password}")
//    private String redisPassword;

//    @Bean
//    JedisConnectionFactory jedisConnectionFactory(){
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName(redisHostName);
//        redisStandaloneConfiguration.setPort(redisPort);
//        redisStandaloneConfiguration.setUsername(redisUsername);
//        redisStandaloneConfiguration.setPassword(redisPassword);
//        return new JedisConnectionFactory(redisStandaloneConfiguration);
//    }
//
//    @Bean
//    public RedisTemplate<UUID, Object> redisTemplate(){
//        RedisTemplate<UUID,Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new StringRedisSerializer());
//        template.setHashKeySerializer(new JdkSerializationRedisSerializer());
//        template.setValueSerializer(new JdkSerializationRedisSerializer());
//        template.setEnableTransactionSupport(true);
//        template.afterPropertiesSet();
//        return template;
//    }
//}
