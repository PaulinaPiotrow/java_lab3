import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] students = new Student[3];
        Student Paulina = new Student("Paulina", "Piotrowska", 26, true);
        Student Bernard = new Student("Bernard", "Piotrowski", 30, false);
        Student Marika = new Student("Marika", "Kantor", 19, true);

        students[0] = Paulina;
        students[1] = Bernard;
        students[2] = Marika;


        for(Student a : students)
        {
            String plec;

            if(a.plec ==true)
            {
                plec = "żeńskiej";
            }
            else
            {
                plec = "męskiej";
            }

            String wiadomosc = a.imie + " " + a.nazwisko + " jest studentem w wieku " + a.wiek + " lat, o płci " + plec;
            System.out.println(wiadomosc);
        }



    }
}
