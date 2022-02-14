package Java_Git;

/**
 * 扫描仪类，获取键盘中得到的字符，并指向其他关键字 
 * */
import java.util.Scanner;


public class helloworld {/*一个java文件只能有一个public类 */
    int args1,args2;
    public static void main(String[] args) {
        int i=one();
        System.out.println(i);
    }
    public static int one(){
        int a=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        input.close();
        return a;

    }

}
/**
 * 渔民类 
 *  */
class Fishermen{
    
}
/**鱼竿类 */
class Fishing_rod{

}
/**鱼类 */
class Fish{

}