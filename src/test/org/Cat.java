package test.org;

class Cat {
     int age;
     String nose;
     String name;

     void tellName(){
        String s ="I am "+ name;
        System.out.println(s);
    }
     void tellColorNose(){
        if (nose == "red") {
            System.out.println("karabuznost");
        }else{
            String result="I have " + nose;
            result.concat(" nose");
            System.out.println(result);
        }
    }
     void tellAge(){
        String g = "I am " +age+ " years old";
        System.out.println(g);
    }

    void sayHello() {
        String g ="Hello, Pooze!";
        System.out.println(g.toUpperCase());
    }
}
