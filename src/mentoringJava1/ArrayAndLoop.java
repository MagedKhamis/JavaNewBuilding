package mentoringJava1;


public class ArrayAndLoop {

    public void arrayDemo() {


        String[] name = {"Keya", "Bashir", "Asad", "Maged"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        //System.out.println(name[4]);
        System.out.println("-----------");
    }

    public void arrayLoop(){
        int [] idNumber = {104 , 106 , 105 , 108 , 109};
        int idLength = idNumber.length;
        System.out.println(idLength);
        for(int i = 0 ; i<idLength ; i++){
            System.out.println(idNumber[i]);
        }
    }



    public static void main(String[] args) {
        ArrayAndLoop ary = new ArrayAndLoop();
        ary.arrayDemo();
        ary.arrayLoop();

    }


}
