/*
import currencyconverter.currencyconverter;
import distanceconverter.distanceconverter;
import timeconverter.timeconverter;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        currencyconverter cc= new currencyconverter();
        distanceconverter dc= new distanceconverter();
        timeconverter tc= new timeconverter();

        
        System.out.println("Select conversion type:");
        System.out.println("1. Currency Conversion");
        System.out.println("2. Distance Conversion");
        System.out.println("3. Time Conversion");
        System.out.println("4. Exit");
        System.out.print("Enter choice (1, 2 or 3): ");

        int choice=sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("\nConversion options:");
                System.out.println(
                    "1. Dollar to INR\n" +
                    "2. Euro to INR\n" +
                    "3. Yen to INR\n" +
                    "4. INR to Euro\n" +
                    "5. INR to Dollar\n" +
                    "6. INR to Yen\n"
                );
                System.out.print("Enter your choice of currency conversion: ");
                int currchoice=sc.nextInt();
                System.out.println("Enter amount: ");
                double amount=sc.nextDouble();
                double cresult=0.0;

                switch(currchoice) {
                    case 1:
                        cresult=cc.dol_to_inr(amount);
                        break;
                    case 2:
                        cresult=cc.euro_to_inr(amount);
                        break;
                    case 3:
                        cresult=cc.yen_to_inr(amount);
                        break;
                    case 4:
                        cresult=cc.inr_to_euro(amount);
                        break;
                    case 5:
                        cresult=cc.inr_to_dollar(amount);
                        break;
                    case 6:
                        cresult=cc.inr_to_yen(amount);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        System.exit(0);
                    }
                System.out.println("Converted currency value: " + cresult);
                break;

                case 2:
                    System.out.println("\nConversion options:");
                    System.out.println(
                    "1. Kilometre to metre\n" +
                    "2. Miles to kilometre\n" +
                    "3. Kilometre to miles\n" 
                    );
                    System.out.print("Enter your choice of distance conversion: ");
                    int distchoice=sc.nextInt();
                    System.out.println("\nEnter distance: ");
                    double distance=sc.nextDouble();
                    double dresult=0.0;

                    switch(distchoice) {
                        case 1:
                            dresult=dc.km_to_m(distance);
                            break;
                        case 2:
                            dresult=dc.miles_to_km(distance);
                            break;
                        case 3:
                            dresult=dc.km_to_miles(distance);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            System.exit(0);
                    }
                    System.out.println("Converted distance value: " + dresult);
                    break;

                case 3:
                    System.out.println("\nConversion options:");
                    System.out.println(
                    "1. Hours to minutes\n" +
                    "2. Hours to seconds\n" +
                    "3. Seconds to hours\n" +
                    "4. Seconds to minutes\n" 
                    );
                    System.out.print("Enter your choice of time conversion: ");
                    int timechoice=sc.nextInt();
                    System.out.println("\nEnter time: ");
                    double time=sc.nextDouble();
                    double tresult=0.0;

                    switch (timechoice) {
                        case 1:
                            tresult=tc.hr_to_min(time);
                            break;
                        case 2:
                            tresult=tc.hr_to_sec(time);
                            break;
                        case 3:
                            tresult=tc.sec_to_hr(time);
                            break;
                        case 4:
                            tresult=tc.sec_to_min(time);
                    }
                    System.out.println("Converted time value is: " + tresult);
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
        }
        sc.close();
        
    }
}
*/

