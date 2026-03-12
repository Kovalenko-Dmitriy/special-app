//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          System.out.println("Привет, мир");
        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1; // minimum возраст
        int middle = -1; // average возраст
        int max = -1; // maximum возраст

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge >= mishaAge) {
                max = katyaAge;
                middle = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        }

        if (katyaAge <= mishaAge && katyaAge <= vasyaAge) {
            min = katyaAge;
            if (vasyaAge >= mishaAge) {
                max = vasyaAge;
                middle = mishaAge;
            } else {
                middle = vasyaAge;
                max = mishaAge;
            }
        }

        if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
            min = mishaAge;
            if (katyaAge >= vasyaAge) {
                max = katyaAge;
                middle = vasyaAge;
            } else {
                middle = katyaAge;
                max = vasyaAge;
            }
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);


    }
}
