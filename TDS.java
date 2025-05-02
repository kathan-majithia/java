class TDS{
    String name;
    double basic_sal,dearness_allowance;
    double gross_sal,tax;
    TDS(String n,double sal,double allow){
        name = n;
        basic_sal = sal;
        dearness_allowance = allow;
        gross_sal = sal + allow;
    }
    void tax_deducted(){
        tax = 0;
        if (gross_sal > 100000)
            tax = (gross_sal - 100000) * 0.1;
    }
    public static void main(String... args) {
        TDS per1 = new TDS("Nisarg",95000,30000);
        TDS per2 = new TDS("Harsh",45000,12000);

        per1.tax_deducted();
        per2.tax_deducted();

        per1.display();
        System.out.println("\n");
        per2.display();
    }
}