import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
      //  customer1.isCompany();
        customer1.setCompanyName("TSMC");
        customer1.setTechnology("TSMC180nm");
        customer1.setPhoneNumber(987398291);

      //  System.out.println("Company name is:" + " " + customer1.getCompanyName());
        System.out.println("Technology is:" + " " +customer1.getTechnology());
        System.out.println("Phone number:" + " " +customer1.getPhoneNumber());

        TeamMembers member1= new TeamMembers();
        member1.setFirstName("Ara");
        member1.setLastName("Mkrtchyan");
 //       member1.setWFH(true); ???
        member1.setHours(4);
        member1.setTitle("intern");

        System.out.println("Engineer first name:" + " " + member1.getFirstName());
        System.out.println("Engineer last name:" + " " + member1.getLastName());
       // System.out.println("Work from home:" + " " + member1.getWFM); ???
        System.out.println("Working hours:" + " " + member1.getHours());
        System.out.println("Job title:" + " " + member1.getTitle());


        Scanner s = new Scanner(System.in);
        Customer Customer2 = new Customer();
        System.out.println("Enter name of Customer");
        String name = s.next();
        System.out.println("Enter type of Technology");
        String technology = s.next();


        LayoutInformation layout1 = new LayoutInformation();
        layout1.printInfo();

        SchematicInformation scheme1 = new SchematicInformation();
        scheme1.printInfo();

    }
}
