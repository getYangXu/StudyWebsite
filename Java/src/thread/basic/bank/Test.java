package thread.basic.bank;

/**
 * @author yxgu
 */
public class Test {

    public static void main(String[] args) {
        Bank bank = new Bank();
        PersonA personA = new PersonA(bank);
        PersonB personB = new PersonB(bank);
        personA.start();
        personB.start();

    }
}
