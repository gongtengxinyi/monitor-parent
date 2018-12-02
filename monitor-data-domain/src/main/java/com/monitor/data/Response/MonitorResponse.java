package com.monitor.data.Response;

/**
 * 统一返回实体
 * @param <T>
 */
public class MonitorResponse<T> {
    private String message;
    private int retCode;
    private T data;

    private MonitorResponse(T data, String message, int retCode) {
        this.retCode = retCode;
        this.message =message;
        this.data = data;
    }

    /**
     * 成功时候的调用
     *
     * @return
     */
    public static <T> MonitorResponse<T> success(T data) {
        return new MonitorResponse<T>(data, "", MonitorResponseEnum.SUCCESS.getValue());
    }

    /**
     * 成功，不需要传入参数
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> MonitorResponse<T> success() {
        return (MonitorResponse<T>) success("");
    }

    /**
     * 失败时候的调用
     *
     * @return
     */
    public static <T> MonitorResponse<T> fail(T data,String message) {
        return new MonitorResponse<T>(data, message, MonitorResponseEnum.FAIL.getValue());
    }

    /**
     * 错误时候的调用
     *
     * @return
     */
    public static <T> MonitorResponse<T> error(T data,String message) {
        return new MonitorResponse<T>(data, message, MonitorResponseEnum.ERROR.getValue());
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getRetCode() {
        return retCode;
    }

}
