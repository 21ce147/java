//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package practical_2_4;
public class ACCmain {
    public static void main(String[] args) {
        ACC a1=new ACC();
        a1.setdata(200000,100000, 6.7, "17-6-2020");
        System.out.println("Current Balance :\n"+a1.getBalance());
        System.out.println("Annual Interest :\n"+a1.getAnnualInterest());
        System.out.println("Monthly Interest :\n"+a1.getMonthlyInterest());
        System.out.println("Monthly Interest Rate:\n"+a1.getMonthlyInterestRate());
        System.out.println("Account was created on \n"+a1.getDateCreated());
        a1.withdraw(12000);
        a1.deposit(15000);
        SavingAccount a=new SavingAccount(1200);
        CheckingAccount b=new CheckingAccount(2000);
        System.out.println("For Saving Account:\n");
        System.out.println(a);
        System.out.println("For Checking Account:\n");
        System.out.println(b);
    }
}

