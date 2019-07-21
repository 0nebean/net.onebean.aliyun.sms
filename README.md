
Introduction
---
- 对阿里云短信API的调用封装

Documentation
---
- Config
#### chemical-el框架使用Apollo作为注册中心 ,以下是需要的配置namespace
[public-conf.aliyun-oss](https://github.com/0nebean/public.conf/blob/master/conf/public-conf.aliyun-oss.properties)

- API
#### 发送短信的方法 见AliyunSMSUtils:
```java
    /**
     * 发送短信接口
     * @param smsSignature 短信签名
     * @param smsTemplate 短信模板ID
     * @param phoneNumber 手机号码
     * @param templateParamJsonStr 短信模板参数json
     * @return AliyunSmsSendResult
     */
    public static AliyunSmsSendResult sendSms(String smsSignature, String smsTemplate, String phoneNumber, String templateParamJsonStr);
```

