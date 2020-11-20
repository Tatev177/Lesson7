public class Project {
    private String projectName = "GF 22";
    private int releaseDate = 12;
    private int releaseCount = 4;
    private boolean isFinFet = true;
    private String engineerName = "Nare";

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseCount() {
        return releaseCount;
    }

    public void setReleaseCount(int releaseCount) {
        this.releaseCount = releaseCount;
    }

    public boolean isFinFet() {
        return isFinFet;
    }

    public void setFinFet (boolean finFet) {
        if (isFinFet){
            this.isFinFet = true;
            System.out.println("Yes");}
        else
            System.out.println("No");
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public void printInfo(){
        System.out.println("Project is:" + " " +projectName);
        System.out.println("Release date is:" + " " +releaseDate);
        System.out.println("Release count is:" + " " +releaseCount);
        System.out.println("Engineer name:" + " " +engineerName);
        System.out.println("Technology is Finfet: Yes or No:" + " " +isFinFet); //????

    }
}
