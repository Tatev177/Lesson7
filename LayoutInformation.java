public class LayoutInformation extends Project {

    private boolean isPass;
    private int countOfDRC = 12;
    private int countOfLVS = 9;
    private String extractionErrors = "pass";
    private String openNets = "pass";
    private int unmachedDevices = 3;

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public int getCountOfDRC() {
        return countOfDRC;
    }

    public void setCountOfDRC(int countOfDRC) {
        this.countOfDRC = countOfDRC;
    }

    public int getCountOfLVS() {
        return countOfLVS;
    }

    public void setCountOfLVS(int countOfLVS) {
        this.countOfLVS = countOfLVS;
    }

    public String getExtractionErrors() {
        return extractionErrors;
    }

    public void setExtractionErrors(String extractionErrors) {
        this.extractionErrors = extractionErrors;
    }

    public String getOpenNets() {
        return openNets;
    }

    public void setOpenNets(String openNets) {
        this.openNets = openNets;
    }

    public int getUnmachedDevices() {
        return unmachedDevices;
    }

    public void setUnmachedDevices(int unmachedDevices) {
        this.unmachedDevices = unmachedDevices;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Design without erros: Yes or No" + " " + isPass);
        System.out.println("Count of DRC errors" + " " + countOfDRC);
        System.out.println("Count of LVS errors" + " " + countOfLVS);
        System.out.println("Extraction errors:" + " " + extractionErrors);
        System.out.println("Open nets names:" + " " + openNets);
        System.out.println("Unmached devices:" + " " + unmachedDevices);
    }
}
