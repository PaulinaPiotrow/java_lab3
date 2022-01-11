public class Sznaucer extends Pies
{
    public String getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(String wielkosc) {
        this.wielkosc = wielkosc;
    }

    protected String wielkosc;

    public Sznaucer()
    {
        super();
        this.wielkosc = "nieznane";
    }
    public Sznaucer(String wielkosc)
    {
        super();
        this.wielkosc = wielkosc;
    }

    public Sznaucer(String kolor, boolean czySczepiony, String wielkosc)
    {
        super(kolor, czySczepiony);
        this.wielkosc = wielkosc;
    }

    public Sznaucer(String imie, int wiek, String kolor, boolean czySczepiony, String wielkosc)
    {
        super(imie, wiek, kolor, czySczepiony);
        this.wielkosc = wielkosc;
    }

    @Override
    public String toString()
    {
        return super.toString() + "wielkość " + wielkosc;
    }
}
