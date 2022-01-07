public class Pies extends Zwierzeta
{
     protected String kolor;
     protected boolean czySczepiony;

     public Pies()
     {
          super();
          this.kolor = "";
          this.czySczepiony = true;
     }
     public Pies(String kolor, boolean czySczepiony)
     {
          this.kolor = kolor;
          this.czySczepiony = true;
     }
     public Pies(String imie, int wiek, String kolor, boolean czySczepiony)
     {
          super(imie, wiek);
          this.kolor = kolor;
          this.czySczepiony = true;

     }
     public String setKolor()
     {
          return kolor;
     }
     public void getKolor(String kolor)
     {
          this.kolor = kolor;
     }
     public boolean setczySzczepiony()
     {
          return czySczepiony;
     }
     public void getczySzczepiony()
     {
          this.czySczepiony = czySczepiony;
     }
     @Override
     public String toString()
     {
          return "Pies " + super.toString() + " kolor: " + kolor + " czy Szczepiony " + czySczepiony;
     }


}
