package NewBegining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {
    Account myAccount = new Account();
@Test
void testIfAccountNameExist(){
    myAccount= new Account();
    myAccount.setName("Kingsley");
    assertNotNull( myAccount.getName());
}
@Test
void testIfAccountCanTakeDeposit(){
    myAccount = new Account();
    myAccount.deposit(200);
    assertEquals(200,myAccount.getBalance());
}
@Test
void testIfWithdrawalCanBePerformed(){
    myAccount =new Account();
    myAccount.withdraw(100);
    assertEquals(-100,myAccount.getBalance());
}

}