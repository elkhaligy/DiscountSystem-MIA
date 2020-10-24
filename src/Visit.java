import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense += serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense += productExpense;
    }

    public Visit(Customer customer,Date date) {
        this.date = date;
        this.customer = customer;
    }

    public double getTotalExpense() {
        double totalExpense;
        totalExpense= serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))
                + productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
        return totalExpense;
    }

    @Override
    public String toString() {
        return
                "Customer name=" + customer.getName() + '\n'+
                "Customer member: " + customer.isMember()+'\n'+
                "Customer membership=" + customer.getMemberType() +'\n'+
                "Date=" + date +'\n'+
                "ServiceExpense=" + serviceExpense +'\n'+
                "ProductExpense=" + productExpense +'\n'+
                "TotalExpense=" + getTotalExpense()+'\n';
    }
}
