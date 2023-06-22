public class Main {
    public static void main(String[] args) {

    byte a = 100;
    System.out.println (" Значение переменной a с типом byte равно " + a);
    short b = 10000;
    System.out.println (" Значение переменной b с типом short равно " + b);
    int c = 1000000;
    System.out.println (" Значение переменной с с типом int  равно " + c);
    long d = 1000000000;
    System.out.println (" Значение переменной d с типом long равно " + d);
    float e = 1.5F;
    System.out.println (" Значение переменной e с типом float равно " + e);
    double f  = 1.75;
    System.out.println (" Значение переменной f с типом double равно " + f);

    float one = 27.12F;
    long two = 987678965549L;
    double three = 2.786;
    short four = 569;
    short five = -159;
    short six = 27897;
    byte seven = 67;

    byte LP = 23;
    byte AS = 27;
    byte EA = 30;
    short total = 480;
    byte totalStudents = (byte) (LP + AS + EA);
    byte paper = (byte) ( total /  totalStudents);
    System.out.println (" На каждого ученика рассчитано " + paper + " листов бумаги");

    byte productivityIn2Min = 16;
    short productivityIn20Min = (short) (productivityIn2Min * 10);
    System.out.println (" За 20 минут машина произвела " +  productivityIn20Min + " штук бутылок");
    short productivityDay = (short) (productivityIn2Min * 720);
    System.out.println (" За 24 часа машина произвела " +  productivityDay + " штук бутылок");
    int productivityIN3Days = (productivityIn2Min * 2160);
    System.out.println (" За 3 дня машина произвела " +  productivityIN3Days + " штук бутылок");
    int productivityMonth = (productivityIn2Min * 21600);
    System.out.println (" За месяц машина произвела " +  productivityMonth + " штук бутылок");

    byte school = 120;
    byte whitePaint = 2;
    byte brownPaint = 4;
    byte totalPaintOneClass = (byte) (whitePaint + brownPaint);
    byte totalClasses = (byte) ( school /  totalPaintOneClass);
    byte totalWhitePaint = (byte) ( totalClasses * whitePaint);
    byte totalBrownPaint = (byte) ( totalClasses * brownPaint);
    System.out.println (" В школе, где " +  totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint +" банок коричневой краски" );


    byte bananas = 5;
    short milk = 200;
    byte milk100 = 105;
    byte iceCream = 2;
    byte eggs = 4;
    short weightBananas = (short) (bananas* 80);
    short weightMilk = (short) (milk100 * 2);
    short weightIceCream = (short) (iceCream * 100);
    short weightEggs = (short) (eggs * 70);
    short weightGm = (short) (weightBananas + weightMilk + weightIceCream + weightEggs);
    int kg = 1000;
    float weightInKg = weightGm / (float) kg;
    System.out.println (" Вес в граммах  " +  weightGm + " а в килограммах " + weightInKg);

    byte weightKg = 7;
    int kg1 = 1000;
    short gr250 = 250;
    short gr500 = 500;
    byte lose250 = (byte) ((weightKg * kg1) / gr250);
    byte lose500 = (byte) (( weightKg * kg1) / gr500);
    float meanDays =  ((weightKg * kg1) / ((gr250 + gr500) / 2f));
    System.out.println (" При похудении на 250 грамм в сутки, спортсмен похудеет за " +  lose250 + " дней, на 500 грамм за " + lose500 +" дней, а при среднем значении за " + meanDays + " дней");


    int Masha = 67760;
    int Denis = 83690;
    int Kristina = 76230;
    short masha10 = (short) (Masha / 10);
    short denis10 = (short) (Denis / 10);
    short kristina10 = (short) (Kristina / 10);
    int masha10per = Masha + masha10;
    int denis10per = Denis + denis10;
    int kristina10per = Kristina + kristina10;
    int mashaYear = Masha * 12;
    int denisYear = Denis * 12;
    int kristinaYear = Kristina * 12;
    int masha10Year = masha10per * 12;
    int denis10Year = denis10per * 12;
    int kristina10Year = kristina10per * 12;
    int differenceYearMasha = masha10Year - mashaYear;
    int differenceYearDenis = denis10Year - denisYear;
    int differenceYearKristina = kristina10Year - kristinaYear;
    System.out.println (" Маша теперь получает " +  masha10per + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей ");
    System.out.println (" Денис теперь получает " +  denis10per + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей ");
    System.out.println (" Кристина теперь получает " +  kristina10per + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей ");


    }
}