package org.leesia.tools;

import java.util.Properties;

/**
 * @Auther: leesia
 * @Date: 2018/5/17 16:42
 * @Description: 系统属性
 */
public class SystemPropertiesTool {

    public void print() {
        Properties props = System.getProperties(); //系统属性
        System.out.println("Java的运行环境版本：" + props.getProperty("java.version"));
        System.out.println("Java的运行环境供应商：" + props.getProperty("java.vendor"));
        System.out.println("Java供应商的URL：" + props.getProperty("java.vendor.url"));
        System.out.println("Java的安装路径：" + props.getProperty("java.home"));
        System.out.println("Java的虚拟机规范版本：" + props.getProperty("java.vm.specification.version"));
        System.out.println("Java的虚拟机规范供应商：" + props.getProperty("java.vm.specification.vendor"));
        System.out.println("Java的虚拟机规范名称：" + props.getProperty("java.vm.specification.name"));
        System.out.println("Java的虚拟机实现版本：" + props.getProperty("java.vm.version"));
        System.out.println("Java的虚拟机实现供应商：" + props.getProperty("java.vm.vendor"));
        System.out.println("Java的虚拟机实现名称：" + props.getProperty("java.vm.name"));
        System.out.println("Java运行时环境规范版本：" + props.getProperty("java.specification.version"));
        System.out.println("Java运行时环境规范供应商：" + props.getProperty("java.specification.vender"));
        System.out.println("Java运行时环境规范名称：" + props.getProperty("java.specification.name"));
        System.out.println("Java的类格式版本号：" + props.getProperty("java.class.version"));
        System.out.println("Java的类路径：" + props.getProperty("java.class.path"));
        System.out.println("加载库时搜索的路径列表：" + props.getProperty("java.library.path"));
        System.out.println("默认的临时文件路径：" + props.getProperty("java.io.tmpdir"));
        System.out.println("一个或多个扩展目录的路径：" + props.getProperty("java.ext.dirs"));
        System.out.println("操作系统的名称：" + props.getProperty("os.name"));
        System.out.println("操作系统的构架：" + props.getProperty("os.arch"));
        System.out.println("操作系统的版本：" + props.getProperty("os.version"));
        System.out.println("文件分隔符：" + props.getProperty("file.separator"));   //在 unix 系统中是＂／＂
        System.out.println("路径分隔符：" + props.getProperty("path.separator"));   //在 unix 系统中是＂:＂
        System.out.println("行分隔符：" + props.getProperty("line.separator"));   //在 unix 系统中是＂/n＂
        System.out.println("用户的账户名称：" + props.getProperty("user.name"));
        System.out.println("用户的主目录：" + props.getProperty("user.home"));
        System.out.println("用户的当前工作目录：" + props.getProperty("user.dir"));
    }

    public void print2() {
        Properties p = System.getProperties();//获取当前的系统属性
        p.list(System.out);//将属性列表输出
        System.out.print("CPU个数:");//Runtime.getRuntime()获取当前运行时的实例
        System.out.println(Runtime.getRuntime().availableProcessors());//availableProcessors()获取当前电脑CPU数量
        System.out.print("虚拟机内存总量:");
        System.out.println(Runtime.getRuntime().totalMemory());//totalMemory()获取java虚拟机中的内存总量
        System.out.print("虚拟机空闲内存量:");
        System.out.println(Runtime.getRuntime().freeMemory());//freeMemory()获取java虚拟机中的空闲内存量
        System.out.print("虚拟机使用最大内存量:");
        System.out.println(Runtime.getRuntime().maxMemory());//maxMemory()获取java虚拟机试图使用的最大内存量
    }

    public static void main(String[] args) {
        new SystemPropertiesTool().print2();
    }
}
