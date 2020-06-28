package com.kevin.object;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

public class ObjectTest {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        // 查看大端序还是小端序
        System.out.println(ByteOrder.nativeOrder());

        // 打印当前JVM属性
        System.out.println(VM.current().details());
    }

}
