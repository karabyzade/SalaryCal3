package homework1;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Salary");
        float baseSalary = scanner.nextInt();
        System.out.println("Hafta ICI Calisma");
        float weekdaysHours = scanner.nextInt();
        System.out.println("haftasonu");
        float weekendHours = scanner.nextInt();
        float Saatlik = baseSalary / 40;
        float MAAS = 0;
        float azMaas = 0;
        float HaftaIciMaas = 0;
        if (baseSalary < 999) {
            System.out.println("Wrong salary");
        }
        else {
            if (weekdaysHours>=40)
            {
                HaftaIciMaas= (float) (baseSalary+((weekdaysHours-40)*Saatlik)*1.5);
            }
            else {
                HaftaIciMaas=weekdaysHours*Saatlik;
            }

            if (weekendHours>=40)
            {
                if (weekdaysHours>=40)
                {
                    MAAS= (float) (HaftaIciMaas+((weekendHours-40)*Saatlik*1.5))+500;
                    System.out.println("Maas="+MAAS);
                }
                else
                {
                   MAAS=HaftaIciMaas+((weekendHours-40)*Saatlik)*2;
                    System.out.println("Maas="+MAAS);
                }
            }
            else
            {
                if (weekendHours>=10)
                {
                MAAS=HaftaIciMaas+(weekendHours*Saatlik);
                    System.out.println("Maas="+MAAS);
                }
                else {
                    if(weekdaysHours>=40)
                    {
                        MAAS=HaftaIciMaas+(weekendHours*Saatlik)+500;
                        System.out.println("Maas="+MAAS);
                    }
                    else
                    {
                        MAAS=HaftaIciMaas+(weekendHours*Saatlik);
                        System.out.println("Maas="+MAAS);
                    }
                }
            }
        }

    }
}