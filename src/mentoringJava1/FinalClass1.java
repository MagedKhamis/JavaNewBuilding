package mentoringJava1;

public  class FinalClass1 {

    String studentName;
    int id ;
    final String schoolName = "UTS";

     public final void subjects (){
        System.out.println("We all study IT");

    }

    public static void main(String[] args) {
        FinalClass1 fnl = new FinalClass1();
        fnl.studentName = "Shefali";
        fnl.id = 1003;
        System.out.println(fnl.studentName + " "+ fnl.id +" "+ fnl.schoolName);
        fnl.subjects();

        FinalClass1 fnl1 = new FinalClass1();
        fnl1.studentName = "Leo";
        fnl1.id = 1004;
        System.out.println(fnl1.studentName + " "+ fnl1.id+ " "+ fnl1.schoolName);
        fnl1.subjects();

    }
}
