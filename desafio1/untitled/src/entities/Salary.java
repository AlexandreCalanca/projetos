package entities;

public class Salary {
    //atributes
    private Double annualSalary;
    private Double annualServicesRevenue;
    private Double annualCapitalGains;
    private Double medicalExpenses;
    private Double educationalExpenses;

    //constructors
    public Salary(){
    }

    public Salary (double annualSalary, double annualServicesRevenue, double annualCapitalGains,
                   double medicalExpenses, double educationalExpenses){
        this.annualSalary = annualSalary;
        this.annualServicesRevenue = annualServicesRevenue;
        this.annualCapitalGains = annualCapitalGains;
        this.medicalExpenses = medicalExpenses;
        this.educationalExpenses = educationalExpenses;
    }

    // getters and setters
    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Double getAnnualServicesRevenue(){
        return annualServicesRevenue;
    }

    public void setAnnualServicesRevenue(Double annualServicesRevenue){
        this.annualServicesRevenue = annualServicesRevenue;
    }

    public Double getAnnualCapitalGains(){
        return annualCapitalGains;
    }

    public void setAnnualCapitalGains(Double annualCapitalGains){
        this.annualCapitalGains = annualCapitalGains;
    }

    public Double getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(Double medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    public Double getEducationalExpenses() {
        return educationalExpenses;
    }

    public void setEducationalExpenses(Double educationalExpenses) {
        this.educationalExpenses = educationalExpenses;
    }

    //method
    public Double payrollTax(){
        double tax;
        if (annualSalary < 12 * 3000){
            tax = annualSalary / 100 * 0;
        } else if (annualSalary < 12 * 5000){
            tax = annualSalary / 100 * 10;
        } else{
            tax = annualSalary / 100 * 20;
        }
        return tax;
    }
    public double servicesTax() {
        return annualServicesRevenue * 0.15;
    }
    public double capitalTax() {
        return annualCapitalGains * 0.20;
    }
    public double grossTax() {
        return payrollTax() + servicesTax() + capitalTax();
    }
    public double maxDeductible() {
        return grossTax() * 0.30;
    }
    public double deductibleExpenses() {
        return medicalExpenses + educationalExpenses;
    }
    public double taxRebate() {
        return Math.min(maxDeductible(), deductibleExpenses());
    }
    public double netTax() {
        return grossTax() - taxRebate();
    }
    public String toString() {
        return "\nRELATÓRIO DE IMPOSTO DE RENDA\n"
                + "\nCONSOLIDADO DE RENDA:\n"
                + String.format("Imposto sobre salário: %.2f%n", payrollTax())
                + String.format("Imposto sobre serviços: %.2f%n", servicesTax())
                + String.format("Imposto sobre ganho de capital: %.2f%n", capitalTax())
                + "\nDEDUÇÕES:\n"
                + String.format("Máximo dedutível: %.2f%n", maxDeductible())
                + String.format("Gastos dedutíveis: %.2f%n", deductibleExpenses())
                + "\nRESUMO:\n"
                + String.format("Imposto bruto total: %.2f%n", grossTax())
                + String.format("Abatimento: %.2f%n", taxRebate())
                + String.format("Imposto devido: %.2f%n", netTax());
    }
}

