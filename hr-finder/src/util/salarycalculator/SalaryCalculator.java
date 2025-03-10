package util.salarycalculator;


public class SalaryCalculator {

    // 연봉에 따른 세금 계산 (지방세 포함)
    public static double calculateSalTax(double annualSalary) {
        double tax = 0.0;

        if (annualSalary <= 11000) {
            tax = annualSalary * 0.10;
        } else if (annualSalary <= 44725) {
            tax = 11000 * 0.10 + (annualSalary - 11000) * 0.12;
        } else if (annualSalary <= 95375) {
            tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (annualSalary - 44725) * 0.22;
        } else if (annualSalary <= 182100) {
            tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (annualSalary - 95375) * 0.24;
        } else if (annualSalary <= 231250) {
            tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (182100 - 95375) * 0.24 + (annualSalary - 182100) * 0.32;
        } else if (annualSalary <= 578100) {
            tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (182100 - 95375) * 0.24 + (231250 - 182100) * 0.32 + (annualSalary - 231250) * 0.35;
        } else {
            tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (182100 - 95375) * 0.24 + (231250 - 182100) * 0.32 + (578100 - 231250) * 0.35 + (annualSalary - 578100) * 0.37;
        }

        return tax;
    }

}
