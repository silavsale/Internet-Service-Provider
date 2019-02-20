public class InternetPlan {

    public static void main(String[] args) {

        SubscriptionPlan plan = new SubscriptionPlan();

        plan.setSubPackage();
        plan.setNumberOfHours();
        plan.calculateRMC();
    }
}