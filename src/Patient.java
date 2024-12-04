import java.lang.Math;
public class Patient
{
    private int id = 0;
    private String name ="";
    private int birthYear = 0;
    private double height = 165;
    private double weight = 62;
    private String bloodgroup = "";
    private String numberphone = "";
    private double BMI=0;
    public Patient(int id, String name, int birthYear, double height , double weight , String bloodgroup , String numberphone )
        {
        this.id = id;
        this.name = name;
           if(bloodgroup == "A" || bloodgroup == "B"|| bloodgroup == "C"|| bloodgroup == "C")
            {
                this.bloodgroup = bloodgroup;
            }
            else
            {
                System.out.println("Invalid bloodgroup for patient: " + name);
                this.bloodgroup = "Unknown";
            }


        this.numberphone = numberphone;
            if (birthYear > 1900 && birthYear <= 2024)
            {
                this.birthYear = birthYear;
            }
            else
            {
                System.out.println("Invalid birth year for patient: " + name);
                this.birthYear = 1800;
            }
            if (height > 0 && height <300)
            {
                this.height = height;
            }
            else
            {
                System.out.println("Invalid height for patient: " + name);
            }

            if (weight > 0 && weight <700)
            {
                this.weight = weight;
            }
            else
            {
                System.out.println("Invalid weight for patient: " + name);
            }
        }
    public double getBMI(double height , double weight)
        {
            if(height > 0 && weight > 0)
            {
                return weight/Math.pow(height/100, 2);
            }
            else
            {
                return 0.0;
            }
        }
    public int getAge(int currentYear)
        {
            return currentYear - this.birthYear;
        }
    public void displayDetails(int currentYear)
        {
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + getAge(currentYear));
            System.out.println("Patient Height (cm): " + height);
            System.out.println("Patient Weight (kg): " + weight);
            System.out.println("Patient Bloodgroup : " + bloodgroup);
            System.out.println("Patient numberphone: " + numberphone);
            System.out.println("Patient BMI : " + getBMI(height,weight));
        }
        public static void main(String[] args)
        {
             int currentYear = 2024;
             Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A" , "0659641998");
             patient.displayDetails(currentYear);
             Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "XXL" , "98129481981");
             invalidPatient.displayDetails(currentYear);
        }
}



