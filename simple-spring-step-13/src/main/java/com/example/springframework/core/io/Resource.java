package com.example.springframework.core.io;


import java.io.IOException;
import java.io.InputStream;

/**
 * 资源加载接口
 *
 * @author 陈家颖
 */
public interface Resource {


    /**
     * 获取 InputStream流
     *
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
