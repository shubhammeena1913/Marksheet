import java.util.*;
class VaribleInitialise{
    Scanner SC = new Scanner(System.in);
    String student_name, father_name, mother_name, enroll_number;
    int roll_number, clg_choice, coursecode;
    String grade, overall_grade, result;
    int year1, year2, year3, choose, check;
    float average_1year, average_2year, average_3year;
    String course_name, subject_1, subject_2, subject_3, subject_4, subject_5; 
    int f=0,yearvalue,n,subject_1_marks,subject_2_marks,subject_3_marks,subject_4_marks,subject_5_marks,k=0,total_marks_single_year = 0;
    String subject_1_grade, subject_2_grade, subject_3_grade, subject_4_grade, subject_5_grade;
    float per;
    public void welcome(){
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  WELCOME  ~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
class StaticItems extends VaribleInitialise{
    static String clg_name = "SANT SINGAJI INSTITUTE OF SCIENCE & MANAGEMENT";
    static String clg_location = "SANDALPUR";
    static String clg_univercity = "VIKRAM UNIVERCITY UJJAIN (M.P.)";
}
class ChangeCollege extends StaticItems{
        public void newcollegeInfo(){
        System.out.println("Your College Name Is :"+" "+clg_name);
        System.out.println("Your College Location Is :"+" "+clg_location);
        System.out.println("Your College Univercity Is :"+" "+clg_univercity);
    }
    
    static void changeclgname(){
        Scanner SC2 = new Scanner(System.in);
        System.out.println("Enter your College name :");
        clg_name = SC2.nextLine();
        System.out.println("Enter your College location :"); 
        clg_location = SC2.nextLine();
        System.out.println("Enter your College univercity :");
        clg_univercity = SC2.nextLine();
    }
    public void choiceclgdetailschanging(){
        System.out.println(" \nyou want to change your clg details....\n press (1) for YES :\n press another key for NO :");
        clg_choice = SC.nextInt();
        if(clg_choice == 1){
            changeclgname();
            newcollegeInfo();
        }
    }
}
class PrintCollegeDetails extends ChangeCollege{
    public void oldcollegeInfo(){
        System.out.println("Your College Name Is :"+" "+clg_name);
        System.out.println("Your College Location Is :"+" "+clg_location);
        System.out.println("Your College Univercity Is :"+" "+clg_univercity);
    }
}
class Instructions extends PrintCollegeDetails{
    public void personal_instruction(){
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************************");
        System.out.println("************ PLEASE ENTER STUDENT'S PERSONAL DETAILS **************\n\n\n");
    }
    public void educational_instruction(){
        System.out.println();   
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("************ PLEASE ENTER STUDENT'S Educational DETAILS **************\n\n\n");
    } 
}
class InputPersonalDetails extends Instructions{
    public void takepersonaldetails(){
        System.out.println("Enter student name :");
        student_name=SC.nextLine();
        System.out.println("Enter student's father name :");
        father_name=SC.nextLine();
        System.out.println("Enter student's mother name :");
        mother_name=SC.nextLine();
        System.out.println("Enter student's Enrollment number :");
        enroll_number=SC.nextLine();
        System.out.println("Enter student's roll number :");
        roll_number=SC.nextInt();
        System.out.println("\n\n\n");
    }
}
class ShowSubjectNames extends InputPersonalDetails{
    public void showsubjects(){
        System.out.println("\n_____________________________________________________________________");
        System.out.println(" \t\tYour Subject is :"+" "+course_name);
        System.out.println("_____________________________________________________________________");
        System.out.println("  1.  "+subject_1);
        System.out.println("  2.  "+subject_2);
        System.out.println("  3.  "+subject_3);
        System.out.println("  4.  "+subject_4);
        System.out.println("  5.  "+subject_5);
    }
}
class Selectsubjects extends ShowSubjectNames{
    public void choosesubject(){
        System.out.print("\n\nChoose a number for Choosing subject :\n press (1) for bca :\n press (2) for bsc_cs :\n press (3) for bsc_plain");
        System.out.println(" ");
        coursecode = SC.nextInt();
        if(coursecode == 1){
             course_name = "Bachelor of computer application";
             subject_1 = "DM";
             subject_2 = "OS";
             subject_3 = "CF";
             subject_4 = "HI";
             subject_5 = "EN";
        }
        else if(coursecode == 2){
            course_name ="Bachelor of science(Computer Science)";
             subject_1 = "PH";
             subject_2 = "CF";
             subject_3 = "MA";
             subject_4 = "HI";
             subject_5 = "EN";
        }
        else if(coursecode == 3){
            course_name ="Bachelor of science";
             subject_1 = "CH";
             subject_2 = "MA";
             subject_3 = "PH";
             subject_4 = "HI";
             subject_5 = "EN";
        }   
        else{
            System.out.println("\n\n! Invalid Choice for subject  Please Choose Corect Option ");
            choosesubject();
        }
    }
    public void nextYear_course_1(){
        if(yearvalue == 2){
            subject_1 = "AA";
            subject_2 = "BB";
            subject_3 = "CC";
            subject_4 = "DD";
            subject_5 = "EE";
            showsubjects();
        }
        else if(yearvalue == 3){
            subject_1 = "FF";
            subject_2 = "GG";
            subject_3 = "HH";
            subject_4 = "II";
            subject_5 = "JJ";
            showsubjects();
        }
    }
    public void nextYear_course_2(){
        if(yearvalue == 2){
            subject_1 = "KK";
            subject_2 = "LL";
            subject_3 = "MM";
            subject_4 = "NN";
            subject_5 = "OO";
            showsubjects();
        }
        else if(yearvalue == 3){
            subject_1 = "PP";
            subject_2 = "QQ";
            subject_3 = "RR";
            subject_4 = "SS";
            subject_5 = "TT";
            showsubjects();
        }
    }
    public void nextYear_course_3(){
        if(yearvalue == 2){
            subject_1 = "UU";
            subject_2 = "VV";
            subject_3 = "WW";
            subject_4 = "XX";
            subject_5 = "YY";
            showsubjects();
        }
        else if(yearvalue == 3){
            subject_1 = "ZZ";
            subject_2 = "ab";
            subject_3 = "bc";
            subject_4 = "cd";
            subject_5 = "de";
            showsubjects();
        }
    }
}
class MarksheetProcess extends Selectsubjects {
    public void marksheetprocessing(){
        for(yearvalue=1;yearvalue<=3;yearvalue++){
            if(coursecode == 1){
                if(yearvalue == 2){
                    nextYear_course_1();
                }
                else if(yearvalue == 3){
                    nextYear_course_1();
                }
            }
            if(coursecode == 2){
                if(yearvalue == 2){
                    nextYear_course_2();
                }
                else if(yearvalue == 3){
                    nextYear_course_2();
                }
            }
            if(coursecode == 3){
                if(yearvalue == 2){
                    nextYear_course_3();
                }
                else if(yearvalue == 3){
                    nextYear_course_3();
                }
            }
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+yearvalue+" "+"Year examination~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("enter mars of :"+subject_1);
            subject_1_marks=SC.nextInt();
            System.out.println("enter mars of :"+subject_2);
            subject_2_marks=SC.nextInt();
            System.out.println("enter mars of :"+subject_3);
            subject_3_marks=SC.nextInt();
            System.out.println("enter mars of :"+subject_4);
            subject_4_marks=SC.nextInt();
            System.out.println("enter mars of :"+subject_5);
            subject_5_marks=SC.nextInt();
            total_marks_single_year = subject_1_marks + subject_2_marks + subject_3_marks + subject_4_marks + subject_5_marks;
            per = (float)total_marks_single_year/5;
            if(subject_1_marks <33 || subject_2_marks <33 || subject_3_marks <33 || subject_4_marks <33 || subject_5_marks <33){
                System.out.println(subject_1_marks);  
                System.out.println(subject_2_marks);
                System.out.println(subject_3_marks);
                System.out.println(subject_4_marks);
                System.out.println(subject_5_marks);
                System.out.println("total marks ="+total_marks_single_year);
                System.out.println("percent = "+per);
            }
            f=0;
            k=0;
            if(subject_1_marks<33){
                System.out.println("supplymentary in "+" "+subject_1);
                f=f+1;
            }
            if(subject_2_marks<33){
                System.out.println("supplymentary in "+" "+subject_2);
                f=f+1;
            }
            if(subject_3_marks<33){
                System.out.println("supplymentary in "+" "+subject_3);
                f=f+1;
            }
            if(subject_4_marks<33){
                System.out.println("supplymentary in "+" "+subject_4);
                f=f+1;
            }
            if(subject_5_marks<33){
                System.out.println("supplymentary in "+" "+subject_5);
                f=f+1;
            }
            System.out.println("|________________________________________________________|");
            if(f==2||f==1){
                System.out.println("Give your supplymentary Exam");
                System.out.println("!! BEST OF LUCK !!");
                k=0;
            }
            if(f>=3){
                System.out.println("Year Back");
                System.out.println("!! TRY AGAIN !!");
                k=k+1;
                yearvalue--;
            }
            if(k!=1){
                k=0;
                if(subject_1_marks<33)
                {
                    System.out.println("SUPPLYMENTARY EXAM");
                    System.out.println(subject_1);
                    System.out.println("Out Of 100 your marks are =");
                    int chga;
                    chga=SC.nextInt();
                    subject_1_marks=chga;
                    if(subject_1_marks<33)
                    {
                        System.out.println("Failed in DE");
                        System.out.println("Year Back");
                        k=k+1;
                        yearvalue--;
                    }
                    else{
                        System.out.println("Passed by Supplymentary Exam");
                    }
                }
                if(k!=2){
                    if(subject_2_marks<33){
                        System.out.println("SUPPLYMENTARY EXAM");
                        System.out.println(subject_2);
                        System.out.println("Out Of 100 your marks are =");
                        int chgb;
                        chgb=SC.nextInt();
                        subject_2_marks=chgb;
                        if(subject_2_marks<33){
                            System.out.println("Failed in OS");
                            System.out.println("Year Back");
                            k=k+1;
                            if(k==1){
                                yearvalue--;
                            }
                        }
                        else{
                            System.out.println("Passed by Supplymentary Exam");
                        }
                    }
                }
                if(k!=3){
                    if(subject_3_marks<33){
                        System.out.println("SUPPLYMENTARY EXAM");
                        System.out.println(subject_3);
                        System.out.println("Out Of 100 your marks are =");
                        int chgc;
                        chgc=SC.nextInt();
                        subject_3_marks=chgc;
                        if(subject_3_marks<33){
                            System.out.println("Failed in MA");
                            System.out.println("Year Back");
                            k=k+1;
                            if(k==1){
                                yearvalue--;
                            }
                        }
                        else{
                            System.out.println("Passed by Supplymentary Exam");
                        }
                    }
                }
                if(k!=3){
                    if(subject_4_marks<33){
                        System.out.println("SUPPLYMENTARY EXAM");
                        System.out.println(subject_4);
                        System.out.println("Out Of 100 your marks are =");
                        int chgd;
                        chgd=SC.nextInt();
                        subject_4_marks=chgd;
                        if(subject_4_marks<33){
                            System.out.println("Failed in HI");
                            System.out.println("Year Back");
                            k=k+1;
                            if(k==1){
                                yearvalue--;
                            }
                        }
                        else{
                            System.out.println("Passed by Supplymentary Exam");
                        }
                    }
                }
                if(k!=3){
                    if(subject_5_marks<33){
                        System.out.println("SUPPLYMENTARY EXAM");
                        System.out.println(subject_5);
                        System.out.println("Out Of 100 your marks are =");
                        int chge;
                        chge=SC.nextInt();
                        subject_5_marks=chge;
                        if(subject_5_marks<33){
                            System.out.println("Failed in EN");
                            System.out.println("Year Back");
                            k=k+1;
                            if(k==1){
                                yearvalue--;
                            }
                        }   
                        else{
                            System.out.println("Passed by Supplymentary Exam");
                            k=0;
                        }
                    }
                }
            }
            int sum1=subject_1_marks+subject_2_marks+subject_3_marks+subject_4_marks+subject_5_marks;
            float per1=(float)sum1/5;
            if(per1 >= 90 && per1 <= 100){
                grade = "A+";
                result = "PASS";
            }
            else if(per1 >= 75 && per1 < 90){
			    grade = "A";
                result = "PASS";
		    }
		    else if(per1 < 75 && per1 >= 50){
			    grade = "B";
                result = "PASS";
		    }
		    else if(per1 >= 33 && per1 < 50){
			    grade = "C";
                result = "PASS";
		    }
            else if(per1 >= 0 && per1 < 33){
			    grade = "D";
                result = "FAIL";
		    }
            if(subject_1_marks>33&&subject_2_marks>33&&subject_3_marks>33&&subject_4_marks>33&&subject_5_marks>33){
                System.out.println("___________________________________________________________________________________________");
                System.out.println("                        "+clg_name                                                          );
                System.out.println("                                            "+clg_location                                  );
                System.out.println("                                           (2021 - 2022)                                   ");
                System.out.println("   Univercity name     :-  "+"      "+clg_univercity                                        );
                System.out.println("   Subject             :-  "+"      "+course_name                                           );
                System.out.println("   Student Name        :-  "+"      "+student_name                                                );
                System.out.println("   Father Name         :-  "+"      "+father_name                                                );
                System.out.println("   Mother Name         :-  "+"      "+mother_name                                                );
                System.out.println("   Enrollment number   :-  "+"      "+enroll_number                                         );
                System.out.println("   Roll number         :-  "+"      "+roll_number                                           );
                System.out.println("___________________________________________________________________________________________");
                System.out.println("    ");
                System.out.println("    Sr. No.            SUBJECT           OUT OF                MARKS                       ");
                System.out.println("      1.                 "+subject_1+"               100                   "+subject_1_marks);
                System.out.println("      2.                 "+subject_2+"               100                   "+subject_2_marks);
                System.out.println("      3.                 "+subject_3+"               100                   "+subject_3_marks);
                System.out.println("      4.                 "+subject_4+"               100                   "+subject_4_marks);
                System.out.println("      5.                 "+subject_5+"               100                   "+subject_5_marks);
                System.out.println("");
                System.out.println("    total        :"+"   "+sum1                                                              );
                System.out.println("    percentage   :"+"   "+per1                                                              );
                System.out.println("    Grade        :"+"   "+grade                                                             );
                System.out.println("    Result       :"+"   "+result                                                            );
                System.out.println("___________________________________________________________________________________________");
                System.out.println("    ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Congratulation you passed"+" "+yearvalue+" "+"Year ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }
            if(yearvalue==1){
                year1=sum1;
                average_1year=per1;
            }       
            if(yearvalue==1){
                year2=sum1;
                average_2year=per1;
            }
            if(yearvalue==3){
                year3=sum1;
                average_2year=per1;
            }
            if(yearvalue==3){
                int allmarks=year1+year2+year3;
                float allavg=(average_1year+average_2year+average_2year)/3;
                if(allavg >= 75){
			        overall_grade = "A";
		        }
		        else if(allavg < 75 && allavg >= 50){
			        overall_grade = "B";
		        }
		        else if(allavg >= 33 && allavg < 50){
			        overall_grade = "C";
		        }
                System.out.println("if u want all year process press.......1 or not for press any key");
                check=SC.nextInt();
                if(check==1)
                {
                    System.out.println("___________________________________________________________________________________________");
                    System.out.println("                        "+clg_name                                                          );
                    System.out.println("                                            "+clg_location                                  );
                    System.out.println("                                           (2021 - 2022)                                   ");
                    System.out.println("   Univercity name     :-  "+"      "+clg_univercity                                        );
                    System.out.println("   Subject             :-  "+"      "+course_name                                           );
                    System.out.println("   Student Name        :-  "+"      "+student_name                                                );
                    System.out.println("   Father Name         :-  "+"      "+father_name                                                );
                    System.out.println("   Mother Name         :-  "+"      "+mother_name                                                );
                    System.out.println("   Enrollment number   :-  "+"      "+enroll_number                                         );
                    System.out.println("   Roll number         :-  "+"      "+roll_number                                           );
                    System.out.println("___________________________________________________________________________________________");
                    System.out.println("    ");
                    System.out.println("     Year                MARKS             OUT OF                PERCENTAGE                ");
                    System.out.println("      1.                 "+year1+"               500                   "+average_1year                );
                    System.out.println("      2.                 "+year2+"               500                   "+average_2year                );
                    System.out.println("      3.                 "+year3+"               500                   "+average_2year                );
                    System.out.println("");
                    System.out.println("   Grand total        :"+"   "+allmarks                                                     );
                    System.out.println("   Total percentage   :"+"   "+allavg                                                       );
                    System.out.println("   Total Grade        :"+"   "+overall_grade                                                   );
                    System.out.println("___________________________________________________________________________________________");
                }
            }     
        }
    }
}
class PrintDegree extends MarksheetProcess{
    public void printdegree(){
        System.out.println("if you Want Your Degree........\n Press (1) for 'YES' \n Press (ANY KEY) for 'NO' ");
        int choice = SC.nextInt();
        if(choice == 1){         
            System.out.println();
            System.out.println();
            System.out.println("|==============================================================================================================|");
            System.out.println("|                       "+clg_name+"                                                                            ");
            System.out.println("|                       "+clg_location+"                                                                        ");
            System.out.println("|                                                                                                              |");
            System.out.println("|                                          CERTIFICATE OF GRADUATION                                           |");
            System.out.println("|                                                                                                              |");
            System.out.println("|                 THIS IS TO CERTIFIED THAT "+student_name+" "+"SUCCESSFULLY COMPLETE HIS GRADUATION                |");
            System.out.println("|                               OUR BEST WISHES IS ALWAYS WITH YOU                                             |");
            System.out.println("|                                                                                                              |");
            System.out.println("|                                                                                                              |");
            System.out.println("|                                                                                                              |");
            System.out.println("|                                                                                                              |");
            System.out.println("|                                                                                 __________________________   |");
            System.out.println("|                                                                                      PRINCIPAL SIGNATURE     |");
            System.out.println("|                                                                                                              |");
            System.out.println("|==============================================================================================================|");
        }
        else{
            System.out.println("THANKYOU");
        }
    }
}
class CallingMethod extends PrintDegree{
    public void callAllMethods(){
        welcome();
        personal_instruction();
        takepersonaldetails();
        educational_instruction();
        oldcollegeInfo();
        choiceclgdetailschanging();
        choosesubject();
        showsubjects();
        marksheetprocessing();
        printdegree();
    }
}
public class pro4 extends CallingMethod{ 
    public static void main(String args[]){
        CallingMethod obj1 = new CallingMethod();     
        obj1.callAllMethods();
    }
}