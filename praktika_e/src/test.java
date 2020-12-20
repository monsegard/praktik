import java.util.Scanner;
public class test {
    private String coupon;
    private Double price_all;

    public Double getPrice_all() {
        return price_all;
    }

    public Double setPrice_all(Double price_all) {
        if (price_all <0){
            System.out.println("Общая стоимость не может быть меньше 0");
        }
        else {
            this.price_all = price_all;
        }
        return price_all;
    }


    public String getCoupon() {
        return coupon;
    }

    public String setCoupon(String coupon) {
        this.coupon = coupon;
        return coupon;
    }



    public static void main(String[] args) {
        Double otvet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Есть купон?");
        Boolean Availability_coupon;
        System.out.print("Введите ответ (Да/Нет)=");
        String nabor = scanner.next();
        test ckidka =new test();
        Double p =ckidka.setPrice_all(500.0);
        String s =ckidka.setCoupon("7");
        int i = Integer.parseInt (s);
        switch (nabor) {
            case ("Да"):
                Availability_coupon = true;
                break;
            case ("Нет"):
                Availability_coupon = false;
                break;
            default:
                Availability_coupon = false;
                break;
            //System.out.println("Есть купон?");
        }
        if (Availability_coupon){
            otvet = ((p*i)/100)+p;
            ckidka.setPrice_all(otvet);
            System.out.println(otvet);
        }
        else{
            ckidka.setPrice_all(p);
        }

        System.out.println(Availability_coupon);
    }






/*
        String name = "";
        if (name == "") {
            System.out.println("Нет названия");
        } else {
            System.out.println(name + "жаа");
        }
    }

 */
}