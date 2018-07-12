package com.mycompany.app;

///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}

public class App {
	private static int result; // 静态变量，用于存储运行结果
    public static void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - n;  //Bug: 正确的应该是 result =result-n
    }
    public void multiply(int n) {
    }         // 此方法尚未写好
    public static void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * n;
    }
    public static void squareRoot(int n) {
        for (; ;) ;            //Bug : 死循环
    }
    public void clear() {     // 将结果清零
        result = 0;
    }
    public static int getResult(){
        return result;
    }

}