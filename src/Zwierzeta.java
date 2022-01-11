public class Zwierzeta
{
    protected String imie;
    protected int wiek;
    private boolean czyDomowy;

    public Zwierzeta()
    {
        this.imie = "";
        this.wiek = 0;
        this.czyDomowy = true;
    }

    @Override
    public String toString() {
        return "Zwierzeta " +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", czyDomowy=" + czyDomowy;
    }

    public Zwierzeta(String imie, int wiek, boolean czyDomowy)
    {
        this.imie = imie;
        this. wiek = wiek;
        this.czyDomowy = true;
    }

    public Zwierzeta(String imie, int wiek) {
    }

    protected int rokUrodzenia()
    {
        return 2022 - this.wiek;
    }

    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek)
    {
        this.wiek = wiek;
    }

    public boolean getczyDomowy() {
        return czyDomowy;
    }

    public void setCzyDomowy(boolean czyDomowy) {
        this.czyDomowy = czyDomowy;
    }

}
