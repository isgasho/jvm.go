package instructions;

public class LookupSwitch {
    
    public static void main(String[] args) {
        switch (100) {
            case -100: System.out.println("-100"); break;
            case 0: System.out.println("0"); break;
            case 100: System.out.println("100"); break;
            default: System.out.println("default");
        }
    }
    
}