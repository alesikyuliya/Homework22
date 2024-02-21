import Models.Androids;
import Models.IPhones;
import Service.Smartphones;

public class Program {
    public static void main(String[] args) {
        Androids xiaomi = new Androids("Xiaomi 9", 2020);
        IPhones iphone15 = new IPhones("IPhone 15", 2023);
        Smartphones sony = new Androids("Sony Experia", 2017);
        Smartphones iphone8 = new IPhones("IPhone 8", 2018);

        showObjectsMethods(xiaomi);
        System.out.println();
        showObjectsMethods(iphone15);
        System.out.println();
        showObjectsMethods(sony);
        System.out.println();
        showObjectsMethods(iphone8);
    }

    private static void showObjectsMethods(Smartphones smartphones){
        smartphones.call();
        smartphones.sms();
        smartphones.internet();
        smartphones.loads();
    }
}
