
public class Main {
    public static void main(String[] args) {
        int temperature = 25;
        boolean isWarm = temperature >= 20 && temperature <=35;
        System.out.println(isWarm);

        boolean hasHighSalary = true;
        boolean hasGoodCredit = true;
        boolean isCriminal = false;
        boolean isEligible = hasGoodCredit || hasHighSalary && !isCriminal;
        System.out.println(isEligible);
    }
}