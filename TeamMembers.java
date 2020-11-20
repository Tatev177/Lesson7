public class TeamMembers extends Human{
    private String title;
    private int hours;
    private boolean WFH;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isWFH() {
        return WFH;
    }

    public void setWFH(boolean WFH) {
        this.WFH = WFH;
    }
}
