package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carBrand = "VW";
        car1.regNumber = 1853556;
        car1.engineVol = (float) 1.6;

        Car car2 = new Car();
        car2.carBrand = "Ford";
        car2.regNumber = 3645618;
        car2.engineVol = (float) 1.8;

        Car car3 = new Car();
        car3.carBrand = "Opel";
        car3.regNumber = 75681787;
        car3.engineVol = (float) 1.4;

        Country country1 = new Country();
        country1.birthPlace = "Odesa";
        country1.citizenship = "Bulgarian";
        country1.name = "Hristo Grozev";

        Country country2 = new Country();
        country2.birthPlace = "New-York";
        country2.citizenship = "Canadian";
        country2.name = "J.Trudo";

        Country country3 = new Country();
        country3.birthPlace = "Amsterdam";
        country3.citizenship = "Hollander";
        country3.name = "Klarens Zeedorf";

        IDCard card1 = new IDCard();
        card1.idNumber = 65678913;
        card1.name = "Elon Musk";
        card1.gender = "Male";

        IDCard card2 = new IDCard();
        card2.idNumber = 46656645;
        card2.name = "J. Bezos";
        card2.gender = "Male";

        IDCard card3 = new IDCard();
        card3.idNumber = 456758697;
        card3.name = "Oprah Winfrye";
        card3.gender = "Male";

        car1.printIdInfo();
        car2.printIdInfo();
        car3.printIdInfo();

        card1.printIdInfo();
        card2.printIdInfo();
        card3.printIdInfo();

        country1.printIdInfo();
        country2.printIdInfo();
        country3.printIdInfo();

        MyObject myFirstObject = new MyObject();
        myFirstObject.number = 10;
        myFirstObject.text = "text1";

        MyObject mySecondObject = new MyObject();
        mySecondObject.number = 20;
        mySecondObject.text = "text2";

        System.out.println("myFirstObject: number=" + myFirstObject.number + ", text=" + myFirstObject.text);
        System.out.println("mySecondObject: number=" + mySecondObject.number + ", text=" + mySecondObject.text);

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
                + mySecondObject.STATIC_NUMBER + ","
                + MyObject.STATIC_NUMBER);

        MyObject.STATIC_NUMBER = MyObject.STATIC_NUMBER + 1;

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
                + mySecondObject.STATIC_NUMBER + ","
                + MyObject.STATIC_NUMBER);
    }
}
