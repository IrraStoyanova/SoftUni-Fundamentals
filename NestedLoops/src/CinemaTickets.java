import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = 0;
        int countStandart = 0;
        int countKids = 0;
        int countAllTickets = 0;

        String command = scanner.nextLine();

        while(!command.equals("Finish")) {
            String movie = command;
            int totalSeatsCurrent = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String ticketsType = scanner.nextLine();

            while (!ticketsType.equals("End")) {
                countCurrentTickets++;
                countAllTickets++;
                switch (ticketsType) {
                    case "kid":
                        countKids++;
                        break;
                    case "standard":
                        countStandart++;
                        break;
                    case "student":
                        countStudent++;
                        break;
                }
                if (countCurrentTickets >= totalSeatsCurrent) {
                    break;
                }

                ticketsType = scanner.nextLine();


            }


            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.00 / totalSeatsCurrent * 100);
            command = scanner.nextLine();
        }

            System.out.printf("Total tickets: %d%n", countAllTickets);
            System.out.printf("%.2f%% student tickets.%n", countStudent*1.00/countAllTickets*100);
            System.out.printf("%.2f%% standard tickets.%n", countStandart*1.00/countAllTickets*100);
            System.out.printf("%.2f%% kids tickets.%n", countKids*1.00/countAllTickets*100);

        }
    }

