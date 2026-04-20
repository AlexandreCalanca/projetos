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
    public Salary (Double annualSalary, Double annualServicesRevenue, Double annualCapitalGains,
                   Double medicalExpenses, Double educationalExpenses){
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
}
