package com.sun.interface_;

public class OracleDB implements DBInterface {

    @Override
    public void connect() {
        System.out.println("连接DB数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭DB数据库");
    }
}
