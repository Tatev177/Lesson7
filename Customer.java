public class Customer extends Human{
    private boolean isCompany = true;
    private String technology;
    private int time;

    public Customer(){

    }
    public Customer(boolean isCompany, String technology, int time) {
        this.isCompany = isCompany;
        this.technology = technology;
        this.time = time;
    }

    public void isCompany() {
        if(isCompany)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public void setCompany(boolean company) {
        isCompany = company;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
