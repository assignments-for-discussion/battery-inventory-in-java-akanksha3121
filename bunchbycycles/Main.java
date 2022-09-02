package bunchbycycles;

public class Main {
    static class CountsByUsage {
        public int lowCount = 0;
        public int mediumCount = 0;
        public int highCount = 0;
    }

    ;

    static CountsByUsage countBatteriesByUsage(int[] cycles) {
        CountsByUsage counts = new CountsByUsage();


//Running foreach on int[] cycles here cycle represent's a single value
        for (int cycle : cycles
        ) {
            if (cycle >= 920) {
                counts.highCount++;
            } else if (cycle < 400) {
                counts.lowCount++;
            } else {
                counts.mediumCount++;
            }
        }

        return counts;
    }

    static void testBucketingByNumberOfCycles() {
        System.out.println("Counting batteries by usage cycles...\n");
        CountsByUsage counts = countBatteriesByUsage(new int[]{100, 300, 500, 600, 900, 1000});
        assert (counts.lowCount == 2) : "LowCount isn't right";
        assert (counts.mediumCount == 3) : "MidCount isn't right";
        assert (counts.highCount == 1) : "HighCount isn't right";
        System.out.println("Done counting :)\n");
    }

    public static void main(String[] args) {
        testBucketingByNumberOfCycles();
    }
}
