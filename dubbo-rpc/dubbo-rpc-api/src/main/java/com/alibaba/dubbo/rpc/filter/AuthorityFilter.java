//package com.alibaba.dubbo.rpc.filter;
//
//import com.alibaba.dubbo.common.logger.Logger;
//import com.alibaba.dubbo.common.logger.LoggerFactory;
//import com.alibaba.dubbo.rpc.*;
//
//import java.util.List;
//
///**
// * Created by sky on 2017/11/24.
// */
//public class AuthorityFilter implements Filter {
//    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorityFilter.class);
//
//    private IpWhiteList ipWhiteList;
//
//    //dubbo通过setter方式自动注入
//    public void setIpWhiteList(IpWhiteList ipWhiteList) {
//        this.ipWhiteList = ipWhiteList;
//    }
//
//    @Override
//    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        if (!ipWhiteList.isEnabled()) {
//            LOGGER.debug("白名单禁用");
//            return invoker.invoke(invocation);
//        }
//
//        String clientIp = RpcContext.getContext().getRemoteHost();
//        LOGGER.debug("访问ip为{}", clientIp);
//        List<String> allowedIps = ipWhiteList.getAllowedIps();
//        if (allowedIps.contains(clientIp)) {
//            return invoker.invoke(invocation);
//        } else {
//            return new RpcResult();
//        }
//    }
//}
