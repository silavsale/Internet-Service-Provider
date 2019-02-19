import java.util.Scanner;

public class InternetPlan {

    public static void main(String[] args) {

        SubscriptionPlan plan = new SubscriptionPlan();

//        String subscriptionPackage;
//        int hours;

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Your Subscription Packages:");
//        subscriptionPackage = sc.next();
//        plan.setSubPackage(subscriptionPackage);
//        System.out.println("Enter how many hours your used internet this month:");
//        hours = sc.nextInt();
//        plan.setNumberOfHours(hours);
        plan.setSubPackage();
        plan.setNumberOfHours();
        plan.calculateRMC();
    }
}
