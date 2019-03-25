public class FinanceReport implements Report{

    @Override
    public void load() {
        System.out.println("Finance data Loading");
    }

    @Override
    public void print() {
        System.out.println("Finance printing");
    }
}
