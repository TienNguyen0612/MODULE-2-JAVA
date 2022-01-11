package baitap.Validate_Class_Name;

public class Test {
    public static final String[] validName = new String[] {"C1021H", "P0921G", "A0520I", "C0202K","P1221M"};
    public static final String[] invalidName = new String[] {"G0202H", "A0303T", "C020H", "C20202020H", "C3030Q"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String name : validName) {
            boolean isValid = classNameExample.validate(name);
            System.out.println(name + " is valid: " + isValid);
        }

        for (String name : invalidName) {
            boolean isValid = classNameExample.validate(name);
            System.out.println(name + " is valid: " + isValid);
        }
    }
}
