public class Main {
    public static void main(String[] args) {
//CreditManager creditManager = new CreditManager();
//creditManager.calculate();
//Customer customer = new Customer();
//customer.getId();
//customer.id=1;
//customer.city="Ankara";
//
//Company company = new Company();
//company.taxNumber="123123123";
// company.companyName= "Beko";
// company.id=100;
//
//CustomerManager customerManager2 = new CustomerManager(new Person());
//
//Person person = new Person();
//person.nationalNumber = "546481";
//person.firstName= "Adem";
//
//CustomerManager customerManager = new CustomerManager(customer);
////customerManager.save(1,"Çağatay","Özdemir","13131564");
//        customerManager.save();
//        customerManager.delete();
        CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();

    }
}