public class Osoba
{
    private String imie;
    private String nazwisko;
    private int index;

    public Osoba(String imie, String nazwisko, int index_nr)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public String getImie()
    {
        return imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public int getIndex()
    {
        return index;
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public void setIndex(int index)
    {
        this.index = index;
    }
    public String toString()
    {
        return imie + nazwisko + index;
    }
}
