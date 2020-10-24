import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Customer c1= new Customer("Bell", true, "Premium");
        Date d1=new Date();
        Visit v1 = new Visit(c1,d1);
        v1.setProductExpense(50);
        v1.setServiceExpense(100);
        System.out.println(v1.toString());
    }
}
