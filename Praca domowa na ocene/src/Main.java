import java.util.Scanner;
class Osoba{
    private String name;
    private String surname;
    private int age;
    public Osoba(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }

}
public class Main {
    public static void Program(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj imię: ");
            String name = sc.nextLine();
            System.out.println("Podaj nazwisko: ");
            String surname = sc.nextLine();
            System.out.println("Podaj wiek: ");
            int age = sc.nextInt();
            sc.close();
            Osoba P1 = new Osoba(name, surname, age);
            System.out.println("Imie: "+P1.getName());
            System.out.println("Nazwisko: "+P1.getSurname());
            System.out.println("Wiek: "+P1.getAge());
        }
        catch(Exception e){
            System.out.println("Podany wiek nie jest liczbą!");
            Program();
        }
    }
    public static void main(String[] args) {
        Program();
    }
}