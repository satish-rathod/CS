import java.util.Scanner;

/**
 * classes_3
 */
public static class Students {
    protected String name;
    protected String email;
    protected int phone;
    protected int pincode;
    protected String mentoremail;
    protected int Scolarship;
    protected float CGR;

    public Students(String name, String email, int phone, int pincode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pincode = pincode;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Pincode: " + this.pincode);
    }

    public boolean samePincode(Students s) {
        if (this.pincode == s.pincode) {
            return true;
        } else {
            return false;
        }
    }

    public int calulatefee() {
        int fee = 500000;
        if (this.Scolarship > 0) {
            return fee - this.Scolarship * fee / 100;
        } else {
            return fee;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Student s1 = new Student("vinay", "email.com", "9123019238", "123456");

    }

    class user extends Studentss {
        private String mentoremail;
        private int Scolarship;
        private float CGR;

        public user(String name, String email, int phone, int pincode, String mentoremail, int Scolarship, float CGR) {
            super(name, email, phone, pincode);
        }

        int calulatefee() {
            int fee = 500000;
            if (this.Scolarship > 0) {
                return fee - this.Scolarship * fee / 100;
            } else {
                return fee;
            }
        }

        void setmentoremail(String mentoremail) {
            this.mentoremail = mentoremail;
        }

        void setCGR(float CGR) {
            this.CGR = CGR;
        }

        void setScolarship(int Scolarship) {
            this.Scolarship = Scolarship;
        }

        string getmentoremail() {
            return this.mentoremail;
        }

        double getCGR() {
            return this.CGR;
        }

        int getScolarship() {
            return this.Scolarship;
        }

        void print() {
            super.print();
            System.out.println("Mentor Email: " + this.mentoremail);
            System.out.println("Scolarship: " + this.Scolarship);
            System.out.println("CGR: " + this.CGR);
        }s

    }

}