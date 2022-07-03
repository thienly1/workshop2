import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import se.lexicon.BankAccount;

public class BankAccountTest {

    private BankAccount testBankAccount;

    // method 1:
   /*BankAccount a = new BankAccount(1200_000);

    @Test
    public void withDraw_money_get_balance(){
        double withDrawAmount = 400_000;
        double expectedBalance = 800_000 ;
        a.withDraw(withDrawAmount);
        Assertions.assertEquals(expectedBalance, a.getBalance(),0);
    }
    @Test
    public void withDraw_negative_amount_will_not_change_balance(){
        double withDrawAmount = -20_000;
        String expected = "Negative amount, not allowed";
        Assertions.assertEquals(expected, a.withDraw(withDrawAmount));
    }
    @Test
    public void withDraw_greater_amount_will_not_allowed(){
        double withDrawAmount = 1500_000;
        String expected = "Amount is greater than the balance, invalid amount";
        Assertions.assertEquals(expected,a.withDraw(withDrawAmount));
    }*/

    //method 2
   @BeforeEach
   public void setup(){
       testBankAccount = new BankAccount(900_000);
   }
   @Test
   public void withDraw_valid_amount_return_new_balance(){

       double expectedAmount = 30_000;
       double actualAmount = testBankAccount.withDraw(expectedAmount);
       double expectedBalance = 870_000;
       double actualBalance = testBankAccount.getBalance();
       Assertions.assertTrue(expectedAmount==actualAmount && expectedBalance== actualBalance);
      // Assertions.assertEquals(expectedAmount,actualAmount);
       //Assertions.assertEquals(expectedBalance,actualBalance);
   }
   @Test
    public void withDraw_invalid_amount_return_invalid(){
       double expectedAmount = -1;
       double expectedBalance = 900_000;
       // negative amount
     Assertions.assertTrue(expectedAmount== testBankAccount.withDraw(-30_000) && expectedBalance ==testBankAccount.getBalance());
     // greater amount
    Assertions.assertTrue(expectedAmount== testBankAccount.withDraw(1000_000) && expectedBalance ==testBankAccount.getBalance());
   }
   @Test
    public void testDeposit_return_new_balance(){
       double depositAmount = 300_000;
       double newBalance = 1200_000;
       testBankAccount.deposit(depositAmount);
       Assertions.assertEquals(newBalance,testBankAccount.getBalance(),0);
   }
   @Test
    public void test_deposit_negative_value(){
       double depositAmount = -50_000;
       double newBalance = 900_000;
       testBankAccount.deposit(depositAmount);
       Assertions.assertEquals(newBalance, testBankAccount.getBalance());
   }

}
