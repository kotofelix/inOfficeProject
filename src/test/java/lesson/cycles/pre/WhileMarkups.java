package lesson.cycles.pre;

import java.math.BigDecimal;

public class WhileMarkups {
    public static void main(String[] args) {
        int i = 50;
        while (i > 4)
            i -= 15;

        String name = "Boris";
        while (name !=null)
            if(i++ <23) System.out.println(name + " " + i);
        else name = null;

        Account account = null;
        while (account == null || account.accountId == null || account.balance == null){
            if (account == null){
                System.out.println("Creating account");
                account = new Account();
            } else if (account.accountId ==null) {
                System.out.println("Set account id");
                account.accountId = 15L;
            } else {
                System.out.println("Set account balance");
                account.balance = BigDecimal.valueOf(2156);
            }
            System.out.println("Iteration ends");
        }
        System.out.println("Done");

        while (i-- > 500) System.out.println("It's never printing");
    }

    static class Account{
        Long accountId;
        BigDecimal balance;
    }
}
