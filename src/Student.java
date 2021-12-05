public class Student
{
    /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
    public String imie;
    public String nazwisko;
    public int wiek;
    public boolean plec;

    public Student(String p_imie, String p_nazwisko, int p_wiek, boolean p_plec)
    {
        this.imie = p_imie;
        this.nazwisko = p_nazwisko;
        this.wiek = p_wiek;
        this.plec = p_plec;
    }
}
