package thread.basic.station;

/**
 * @author yxgu
 */
public class Station extends Thread {

    /**
     * 示例一：三个售票窗口同时出售20张票;
     *
     * 程序分析：
     * 1.票数要使用同一个静态值
     * 2.为保证不会出现卖出同一个票数，要java多线程同步锁。
     * 设计思路：
     * 1.创建一个站台类Station，继承Thread，重写run方法，在run方法里面执行售票操作！
     *   售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完！
     */

    /**
     * @param name
     * 通过构造方法给线程名字赋值
     */
    public Station(String name){
        //给线程名字赋值
        super(name);
    }

    /**
     *为了保证票数的一致，票数要静态
     */
    static int tick = 20;
    /**
     *创建一个静态钥匙 值是任意的
     */
    static Object ob = "aa";

    /**
     * 重写run方法，实现买票操作
     */
    @Override
    public void run(){
        while(tick > 0){
            /*必须使用一个锁*/
            synchronized (ob){
                if (tick > 0){
                    System.out.println(getName() + "卖出了第" + tick + "张票" );
                    tick--;
                }else{
                    System.out.println("票卖完了");
                }
            }
            try{
                sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
