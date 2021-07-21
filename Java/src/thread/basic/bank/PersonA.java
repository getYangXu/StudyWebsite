package thread.basic.bank;

/**
 * @author yxgu
 */
public class PersonA extends Thread{
    /**
     * 创建银行对象
     */
    Bank bank;

    public PersonA(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        while(Bank.money >=100){
            bank.Counter(100);
            try{
                sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
