public class Main {
    public static void main(String[] args) {
        //Задача 1
        int milk=5000;
        System.out.println("int milk="+milk+"ml");
        byte pointStraight=-127;
        System.out.println("byte pointStraight="+pointStraight);
        short length=100;
        System.out.println("short length="+length+"sm");
        long number=1500L;
        System.out.println("long number="+number+"L");
        float cheeseWeight1=3;
        float cheeseWeight2=4;
        float cheeseWeight=cheeseWeight1/cheeseWeight2;
        System.out.println("float cheeseWeight="+cheeseWeight+"f kg");
        double X=5.8884591246;
        System.out.println("double X="+X);

        //Задача 2
        float A=27.12f;
        System.out.println("float A="+A+"f");
        long B=987678965549L;
        System.out.println("long B="+B+"L");
        double C=2.786;
        System.out.println("double C="+C);
        int D=569;
        System.out.println("int D="+D);
        short E=-159;
        System.out.println("short E="+E);
        int F=27897;
        System.out.println("int F="+F);
        byte G=67;
        System.out.println("byte G="+G);
        //Задача 3 Количество листов на учеников
        byte childrenLP=23;
        byte childrenAS=27;
        byte childrenEA=30;
        int totalSheets=480;
        int SheetsForOneStudent=totalSheets/(childrenLP+childrenAS+childrenEA);
        System.out.println("На каждого ученика рассчитано="+SheetsForOneStudent+"листов бумаги");
        //Задача 4 Производительность бутылок
        short productivityPerMinute=8;
        int productivityIn20Minutes=productivityPerMinute*20;
        System.out.println("За 20 минут машина произвела="+productivityIn20Minutes+"штук бутылок");
        int productivityIn1440Minutes=productivityPerMinute*1440;
        System.out.println("За сутки машина произвела="+productivityIn1440Minutes+"штук бутылок");
        int productivityIn4320Minutes=productivityPerMinute*4320;
        System.out.println("За 3 дня машина произвела="+productivityIn4320Minutes+"штук бутылок");
        int productivityIn43200Minutes=productivityPerMinute*43200;
        System.out.println("За месяц машина произвела="+productivityIn43200Minutes+"штук бутылок");

        //Задача 5 Краски на ремонт школы
        byte needCanOfPaint= 120;
        byte forOneClassroom=6;
        byte numberOfClassrooms=20;
        int numberOfWhitePaintsForOneClassroom=numberOfClassrooms*2;
        int numberOfBrownPaintsForOneClassroom=numberOfClassrooms*4;
        System.out.println("В школе,где= " + numberOfClassrooms+" классов,нужно " + numberOfWhitePaintsForOneClassroom + " банок белой краски "+numberOfBrownPaintsForOneClassroom+ " банок коричневой краски");
        //Задача 6 Завтрак спортсменов
        int bananas=5*80;
        System.out.println("бананов "+bananas+"gr");
        int milkInGr=105*2;
        System.out.println("молока "+milkInGr+"gr");
        int plombir=2*100;
        System.out.println("пломбира "+plombir+"gr");
        int eggs= 4*70;
        System.out.println("яиц "+eggs+"gr");
        float breakfastWeight=bananas+milkInGr+plombir+eggs;
        float breakfastWeightInKg=breakfastWeight/1000;
        System.out.println("Вес завтрака спортсмена="+breakfastWeight+"gr,"+breakfastWeightInKg+"kg");
        //Задача 7 Похудение спортсменов
        int totalWeightLoss=7000;
        int WeightLoss1=totalWeightLoss/250;
        System.out.println("Спортсмену понадобится "+WeightLoss1+" дней,чтобы похудеть на 7 кг,теряя в сутки по 250 гр ");
        int WeightLoss2=totalWeightLoss/500;
        System.out.println("Спортсмену понадобится "+WeightLoss2+" дней,чтобы похудеть на 7 кг,теряя в сутки по 500 гр ");
        double  averageWeight=750/2;
        System.out.println(averageWeight+" гр-средний вес похудения в сутки");
        double  WeightLoss3=totalWeightLoss/averageWeight;
        System.out.println(WeightLoss3+" =19 дней в среднем понадобиться для результата похудения");

        //Задача 8 Расчет ЗП сотрудников в компании
        int salaryM=67760;
        int salaryD=83690;
        int salaryK=76230;
        double percentageIncrease=0.1;
        double increasedSalaryM=(salaryM*percentageIncrease)+salaryM;
        double oldAnnualIncomeM=salaryM*12;
        double newAnnualIncomeM=increasedSalaryM*12;
        double differenceM=newAnnualIncomeM-oldAnnualIncomeM;
        System.out.println("Заработная плата Маши с учетом увеличения на 10%= "+increasedSalaryM+ " руб, годовой доход вырос на "+differenceM+"руб");
        double increasedSalaryD=(salaryD*percentageIncrease)+salaryD;
        double oldAnnualIncomeD=salaryD*12;
        double newAnnualIncomeD=increasedSalaryD*12;
        double differenceD=newAnnualIncomeD-oldAnnualIncomeD;
        System.out.println("Заработная плата Дениса с учетом увеличения на 10%= "+increasedSalaryD+ " руб, годовой доход вырос на "+differenceD+"руб");
        double increasedSalaryK=(salaryK*percentageIncrease)+salaryK;
        double oldAnnualIncomeK=salaryK*12;
        double newAnnualIncomeK=increasedSalaryK*12;
        double differenceK=newAnnualIncomeK-oldAnnualIncomeK;
        System.out.println("Заработная плата Кристины с учетом увеличения на 10%= "+increasedSalaryK+ " руб, годовой доход вырос на "+differenceK+"руб");














    }
}
