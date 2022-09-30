public class Lab04avst
{
    public static void main(String[] args)
        {
            System.out.println("90p version");

            System.out.println("Lab 04a Student Version\n");
            double principal = 250000;
            double annualRate = 4.85;
            double numYears = 30;

            System.out.println("Principal: \t\t"+principal);
            System.out.println("Annual Rate: \t"+annualRate+"%");
            System.out.println("Number Of Years: "+numYears);

            //User created vars
            double monthlyRate = (annualRate / 100 / 12);
            double numMonths = numYears * 12;

            //Top & bottom
            double numerator = Math.pow(1+monthlyRate,numMonths) * monthlyRate;
            double denominator = Math.pow(1+monthlyRate,numMonths) - 1;

            double monthPayment = ((numerator / denominator) * principal);

            System.out.println("Monthly Pay: $"+monthPayment);

            double totalPay = monthPayment*numMonths;

            System.out.println("Total Pay: $"+totalPay);
        }
}
