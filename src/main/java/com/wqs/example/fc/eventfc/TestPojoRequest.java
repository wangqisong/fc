//package com.wqs.example.fc.eventfc;
//
//import com.aliyun.fc.runtime.Context;
//import com.aliyun.fc.runtime.FunctionComputeLogger;
//import com.aliyun.fc.runtime.FunctionInitializer;
//import com.aliyun.fc.runtime.PojoRequestHandler;
//
///**
// * 事件函数：对象形式参数
// */
//public class TestPojoRequest implements PojoRequestHandler<SimpleRequest, SimpleResponse>, FunctionInitializer {
//    private static int count = 0;
//    private static int init = 0;
//
//    @Override
//    public SimpleResponse handleRequest(SimpleRequest request, Context context) {
//        count += 1;
//        FunctionComputeLogger logger = context.getLogger();
//        logger.debug(String.format("handleRequest-----RequestID is %s %n", context.getRequestId()));
//        logger.debug(String.format("init: %d , invoke times: %d", init, count));
//        String message = "Hello, " + request.getFirstName() + " " + request.getLastName();
//        logger.debug(message);
//        return new SimpleResponse("success!");
//    }
//
//    @Override
//    public void initialize(Context context) {
//        FunctionComputeLogger logger = context.getLogger();
//        logger.debug(String.format("initialize-----RequestID is %s %n", context.getRequestId()));
//        init += 1;
//    }
//}
