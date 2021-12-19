public class Student
{
    private Osoba osoba;
    private WydzialEnum wydzial;

    public Student()
    {

    }

    public Student (String imie, String nazwisko, int index_nr, WydzialEnum wydzial)
    {
        this.osoba = new Osoba(imie, nazwisko, index_nr);
        this.wydzial = wydzial;
    }

}

