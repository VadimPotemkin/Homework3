public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte cat = 1;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short dog = 200;
        System.out.println("Значение переменной dog с типом short равно " + dog);
        int monkey = 33000;
        System.out.println("Значение переменной monkey с типом int равно " + monkey);
        long year = 56575849330L;
        System.out.println("Значение переменной year с типом long равно " + year);
        float sugar = 5.56788F;
        System.out.println("Значение переменной sugar с типом float равно " + sugar);
        double GPS = 3.234585930299;
        System.out.println("Значение переменной GPS с типом double равно " + GPS);

        // Задача 2
        System.out.println("Задача 2");
        float variable1 = 27.12F;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        short variable5 = 569;
        int variable6 = -159;
        char variable7 = 27897;
        byte variable8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        short TeacherslearnerLP = 23;
        short TeacherslearnerAS = 27;
        short TeacherslearnerEA = 30;
        int CommonLearner = TeacherslearnerLP + TeacherslearnerEA + TeacherslearnerAS;
        short CommonPapers = 480;
        int PapersForLearner = CommonPapers / CommonLearner;
        System.out.println("На каждого ученика рассчитано " + PapersForLearner + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte power = 16 / 2;
        short minutesInDay = 60 * 24;
        byte information1 = 20;
        int information2 = minutesInDay;
        int information3 = minutesInDay * 3;
        int information4 = minutesInDay *31;
        int power20Minutes = information1 * power;
        System.out.println("За 20 минут машина произвела бутылок " + power20Minutes + " штук");
        int powerOneDay = information2 * power;
        System.out.println("За 1 сутки машина произвела бутылок " + powerOneDay + " штук");
        int powerThreeDay = information3 * power;
        System.out.println("За 3 суток машина произвела бутылок " + powerThreeDay + " штук");
        int powermonth = information4 * power;
        System.out.println("За 1 месяц машина произвела бутылок " + powermonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        byte Total = 120;
        byte whiteInClassRoom = 2;
        byte brownInClassRoom = 4;
        int classRoom = Total / (whiteInClassRoom + brownInClassRoom);
        int commonWhiteInClassRoom = whiteInClassRoom * classRoom;
        int commonbrownInClassRoom = brownInClassRoom * classRoom;
        System.out.println("В школе, где " + classRoom + " классов, нужно " + commonWhiteInClassRoom + " банок белой краски и " + commonbrownInClassRoom + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        byte colvoBanane = 5;
        byte weightOneBanane = 80;
        int weightTotalBanane = colvoBanane * weightOneBanane;
        byte weightMilk = 105;
        byte colvoMilk = 2;
        int weightTotalMilk = weightMilk * colvoMilk;
        byte weightIceCream = 100;
        byte colvoIceCream = 2;
        int weightTotalIceCream = weightIceCream * colvoIceCream;
        byte weightEgg = 70;
        byte colvoEgg = 4;
        int weightTotalEgg = weightEgg * colvoEgg;
        float weightTotal = weightTotalBanane + weightTotalMilk + weightTotalIceCream + weightTotalEgg;
        System.out.println(weightTotal / 1000);

        // Задача 7
        System.out.println("Задача 7");
        byte purpose = 7;
        int purposeInGramm = purpose * 1000;
        int purpose1 = 250;
        int purpose2 = 500;
        int purposeNumber1Day = purposeInGramm / purpose1;
        int purposeNumber2Day = purposeInGramm / purpose2;
        System.out.println(purposeNumber1Day + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и " + purposeNumber2Day + " дней, если каждый день будет худеть на 500 грамм.");

        // Задача 8
        System.out.println("Задача 8");
        int PayMashabefore = 67760;
        int PayDenisbefore = 83690;
        int PayKristinabefore = 76230;
        int PayMashaafter = (int) (PayMashabefore * 1.1);
        int PayDenisafter = (int) (PayDenisbefore * 1.1);
        int PayKristinaafter = (int) (PayKristinabefore * 1.1);
        int differenceMasha = PayMashaafter % PayMashabefore;
        int differenceDenis = PayDenisafter % PayDenisbefore;
        int differenceKris = PayKristinaafter % PayKristinabefore;

        System.out.println("Маша теперь получает " + PayMashaafter + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + PayDenisafter + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + PayKristinaafter + " рублей. Годовой доход вырос на " + differenceKris + " рублей");










    }
}