package com.example.demo;

public class DemoJava {

    public static void main(String[] args) {
        // System.out.println(123);
        // Math
        double x = 4;
        double y = Math.sqrt(x);// sqrt处理的不是对象，为静态方法
        // System.out.print(y);

        double z = Math.pow(x, y);
        // System.out.println(z);
        /**
         * 浮点数值不适用于无法接受舍入误差的金融计算中。 例如，命令 System.out.println ( 2.0-1.1 ) 将打印出
         * 0.8999999999999999, 而不是人们想象的 0.9。这种舍入误差的主要 原因是浮点数值采用二进制系统表示，
         * 而在二进制系统中无法精确地表示分数 1/10。这 就好像十进制无法精确地表示分数 1/3 —样。如果在数值计算中不允许有任何舍入误差， 就应该使用
         * BigDecima丨类
         */
        System.out.println(2.0 - 1.1);

        // System.out.println(Double.isNaN(z/0));
    }

}
