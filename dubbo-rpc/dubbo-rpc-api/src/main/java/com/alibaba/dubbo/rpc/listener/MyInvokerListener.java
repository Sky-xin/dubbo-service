package com.alibaba.dubbo.rpc.listener;


import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.InvokerListener;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by sky on 2017/11/24.
 */
public class MyInvokerListener implements InvokerListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(MyInvokerListener.class);

    public void destroyed(Invoker<?> invoker) {
        System.out.println("><><><><><><><><><><");
    }

    public void referred(Invoker<?> invoker) throws RpcException {
        System.out.println(">>>>>>>>>>>>>>>>>>>>referred");
        LOGGER.info(invoker.getUrl().getParameter(Constants.DEPRECATED_KEY, false)+"");
//        if (invoker.getUrl().getParameter(Constants.DEPRECATED_KEY, false)) {
//            LOGGER.error("The service " + invoker.getInterface().getName() + " is DEPRECATED! Declare from " + invoker.getUrl());
//        }
    }

}
