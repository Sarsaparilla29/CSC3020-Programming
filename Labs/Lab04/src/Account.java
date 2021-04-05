
class Account {
  private int id;
  private double balance;

  public Account() {
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public String toString() {
    return "Account id: "+ id +"\nAccount balance: "+ balance;
  }
}

class Checking extends Account {
    protected double fee;
    Checking(double f) {
      fee = f;
      super.setBalance(35);
      super.setId(1);
    }
    //@Override
    public String toString() {
        //System.out.println(super.toString());
        System.out.println("Checking Account " + "\nMonthly Fee: " + fee);
        return super.toString(); // call super class toString method from the sub class toString method
    }
}

class Savings extends Account {
  protected double interestRate;

  Savings(double ir) {
    interestRate = ir;
    super.setBalance(25);
    super.setId(1);
  }
  public String toString() {
      System.out.println("Savings Account " + "\nInterest Rate: " + interestRate);
      return super.toString(); // call super class toString method from the sub class toString method
  }

}

class TestAccount {
  public static void main(String[] args) {
      // create objects
      Checking check = new Checking(25);
      Savings save = new Savings(0.05);

      // before
      System.out.println("Account info before withdrawing 10");
      System.out.println(check.toString());
      System.out.println();
      System.out.println(save.toString());
      System.out.println();

      // after
      System.out.println("Account info after withdrawing 10");
      check.withdraw(10);
      //String str = check.toString();
      System.out.println(check.toString());
      System.out.println();
      save.withdraw(10);
      System.out.println(save.toString());
      System.out.println();


  }
}