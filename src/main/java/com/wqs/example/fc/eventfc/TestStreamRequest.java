//package com.wqs.example.fc.eventfc;
//
//import com.aliyun.fc.runtime.Context;
//import com.aliyun.fc.runtime.FunctionComputeLogger;
//import com.aliyun.fc.runtime.FunctionInitializer;
//import com.aliyun.fc.runtime.StreamRequestHandler;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
///**
// * 事件函数：以流的方式接受调用输入 event 和返回执行结果，
// *          您需要从输入流中读取调用函数时的输入，处理完成后把函数执行结果写入到输出流中来返回。
// */
//public class TestStreamRequest implements StreamRequestHandler, FunctionInitializer {
//    private static int count = 0;
//
//    private static int init = 0;
//
//    @Override
//    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
//            throws IOException {
//        count += 1;
//        FunctionComputeLogger logger = context.getLogger();
//        logger.debug(String.format("RequestID is %s %n", context.getRequestId()));
//        logger.debug(String.format("init: %d , invoke times: %d", init, count));
//        byte[] bytes = new byte[1024];
//        inputStream.read(bytes);
//        logger.debug(String.format("received：%s \n", new String(bytes).trim()));
//
//        String key = "key1: " + System.getenv("key1");
//        logger.debug(String.format("环境变量-%s", key));
//        outputStream.write("success!".getBytes());
//    }
//
//    public static void main(String[] args) {
//        byte[] bytes = new byte[10];
//        bytes[0] = 1;
//        System.out.println(new String(bytes).trim());
//    }
//
//    @Override
//    public void initialize(Context context) {
//        FunctionComputeLogger logger = context.getLogger();
//        logger.debug(String.format("initialize-----RequestID is %s %n", context.getRequestId()));
//        init += 1;
//    }
//}
