package com.alibaba.dubbo.rpc.filter;

import com.alibaba.dubbo.rpc.*;

import java.util.Date;

/**
 * Created by sky on 2017/11/24.
 */
public class MyFilter implements Filter {
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        // before filter ...
        System.out.println("before filter ...");
        System.out.println(invoker.getUrl());
        Result result = invoker.invoke(invocation);
        // after filter ...
        System.out.println("after filter ...");
        return result;
    }
}
