package net.onebean.component.aliyun;

public class AliyunSmsSendResult {
    /**
     * 请求成功标识
     */
    private Boolean flag;
    /**
     * 返回的描述
     */
    private String msg;
    /**
     * 返回的code
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
