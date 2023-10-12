import java.util.Scanner;
public class Email {
    private String name;
    private String surname;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String email ;
    private String alternateEmail;
    private int defaultPasswordLenght = 8;

    private final String company = "erdem.com";

    Scanner sc = new Scanner(System.in);

    public Email(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.department=setDepartment();
        System.out.println("Department =" +this.department);
        this.password=passwordGenerator(defaultPasswordLenght);
        System.out.println("Password = " +password);
        this.email=generateEmail();
        System.out.println("Your mail is = " +generateEmail());

    }
    private String setDepartment(){
        System.out.println("Enter the department");
        String department = sc.nextLine();
        this.department=department;

        return department;

    }

    private String passwordGenerator(int length){
        String passwordSet ="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuWwYyZzXx0123456789+-&#";
        char[] password = new char[length];
        for(int i = 0; i<length;i++){
            int random =(int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }
        return new String(password);
    }

    private String generateEmail(){
        email=name.toLowerCase()+"."+surname.toLowerCase()+"@"+department.toLowerCase()+"."+company.toLowerCase();

        return email;
    }


    public void setMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }


    public void setAlternateEmail (String altEmail){
        this.alternateEmail=altEmail;
    }

    public void changePassword(String password){
        this.password=password;
    }

    public  String showInfo(){
        return  "DISPLAY NAME  = " + name + " " + surname +"\n"+
                "DEPARTMENT    = " + department +"\n" +
                "EMAIL         = " + email + "\n" +
                "MAIL CAPACITY = " + mailboxCapacity;
    }

}