import currencyconverter.currencyconverter;
import distanceconverter.distanceconverter;
import timeconverter.timeconverter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        currencyconverter cc = new currencyconverter();
        distanceconverter dc = new distanceconverter();
        timeconverter tc = new timeconverter();
        String log = "";

        System.out.println("Select conversion type:");
        System.out.println("1. Currency Conversion");
        System.out.println("2. Distance Conversion");
        System.out.println("3. Time Conversion");
        System.out.println("4. Exit");
        System.out.print("Enter choice (1-4): ");
        String choiceInput = sc.nextLine();

        if (!isNumeric(choiceInput)) {
            log += "ERROR: Non-numeric choice entered.\n";
            System.out.println("Invalid choice. Must be numeric.");
            writeLog(log);
            return;
        }

        int choice = Integer.parseInt(choiceInput);

        switch (choice) {
            case 1:
                System.out.println("\nConversion options:");
                System.out.println("1. Dollar to INR\n2. Euro to INR\n3. Yen to INR\n4. INR to Euro\n5. INR to Dollar\n6. INR to Yen");
                System.out.print("Enter your choice of currency conversion: ");
                int currChoice = sc.nextInt();
                System.out.println("Enter amount: ");
                double amount = sc.nextDouble();
                double cresult = 0.0;
                String currConv = "";

                if (currChoice == 1) {
                    cresult = cc.dol_to_inr(amount);
                    currConv = "Dollar to INR";
                } else if (currChoice == 2) {
                    cresult = cc.euro_to_inr(amount);
                    currConv = "Euro to INR";
                } else if (currChoice == 3) {
                    cresult = cc.yen_to_inr(amount);
                    currConv = "Yen to INR";
                } else if (currChoice == 4) {
                    cresult = cc.inr_to_euro(amount);
                    currConv = "INR to Euro";
                } else if (currChoice == 5) {
                    cresult = cc.inr_to_dollar(amount);
                    currConv = "INR to Dollar";
                } else if (currChoice == 6) {
                    cresult = cc.inr_to_yen(amount);
                    currConv = "INR to Yen";
                } else {
                    System.out.println("Invalid currency choice.");
                    return;
                }

                System.out.println("Converted currency value: " + cresult);
                log += "Currency Conversion (" + currConv + "): amount=" + amount + ", result=" + cresult + "\n";
                break;

            case 2:
                System.out.println("\nConversion options:");
                System.out.println("1. Kilometre to metre\n2. Miles to kilometre\n3. Kilometre to miles");
                System.out.print("Enter your choice of distance conversion: ");
                int distChoice = sc.nextInt();
                System.out.println("\nEnter distance: ");
                double distance = sc.nextDouble();
                double dresult = 0.0;
                String distConv = "";

                if (distChoice == 1) {
                    dresult = dc.km_to_m(distance);
                    distConv = "Kilometre to metre";
                } else if (distChoice == 2) {
                    dresult = dc.miles_to_km(distance);
                    distConv = "Miles to kilometre";
                } else if (distChoice == 3) {
                    dresult = dc.km_to_miles(distance);
                    distConv = "Kilometre to miles";
                } else {
                    System.out.println("Invalid distance choice.");
                    return;
                }

                System.out.println("Converted distance value: " + dresult);
                log += "Distance Conversion (" + distConv + "): distance=" + distance + ", result=" + dresult + "\n";
                break;

            case 3:
                System.out.println("\nConversion options:");
                System.out.println("1. Hours to minutes\n2. Hours to seconds\n3. Seconds to hours\n4. Seconds to minutes");
                System.out.print("Enter your choice of time conversion: ");
                int timeChoice = sc.nextInt();
                System.out.println("\nEnter time: ");
                double time = sc.nextDouble();
                double tresult = 0.0;
                String timeConv = "";

                if (timeChoice == 1) {
                    tresult = tc.hr_to_min(time);
                    timeConv = "Hours to minutes";
                } else if (timeChoice == 2) {
                    tresult = tc.hr_to_sec(time);
                    timeConv = "Hours to seconds";
                } else if (timeChoice == 3) {
                    tresult = tc.sec_to_hr(time);
                    timeConv = "Seconds to hours";
                } else if (timeChoice == 4) {
                    tresult = tc.sec_to_min(time);
                    timeConv = "Seconds to minutes";
                } else {
                    System.out.println("Invalid time choice.");
                    return;
                }

                System.out.println("Converted time value is: " + tresult);
                log += "Time Conversion (" + timeConv + "): time=" + time + ", result=" + tresult + "\n";
                break;

            case 4:
                System.out.println("Exiting...");
                log += "User exited program.\n";
                break;

            default:
                System.out.println("Invalid main choice.");
                log += "ERROR: Invalid main choice: " + choice + "\n";
                break;
        }

        writeLog(log);
        sc.close();
    }

    public static boolean isNumeric(String s) {
        if (s == null || s.trim().equals("")) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static void writeLog(String content) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write("------ Log Entry ------\n");
            fw.write(content);
            fw.write("\n-----------------------\n\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Logging failed.");
        }
    }
}
