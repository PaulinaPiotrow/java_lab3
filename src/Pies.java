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
     public String getKolor()
     {
          return kolor;
     }
     public void setKolor(String kolor)
     {
          this.kolor = kolor;
     }
     public boolean get_czySzczepiony()
     {
          return czySczepiony;
     }
     public void set_czySzczepiony(boolean czySczepiony)
     {
          this.czySczepiony = czySczepiony;
     }

     @Override
     public String toString()
     {
          return super.toString() + ", kolor " + kolor + ", czy szczepiony " + czySczepiony;
     }

}
