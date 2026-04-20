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
        double tax = 0.0;
        if (annualSalary < 12 * 3000){
            tax = annualSalary / 100 * 0;
        } else if (annualSalary < 12 * 5000){
            tax = annualSalary / 100 * 10;
        } else{
            tax = annualSalary / 100 * 20;
        }
        return tax;
    }
    public Double servicesTax(){
        double tax = 0.0;
        if(annualServicesRevenue > 0){
            tax = annualServicesRevenue / 100 * 15;
        }
        return tax;
    }
    public Double capitalTax(){
        double tax = 0.0;
        if(annualCapitalGains > 0){
            tax = annualCapitalGains / 100 * 20;
        }
        return tax;
    }
}
