public class HealthReport implements Report{
    @Override
    public void load() {
        System.out.println("Health data Loading");
    }

    @Override
    public void print() {
        System.out.println("Health printing");
    }
}
