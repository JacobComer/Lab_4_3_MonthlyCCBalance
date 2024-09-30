public class Lab_04_03_MonthlyCCBalance
{
    public static void main(String[] args)
    {
        double startBalance = 5000;
        double interest = 0.17 / 12;

        double oneMonth = startBalance + startBalance * interest;
        double twoMonth = oneMonth + oneMonth * interest;

        System.out.println("this is the balance after one month $ " + oneMonth);
        System.out.println("this is the balance after two months $ " + twoMonth);




    }
}
