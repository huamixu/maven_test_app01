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
	private static int result; // ��̬���������ڴ洢���н��
    public static void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - n;  //Bug: ��ȷ��Ӧ���� result =result-n
    }
    public void multiply(int n) {
    }         // �˷�����δд��
    public static void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * n;
    }
    public static void squareRoot(int n) {
        for (; ;) ;            //Bug : ��ѭ��
    }
    public void clear() {     // ���������
        result = 0;
    }
    public static int getResult(){
        return result;
    }

}