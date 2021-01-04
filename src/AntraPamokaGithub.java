import java.util.ArrayList;
import java.util.Arrays;


public class AntraPamokaGithub
{
    private int x = 50;
    static int isorinioBlockoSkaicius = 57;
    static String[] galimosLytys = {"vyras", "moteris"};

    public void priskirtiLyti(int x)
    {
        this.x = x;
    }

    public static void main(String[] args)
    {
     //   isorinioBlockoSkaicius = 27;
     //   metodoSkaicius = 7;

     //   z = 14;

        int z;
        int x = 5;
        int y = 7;
        System.out.println(x + y);

        AntraPamokaGithub testinisObjektas = new AntraPamokaGithub();
        System.out.println(AntraPamokaGithub.galimosLytys[0]);
   //     System.out.println(Math.random());
        System.out.println(isorinioBlockoSkaicius);
     //   testinisObjektas.priskirtiLyti(100);
        testinisObjektas.x = 200;
        System.out.println("OBJEKTO KINTAMASIS: " + testinisObjektas.x);

      //  int, double, float, boolean, String,
        int[] tempSkaiciai = {1, 2, 3};

        int[] skaiciai;             // skaiciai masyvas
        int skaiciaiDydis = 0;          // skaiciai masyvas dabartinis dydis
        int skaiciaiMaksimalusDydis = 10;
        skaiciai = new int[20];



        for (int i = 0; i < skaiciaiMaksimalusDydis; i++)
        {
            skaiciai[i] = i;
            skaiciaiDydis++;
            if (skaiciai[i] > 0)
            {
                System.out.println(skaiciaiDydis);
            }
        }

        for (int i = 0; i < skaiciaiDydis; i++)
        {
            System.out.println(i + 1 + "-as masyvo elementas yra: " + skaiciai[i]);
        }

        for (skaiciaiDydis = 0; skaiciaiDydis < skaiciaiMaksimalusDydis; skaiciaiDydis++)
        {
            skaiciai[skaiciaiDydis] = skaiciaiDydis * 2;
        }

        for (int i = 0; i < skaiciaiDydis; i++)
        {
            System.out.println(i + 1 + "-as masyvo PADAUGINTAS elementas yra: " + skaiciai[i]);
        }


       /* for (kintamojoTipas kintamojoVardas: masyvoKintamasis)
        {
            // kazka daryti
        }*/

      //  int index = 0;
        for (int skaicius: skaiciai)
        {
         //   if (skaicius != 0)
            skaicius += 5;
          //  skaiciai[index] += 5;
          //  index++;
            System.out.println("is for each ciklo: " + skaicius);
        }

        for (int skaicius: skaiciai)
        {
            System.out.println("is for each ANTRO ciklo: " + skaicius);
        }

        ArrayList<String> zodziuSarasas;
        zodziuSarasas = new ArrayList<String>();


        zodziuSarasas.add("pirmas");
        zodziuSarasas.add("antras");

        for (int i = 0; i < zodziuSarasas.size(); i++)
        {
            System.out.println(zodziuSarasas.get(i));
        }

        for (String zodis: zodziuSarasas)
        {
            System.out.println("arraylist foreach: " + zodis);
        }

        double[] skaiciaiMetodui = {1, 0.25, 7.7777, 6.25, 197};
        int skaiciuiMetoduiDydis = 5;
        System.out.println("MASYVO SUMA: " + suma(skaiciaiMetodui, skaiciuiMetoduiDydis));
        System.out.println(skaiciuiMetoduiDydis);

        double[] skaiciaiMetoduiKopija = Arrays.copyOf(skaiciaiMetodui, skaiciuiMetoduiDydis);

        nunulintiMasyva(skaiciaiMetodui, skaiciuiMetoduiDydis);


        for (int i = 0; i < skaiciuiMetoduiDydis; i++)
        {
            System.out.println(skaiciaiMetodui[i]);
        }

        double koordinate1 = -8.23;
        double koordinate2 = -12.27;
        double[] koordinates = new double[2];
        double[] koordinaciuKopija = new double[2];
    //    System.out.println(Arrays.toString(koordinaciuPakeitimasITeigiamas(koordinate1, koordinate2)));

        koordinates = koordinaciuPakeitimasITeigiamas(koordinate1, koordinate2);

        koordinaciuKopija = koordinates;

        koordinate1 = koordinates[0];
        koordinate2 = koordinates[1];

        System.out.println("Isvedamos koordinates: " + koordinate1 + "    " + koordinate2);
        System.out.println("MASYVO ISVEDIMAS: " + Arrays.toString(koordinaciuKopija));
        skaiciaiMetoduiKopija[2] = 37.55;
        System.out.println("MASYVO NAAAAAUJO ISVEDIMAS: " + Arrays.toString(skaiciaiMetoduiKopija));
    }


    public static double suma(double[] masyvas, int masyvoDydis)
    {
        double suma = 0;
        for (int i = 0; i < masyvoDydis; i++)
        {
            suma += masyvas[i];
        }
     //   masyvoDydis = 40;                 // neveiks, nes kintamasis paduodamas kaip value (reiksme), o ne reference (adresas)
        return suma;
    }


    public static void nunulintiMasyva(double[] masyvas, int masyvoDydis)
    {
        for (int i = 0; i < masyvoDydis; i++)
        {
            masyvas[i] = 0;
        }
    }


    public static double[] koordinaciuPakeitimasITeigiamas(double koord1, double koord2)
    {
    //    koord1 = Math.abs(koord1);
    //    koord2 = Math.abs(koord2);
        double[] koordMasyvas = new double[2];
        koordMasyvas[0] = Math.abs(koord1);
        koordMasyvas[1] = Math.abs(koord2);
    //    System.out.println("Isvedamos koordinates: " + koord1 + "    " + koord2);
        return koordMasyvas;
    }
    
    public static void isvestiMasyva()
    {
        int metodoSkaicius = 5;
        isorinioBlockoSkaicius = 300;
    }
}
