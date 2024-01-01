
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

        int oneMin=8;
        int firstCondition = 20* oneMin;
        System.out.println("За 20 минут машина произвела " +firstCondition+  " штук бутылок" );
        int secondCondition = 24*60*8;
        System.out.println("За сутки машина произвела " +secondCondition+  " штук бутылок" );
        int thirdCondition = 3*24*60*8;
        System.out.println("За 3 дня машина произвела " +thirdCondition+  " штук бутылок" );
        int fourthCondition = 30*24*60*8;
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
        float kg = grams / 1000;


        System.out.println("Количество грамм завтрака составляет "+grams+ " грамм. Количество килограмм = "+kg+ " килограмм." );
//вывод в кг округляется до 1 кг, без ,09 грамм. Не знаю как пофиксить!

        System.out.println("Задача№7");

        int weight = 7 * 1000;
        int diet1 = 250;
        int diet2 = 500;

        int quantityDay1 = weight / diet1;
        int quntityDay2 = weight / diet2;


        System.out.println("Количество дней для похужения при использовании первого рациона = " +quantityDay1+ " Количество дней для похудения при использовании второго рациона = "+quntityDay2 );


        System.out.println("Задача№8");


        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;


        int indexMasha = Masha * 10 / 100;
        int yearQuantityMashaOld = Masha * 12;
        int salaryMasha = Masha + indexMasha;
        int yearQuantityMashaNew = salaryMasha * 12;
        int differenceMasha = yearQuantityMashaNew - yearQuantityMashaOld;


        int indexDenis = Denis * 10 / 100;
        int yearQuantityDenisOld = Denis * 12;
        int salaryDenis = Denis + indexDenis;
        int yearQuantityDenisNew = salaryDenis * 12;
        int differenceDenis = yearQuantityDenisNew - yearQuantityDenisOld;

        int indexKristina = Denis * 10 / 100;
        int yearQuantityKristinaOld = Denis * 12;
        int salaryKristina = Kristina + indexKristina;
        int yearQuantityKristinaNew = salaryKristina * 12;
        int differenceKristina = yearQuantityKristinaNew - yearQuantityKristinaOld;
        System.out.println ("Маша теперь получает " +salaryMasha+ " рублей. Годовой доход вырос на " +differenceMasha+ " рублей " );
        System.out.println ("Денис теперь получает " +salaryDenis+ " рублей. Годовой доход вырос на " +differenceDenis+ " рублей " );
        System.out.println ("Кристина теперь получает " +salaryKristina+ " рублей. Годовой доход вырос на " +differenceKristina+ " рублей " );
    }
}