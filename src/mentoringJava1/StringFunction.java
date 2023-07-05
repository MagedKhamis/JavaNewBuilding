package mentoringJava1;

public class StringFunction {

    public static void stLength(){
        String name = "Majed Farid";
        String subjects = "Java-Selenium";
        System.out.println("my 1st strung length is " +name.length());
        int subjectsLength = subjects.length();
        System.out.println("The 2nd string lenght is "+ subjectsLength);

    }

    public void splitSt(){
        String email = "maged@gmail.com";
        String [] newEmail = email.split("@");
        System.out.println("the 1st string part = "+ newEmail[0] + newEmail[0].length());
        System.out.println("the 2nd string part = "+ newEmail[1] + newEmail[1].length());


    }

    public void replaceSt(){
        String email = "maged@gmail.com";
        String newEmail = email.replace("maged" , "Keya");
        System.out.println(newEmail);


    }

    public void subStringAndContains(){
        String title = "Bashir is my instructor";
        String newTitle = title.substring(0 , 6);
        System.out.println(newTitle);

        if(newTitle.contains("Bashir")){
            System.out.println("Bashir is included");
        } else{
            System.out.println("false statement");
        }

    }


    public void equalIgnoreCase(){ //if else st
        String name = "Majed";
        if (name.equalsIgnoreCase("mAJED")){
            System.out.println("valid condition");
        } else{
            System.out.println("incorrect statement");
        }

    }

    public void StringBuffer(){
        StringBuffer sb = new StringBuffer("Shefali");
        System.out.println(sb.reverse());

    }



    public static void main(String[] args) {
        StringFunction stf = new StringFunction();
        //stLength();
        //stf.splitSt();
        //stf.replaceSt();
        //stf.subStringAndContains();
        //stf.equalIgnoreCase();
        stf.StringBuffer();


    }

}
