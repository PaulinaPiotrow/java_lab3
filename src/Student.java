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

    public Osoba getOsoba()
    {
        return osoba;
    }

    public void setOsoba(Osoba osoba)
    {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzial()
    {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial)
    {
        this.wydzial = wydzial;
    }

    public String toString()
    {
        return "Student " + osoba.getImie() + " " + osoba.getNazwisko() + " Wydział " + wydzial;
    }
}

