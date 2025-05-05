
class InvoiceDetail <N extends Number>{
    private String invoiceName;
    private N amount;
    private N discount;

    InvoiceDetail(String n,N a,N d){
        invoiceName = n;
        amount = a;
        discount = d;
    }
    String getInvoiceName(){
        return invoiceName;
    }
    N getAmount(){
        return amount;
    }
    N getDiscount(){
        return discount;
    }
    public static void main(String... args){
        InvoiceDetail<Integer> idi = new InvoiceDetail<Integer>("Kathan",25000,15000);
        InvoiceDetail<Double> idd = new InvoiceDetail<Double>("Meet", 29000.45,2400.43);

        System.out.print("For integer values : ");
        System.out.println("Name : " + idi.getInvoiceName() + ", Amount : " + idi.getAmount() + ", Discount : " + idi.getDiscount());

        System.out.print("For double values : ");
        System.out.println("Name : " + idd.getInvoiceName() + ", Amount : " + idd.getAmount() + ", Discount : " + idd.getDiscount()); 
    }
}

