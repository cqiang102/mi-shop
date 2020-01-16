package cn.lacia.mi.shop.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 你是电脑
 * @create 2020/1/16 - 22:04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 500;
    public static final String SUCCESS_MESSAGE = "请求成功";
    public static final String ERROR_MESSAGE = "请求失败";

    private Integer status;
    private String message;
    private Object data;

    public static Result ok(){
        return  ok(SUCCESS_CODE);
    }
    public static Result ok(String message){
        return  ok(SUCCESS_CODE,message);
    }
    public static Result ok(Integer status){
        return  ok(status,SUCCESS_MESSAGE);
    }
    public static Result ok(Integer status,Object data){
        return  Result.builder().status(status).message(SUCCESS_MESSAGE).data(data).build();
    }
    public static Result ok(Integer status,String message){
        return  Result.builder().status(status).message(message).build();
    }
    public static Result ok(String message,Object data){
        return  Result.builder().status(SUCCESS_CODE).message(message).data(data).build();
    }

    public static Result notOk(){
        return  notOk(ERROR_CODE);
    }
    public static Result notOk(String message){
        return  notOk(ERROR_CODE,message);
    }
    public static Result notOk(Integer status){
        return  notOk(status,ERROR_MESSAGE);
    }
    public static Result notOk(Integer status,Object data){
        return  Result.builder().status(status).message(ERROR_MESSAGE).data(data).build();
    }
    public static Result notOk(Integer status,String message){
        return  Result.builder().status(status).message(message).build();
    }
    public static Result notOk(String message,Object data){
        return  Result.builder().status(ERROR_CODE).message(message).data(data).build();
    }

}
