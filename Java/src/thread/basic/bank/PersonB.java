package thread.basic.bank;

/**
 * @author yxgu
 */
public class PersonB extends Thread{
    /**
     * 创建银行对象
     */
    Bank bank;

    public PersonB(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        while (Bank.money > 200){
            bank.ATM(200);
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
