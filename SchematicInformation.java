public class SchematicInformation extends Project{
    private boolean isPass = true;
    private String schematicOpenNets = "No open nets";
    private String parasiticNets = "net34, net6, net9";
    private int countOfsensitives = 7;

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public String getSchematicOpenNets() {
        return schematicOpenNets;
    }

    public void setSchematicOpenNets(String schematicOpenNets) {
        this.schematicOpenNets = schematicOpenNets;
    }

    public String getParasiticNets() {
        return parasiticNets;
    }

    public void setParasiticNets(String parasiticNets) {
        this.parasiticNets = parasiticNets;
    }

    public int getCountOfsensitives() {
        return countOfsensitives;
    }

    public void setCountOfsensitives(int countOfsensitives) {
        this.countOfsensitives = countOfsensitives;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Design without erros: Yes or No" + " " + isPass);
        System.out.println("Count of sensitive devices and nets" + " " + countOfsensitives);
        System.out.println("Open nets names:" + " " + schematicOpenNets);
        System.out.println("Parasitic nets:" + " " + parasiticNets);
    }
}
