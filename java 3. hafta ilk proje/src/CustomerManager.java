public class CustomerManager {
    private Customer Person;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
Person = customer;
_creditManager= creditManager;
    }
    public void save(){
        System.out.println("Müşteri kaydedildi "+ Person.getId());
    }
    public void delete(){
        System.out.println("Müşteri silindi "+ Person.getId());

    }public void giveCredit(){
            _creditManager.calculate();
        System.out.println("Kredi Verildi");
    }
}
