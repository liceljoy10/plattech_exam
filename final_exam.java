import java.util.Scanner;

public class examSalary{
    public static void main(String[] args) {  
        
        Scanner s = new Scanner(System.in);
        System.out.print("Your Annual Salary : ");
        float anSalary = s.nextFloat();

        if(totalSalary < 250000){
            
        }
        else if(totalSalary >= 250000 && totalSalary < 400000){
            Double tax_deduction = 1 - 250000 * .20;

            //variables to compute values
            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(totalSalary >= 400000 && totalSalary < 800000){
            float tax_excess = totalSalary - 400000;
            Double tax_deduction = 0.25 * tax_excess + 30000;

            //variables to compute values
            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(totalSalary >= 800000 && totalSalary < 2000000){
            float tax_excess = totalSalary - 800000;
            Double tax_deduction = 0.25 * tax_excess + 130000;

            //variables to compute values
            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(totalSalary >= 2000000 && totalSalary < 8000000){
            float tax_excess = totalSalary - 2000000;
            Double tax_deduction = 0.25 * tax_excess + 490000;

            //variables to compute values
            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }
        else if(totalSalary >= 8000000){
            float tax_excess = totalSalary - 8000000;
            Double tax_deduction = 0.25 * tax_excess + 2410000;

            //variables to compute values
            float Monthly_Rate = totalSalary / 12;
            float Daily_Rate = Monthly_Rate / 22;
            float Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;

            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rat: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", Net_Pay));
        }


        
    }
}