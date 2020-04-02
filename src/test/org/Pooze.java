package test.org;

public class Pooze {
    public static void main(String[] args) {


        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("o"));





        Cat murka=new Cat();
        murka.name="Murka";
        murka.age=15;
        murka.nose="black";

        Cat leo=new Cat();
        leo.name="Leo";
        leo.age= 7;
        leo.nose="rose";

        Cat[] catHouse = new Cat[2];
        catHouse[0]=murka;
        catHouse[1]=leo;


        catHouse[0].sayHello();
        catHouse[0].tellName();
        catHouse[0].tellAge();
        catHouse[0].tellColorNose();
        catHouse[1].sayHello();
        catHouse[1].tellName();
        catHouse[1].tellAge();
        catHouse[1].tellColorNose();

        System.out.println("There are " +catHouse.length+ " cats");

    }
}
