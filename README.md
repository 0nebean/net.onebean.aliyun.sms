* # 配置
#### 使用该模块需要引用配置项,并做相应配置,配置项参考如下:
[public-conf.aliyun-oss](https://github.com/0nebean/public.conf/blob/master/conf/public-conf.aliyun-oss.properties)


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

