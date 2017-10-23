package action;

public class HelloAction {
    private String name;
    public String excute() throws Exception{
        return "sucess";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
