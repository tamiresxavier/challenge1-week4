import java.util.Scanner;

public class BonusEmployee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of employees you wish to register:");
        int quantityEmployees = input.nextInt();

        String[] names = new String[quantityEmployees];
        double[] salarys = new double[quantityEmployees];
        double[] bonusDiscounts = new double[quantityEmployees];
        double[] liquidSalary = new double[quantityEmployees];

        for(int i = 0; i < quantityEmployees; i++){
            System.out.print("Enter the name of the "  + (i + 1) + "º employee: ");
            names[i] = input.next();
            System.out.print("Enter the salary of " + (i + 1) + "º employee: ");
            salarys[i] = input.nextDouble();

            if(salarys[i] <= 1000){
                bonusDiscounts[i] = salarys[i] * 0.2;
            }else if(salarys[i] > 1000 && salarys[i] <= 2000){
                bonusDiscounts[i] = salarys[i] * 0.1;
            }else{
                bonusDiscounts[i] = salarys[i] * -0.1;
            }

            liquidSalary[i] = salarys[i] + bonusDiscounts[i];
        }

        for(int i = 0; i < quantityEmployees; i++){
            System.out.println("Employee: " + names[i]);
            System.out.println("Salary: R$ " + salarys[i]);
            if(bonusDiscounts[i] > 0){
                System.out.println("Bonus: R$ " + bonusDiscounts[i]);
            }else if (bonusDiscounts[i] < 0){
                System.out.println("Discount: R$ " + (bonusDiscounts[i] * -1));
            }
            System.out.println("Liquid salary: R$ " + liquidSalary[i]);
        }
    }
}