import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1){
            hello();
        }else if (a==0){
            bye();
        }

        }static void hello(){
        System.out.println("Салам");

    }static void bye(){
        System.out.println("Жакшы барыныз");*/

       /* int[] arr = {2, 4, 3, 5};
        arrMeth(arr);


    }

    static int[] arrMeth(int[] ass) {
        for (int i = 0; i < ass.length; i++) {
            System.out.println(ass[i]);
        }
            return ass;*/
     /*   Scanner sc=new Scanner(System.in);

        hello(sc.nextLine());


    }

    static void hello(String a) {



        System.out.println("My name is "+a);
        return;*/

       /* Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a==1) {
            meth();


        }if (a==2){
            method();
        }


        }static void meth(){
        System.out.println("Мой возраст-14");

    }static void method(){
        System.out.println("Мое место рождение - Кочкор Ата");*/
     /*   System.out.println("Сколько тебе лет");
        meth();
        method();


    }static void meth(){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Мой возраст-"+a);
    }static void method(){
        String st=new String();
        String
        System.out.println("Мое место-рождение-"+b);*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию 1-сложение,2-вычитание,3-умножение,4-деление");
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        double num1= scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        double result = performOperation(num1, operation, num2);
        if (result != Double.MAX_VALUE) {
            System.out.println("Результат " + result);
        }
        scanner.close();

    }

    public static double performOperation(double num1, int operatoin, double num2) {
        double result = 0;
        switch (operatoin) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;

                }
        }
        return result;*/


        int[]array={5,4,3,2,1};
        System.out.println(Arrays.toString(printArray(array)));

    }public static int[] printArray(int[] arr){
        Arrays.sort(arr);
        return (arr);
        }

    }

