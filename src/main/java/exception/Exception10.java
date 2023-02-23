package exception;

public class Exception10 {


    public static void main(String[] args) {
        getStudentGrade(98);



    }

    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw  new InvalidStudentGradeException( " student grade cannot........");
            }catch (InvalidStudentGradeException e){
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println(grade);
        }
    }
}
