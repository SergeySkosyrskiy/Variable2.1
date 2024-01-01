
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");


        int a = 200;
        System.out.println("Значение переменной a с типом int равно " + a  );
        byte b = -127;
        System.out.println("Значение переменной b с типом byte равно " + b  );
        short c = 300;
        System.out.println("Значение переменной c с типом short равно " + c  );
        long d = 100;
        System.out.println("Значение переменной d с типом long равно " + d  );
        float e = 3.2f;
        System.out.println("Значение переменной e с типом float равно " + e  );
        double f = 1.3;
        System.out.println("Значение переменной f с типом double равно " + f  );

        System.out.println("Задача№2");

        double a1 = 27.12;
        System.out.println("Значение переменной a1 с типом double равно " + a1  );
        long b1 = 987678965549L;
        System.out.println("Значение переменной b1 с типом long равно " + b1  );
        float c1 = 2.786f;
        System.out.println("Значение переменной c1 с типом float равно " + c1  );
        short d1 = 569;
        System.out.println("Значение переменной d1 с типом short равно " + d1  );
        int e1 = -159;
        System.out.println("Значение переменной e1 с типом int равно " + e1  );
        short f1 = 17897;
        System.out.println("Значение переменной f1 с типом short равно " + f1  );
        byte g1 = 67;
        System.out.println("Значение переменной g1 с типом byte равно " + f1  );


        System.out.println("Задача№3");

        int lS = 23;
        int aS = 27;
        int eA = 30;
        int sheets =480;

        int quantitySheets = sheets /(lS+aS+eA);
        System.out.println("На каждого ученика рассчитано " +quantitySheets+ " листов бумаги" );


        System.out.println("Задача№4");

        int oneMin = 16 / 2;
        int firstCondition = 20* oneMin;
        System.out.println("За 20 минут машина произвела " +firstCondition+  " штук бутылок" );
        int secondCondition = 24*60*oneMin;
        System.out.println("За сутки машина произвела " +secondCondition+  " штук бутылок" );
        int thirdCondition = 3*secondCondition;
        System.out.println("За 3 дня машина произвела " +thirdCondition+  " штук бутылок" );
        int fourthCondition = 30*secondCondition;
        System.out.println("За 1 месяц машина произвела " +fourthCondition+  " штук бутылок" );

        System.out.println("Задача№5");


        int paints = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classes = paints / ( whitePaint + brownPaint);
        int whitePaint1 = whitePaint * classes;
        int brownPaint1 = brownPaint * classes;
        System.out.println("В школе, где " +classes+ " классов, нужно " +whitePaint1+ " банок белой краски и " +brownPaint1+  " банок коричневой краски" );


        System.out.println("Задача№6");

        short bananas = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;

        int grams = bananas * 5 + milk * 2 + iceCream * 2 + egg * 4;
        float kg = grams / 1000F;


        System.out.println("Количество грамм завтрака составляет "+grams+ " грамм. Количество килограмм = "+kg+ " килограмм." );


        System.out.println("Задача№7");

        int weight = 7 * 1000;
        int diet1 = 250;
        int diet2 = 500;

        int quantityDay1 = weight / diet1;
        int quntityDay2 = weight / diet2;
        int quantityMidle = (quantityDay1 + quntityDay2) / 2;

        System.out.println("Количество дней для похужения при использовании первого рациона = " +quantityDay1+ ". Количество дней для похудения при использовании второго рациона = "+quntityDay2+ ". Среднее количество дней для похудения составляет = "+quantityMidle );


        System.out.println("Задача№8");


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float ratio = 10 / 100F;
        int year = 12;

        float indexMasha = masha * ratio;
        int yearQuantityMashaOld = masha * year;
        float salaryMasha = masha + indexMasha;
        float yearQuantityMashaNew = salaryMasha * year;
        float differenceMasha = yearQuantityMashaNew - yearQuantityMashaOld;


        float indexDenis = denis * ratio;
        int yearQuantityDenisOld = denis * year;
        float salaryDenis = denis + indexDenis;
        float yearQuantityDenisNew = salaryDenis * year;
        float differenceDenis = yearQuantityDenisNew - yearQuantityDenisOld;

        float indexKristina = kristina * ratio;
        int yearQuantityKristinaOld = kristina * year;
        float salaryKristina = kristina + indexKristina;
        float yearQuantityKristinaNew = salaryKristina * year;
        float differenceKristina = yearQuantityKristinaNew - yearQuantityKristinaOld;
        System.out.println ("Маша теперь получает " +salaryMasha+ " рублей. Годовой доход вырос на " +differenceMasha+ " рублей " );
        System.out.println ("Денис теперь получает " +salaryDenis+ " рублей. Годовой доход вырос на " +differenceDenis+ " рублей " );
        System.out.println ("Кристина теперь получает " +salaryKristina+ " рублей. Годовой доход вырос на " +differenceKristina+ " рублей  " );
    }
}
