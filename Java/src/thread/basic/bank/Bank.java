package thread.basic.bank;


/**
 * @author XinRui
 */
public class Bank {

    /**
     * 示例二：两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！
     * 程序分析：钱的数量要设置成一个静态的变量。两个人要取的同一个对象值
     */

    static int money = 1000;

    public void Counter(int money){
        Bank.money -= money;
        System.out.println("A取走了" + money + "还剩下" +(Bank.money));
    }

    public void ATM(int money){
        Bank.money -= money;
        System.out.println("B取走了" + money + "还剩下" +(Bank.money));
    }
}
