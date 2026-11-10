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

        int mergerCount = 0;
        Company titan = null;

        while (market.size() >= 2) {
            Company companyA = market.poll();
            Company companyB = market.poll();

            int newSize = (int) ((companyA.getSize() + companyB.getSize()) * 1.1);
            String newName = companyA.getName() + "-" + companyB.getName();

            Company merged = new Company(newName, newSize);
            mergerCount++;

            System.out.println("MERGER: " + companyA.getName() + " and "
                    + companyB.getName() + " have merged into "
                    + merged.getName() + " with size " + merged.getSize() + "!");

            if (merged.getSize() >= 500000) {
                titan = merged;
                break;
            }

            market.add(merged);
        }

        System.out.println("\n--- FINAL REPORT ---");

        if (titan != null) {
            System.out.println("Industry Titan: " + titan.getName());
            System.out.println("Titan Size: " + titan.getSize());
        } else {
            System.out.println("No titan has emerged.");

            if (!market.isEmpty()) {
                System.out.println("Largest Remaining Company: " + market.peek());
            }
        }

        System.out.println("Total Mergers: " + mergerCount);
    }
}
