package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 18:57
 **/
public class Client {

    public static void main(String[] args) {
//        //决定权在用户手里，导出成什么方式
//        ExportOperate operate=new ExportDbOperate();
//        //客户端需要传type，向外暴露内部功能
//       operate.export("测试数据");

        Abc abc=new ExportOperate().createAbc("ceshi");
        abc.test();
    }
}
