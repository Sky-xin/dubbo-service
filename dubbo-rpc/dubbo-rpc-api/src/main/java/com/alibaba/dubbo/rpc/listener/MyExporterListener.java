package com.alibaba.dubbo.rpc.listener;

import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.ExporterListener;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by sky on 2017/11/24.
 */
public class MyExporterListener implements ExporterListener{
    public void exported(Exporter<?> exporter) throws RpcException {
        System.out.println("exported");
    }

    public void unexported(Exporter<?> exporter) {
        System.out.println("unexported");

    }
}
