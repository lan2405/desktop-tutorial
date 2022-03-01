package Java_Git;

/*
  扫描仪类，创建扫描仪类对象
  扫描仪类对象拥有获取键盘中得到的字符，并指向其他关键字的方法
  */
import java.util.Scanner;


public class HelloWorld {
    /*一个java文件只能有一个public类且为主类 */
    static long args1;
    static int args2;
    /**一个java允许重载多个main方法（主方法） */
    public static void main(String[] args) {
        args2=Int_input();
        args1=Long_input();
        Fishermen a=new Fishermen(args1,args2);
        a.show();
    }
    public static int Int_input(){
        int a;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        return a;
    }
    public static long Long_input(){
        long a;
        Scanner input=new Scanner(System.in);
        a=input.nextLong();
        return a;
    }
}

/**
 * 渔民类 
 *  */
class Fishermen{
    long gender;
    int age;
    /**构造函数*/
    Fishermen(Long a,int b){
        gender=a;age=b;
    }
    /**展示信息*/
    public void show(){
        System.out.printf("这个%s渔民,%d岁",gender,age);
    }

    /**工作*/
    public void work(){

    }
}


/**鱼竿类 */
class Fishing_rod{
    /**长度*/
    int Length;
    /**颜色*/
    long color;
    /**构造函数*/
    Fishing_rod(){

    }
}

/**鱼类 */
class Fish{

}