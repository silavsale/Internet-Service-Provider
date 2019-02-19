public class SubscriptionPlan {

    private String subPackage = "";
    private int numberOfHours;
    private int includedHours;
    private double plan;


    public String getSubPackage() {
        return subPackage;
    }

    public void setSubPackage(String subPackage) {
        this.subPackage = subPackage;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getIncludedHours() {
        return includedHours;
    }

    public void setIncludedHours(int includedHours) {
        this.includedHours = includedHours;
    }

    public double getPlan() {
        return plan;
    }

    public void setPlan(double plan) {
        this.plan = plan;
    }


    public void calculatePrice(String subpackage, int hour) {
        this.subPackage = subpackage.toUpperCase();
        setSubPackage(subPackage);
        this.numberOfHours = hour;
        setNumberOfHours(numberOfHours);

        String strPlan = "Your subscription plan is " + getSubPackage();
        String strHours = "You have been used internet for " + getNumberOfHours() + " hours this month.";

        if (subPackage.equals("A") && (numberOfHours < 744 && numberOfHours > 0)) {
            includedHours = 10;

            if (numberOfHours <= 10) {
                setPlan(9.95);
                System.out.println(strPlan);
                System.out.println(strHours);
                System.out.println("Your bill this month is $" + plan);

            } else {
                System.out.println(strPlan);
                int payHours = numberOfHours - includedHours;
                System.out.println(strHours);
                setPlan((payHours * 2) + 9.95);
                System.out.println("Your bill this month is $" + plan);

            }
        } else if (subPackage.equals("B")) {
            includedHours = 20;
            if (numberOfHours <= 10) {
                setPlan(14.95);
                System.out.println(strPlan);
                System.out.println(strHours);
                System.out.println("Your bill this month is $" + plan);
            } else {
                System.out.println(strPlan);
                int payHours = numberOfHours - includedHours;
                System.out.println(strHours);
                setPlan((payHours * 1) + 14.95);
                System.out.println("Your bill this month is $" + plan);
            }

        } else if (subPackage.equals("C") && (numberOfHours < 744 && numberOfHours > 0)) {
            setPlan(19.95);
            System.out.println(strPlan);
            System.out.println(strHours);
            System.out.println("Your bill this month is $" + plan);
        } else {
            System.out.println("Your Need to enter a valid subscription plan(A,B or C) and hours can't exceed 744 of be less than 0.");
            System.out.println("Please try again.");
        }

    }
}
