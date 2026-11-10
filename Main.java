import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Company> market = new PriorityQueue<>();

        market.add(new Company("Disney", 25000));
        market.add(new Company("GE", 18000));
        market.add(new Company("Wayland-Yutani", 45000));
        market.add(new Company("ACME Corp", 1200));
        market.add(new Company("Stark Industries", 35000));
        market.add(new Company("Umbrella Corp", 8000));
        market.add(new Company("Cyberdyne Systems", 15000));
        market.add(new Company("Walmart", 50000));
        market.add(new Company("Aperture Science", 3000));
        market.add(new Company("Oscorp", 12000));

        Company smallest = market.poll();

        System.out.println("Smallest company: " + smallest);

        market.add(smallest);

        System.out.println("\nCompanies in the market: " + market.size());
    }
}
