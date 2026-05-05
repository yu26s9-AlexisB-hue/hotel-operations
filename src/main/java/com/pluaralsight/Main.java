package com.pluaralsight;

public class Main {
    public static void main(String[] args){

        //gettingEmployeeRoster();
        gettingReservationLog();

    }
    private static void gettingEmployeeRoster() {
        Employee[] employees = new Employee[11];

        employees[0] = new Employee(767867, "Harper Thomas", "Hotel Manager", 25, 50);
        employees[1] = new Employee(123456, "Liam Carter", "Front Desk Clerk", 15, 40);
        employees[2] = new Employee(234567, "Olivia Bennett", "Housekeeper", 14, 35);
        employees[3] = new Employee(345678, "Noah Mitchell", "Maintenance Technician", 20, 45);
        employees[4] = new Employee(456789, "Emma Rodriguez", "Concierge", 18, 40);
        employees[5] = new Employee(567890, "James Walker", "Bellhop", 13, 30);
        employees[6] = new Employee(678901, "Sophia Anderson", "Event Coordinator", 22, 42);
        employees[7] = new Employee(789012, "Benjamin Scott", "Security Officer", 19, 40);
        employees[8] = new Employee(890123, "Mia Hernandez", "Restaurant Server", 16, 38);
        employees[9] = new Employee(901234, "Lucas Young", "Valet Attendant", 12, 32);
        employees[10] = new Employee(112233, "Ava King", "Spa Receptionist", 17, 36);


        for(int i = 0; i < employees.length; i++){
            Employee e = employees[i];

            System.out.printf("%d %s %s %.2f %.2f\n", e.getEmployeeId(), e.getName(), e.getDepartment(), e.getPayRate(), e.getHoursWorked());
            System.out.println(e.getTotalPay());
            System.out.println(e.getOvertimeHours());
        }


    }

    private static void gettingReservationLog() {
        Reservation[] reservations = new Reservation[10];

        reservations[0] = new Reservation("double", 5, true);
        reservations[1] = new Reservation("king", 3, false);
        reservations[2] = new Reservation("double", 7, true);
        reservations[3] = new Reservation("double", 2, false);
        reservations[4] = new Reservation("king", 4, true);
        reservations[5] = new Reservation("double", 6, false);
        reservations[6] = new Reservation("double", 3, true);
        reservations[7] = new Reservation("double", 5, true);
        reservations[8] = new Reservation("king", 1, false);
        reservations[9] = new Reservation("double", 8, true);

        for (int i = 0; i < reservations.length; i++){
            Reservation r = reservations[i];

            System.out.printf("%s %d %b\n", r.getRoomType(), r.getNumberOfNights(), r.isWeekend());
            System.out.println(r.getReservationTotal());

        }

    }
}

