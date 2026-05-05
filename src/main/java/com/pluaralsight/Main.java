package com.pluaralsight;

public class Main {
    public static void main(String[] args){

        gettingEmployeeRoster();
        //gettingReservationLog();
        //roomAvailablityStatus();

    }
    private static void gettingEmployeeRoster() {
        Employee[] employees = new Employee[1];

        employees[0] = new Employee(767867, "Harper Thomas", "Hotel Manager", 25, 50);
//        employees[1] = new Employee(123456, "Liam Carter", "Front Desk Clerk", 15, 40);
//        employees[2] = new Employee(234567, "Olivia Bennett", "Housekeeper", 14, 35);
//        employees[3] = new Employee(345678, "Noah Mitchell", "Maintenance Technician", 20, 45);
//        employees[4] = new Employee(456789, "Emma Rodriguez", "Concierge", 18, 40);
//        employees[5] = new Employee(567890, "James Walker", "Bellhop", 13, 30);
//        employees[6] = new Employee(678901, "Sophia Anderson", "Event Coordinator", 22, 42);
//        employees[7] = new Employee(789012, "Benjamin Scott", "Security Officer", 19, 40);
//        employees[8] = new Employee(890123, "Mia Hernandez", "Restaurant Server", 16, 38);
//        employees[9] = new Employee(901234, "Lucas Young", "Valet Attendant", 12, 32);
//        employees[10] = new Employee(112233, "Ava King", "Spa Receptionist", 17, 36);


        for(int i = 0; i < employees.length; i++){
            Employee e = employees[i];
            e.punchIn(8);
            e.punchOut(10);
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

    private static void roomAvailablityStatus(){
        Room[] rooms = new Room[30];

        rooms[0] = new Room(2, 682.0, true,true);
        rooms[1] = new Room(4, 795.50, true, true);
        rooms[2] = new Room(3,679.89, false,false);
        rooms[3] = new Room(2, 374.29, false, false);
        rooms[4] = new Room(1, 215.75, false, false);
        rooms[5] = new Room(2, 489.99, true, false);
        rooms[6] = new Room(3, 620.50, false, true);
        rooms[7] = new Room(4, 810.00, true, true);
        rooms[8] = new Room(2, 355.25, false, false);
        rooms[9] = new Room(1, 199.99, true, false);
        rooms[10] = new Room(3, 540.80, false, false);
        rooms[11] = new Room(4, 920.45, true, true);
        rooms[12] = new Room(2, 410.10, false, true);
        rooms[13] = new Room(3, 675.60, false, false);
        rooms[14] = new Room(1, 180.00, false, false);
        rooms[15] = new Room(4, 999.99, true, false);
        rooms[16] = new Room(2, 305.30, false, false);
        rooms[17] = new Room(3, 710.75, true, true);
        rooms[18] = new Room(1, 250.50, false, true);
        rooms[19] = new Room(4, 850.00, false, false);
        rooms[20] = new Room(2, 399.99, true, false);
        rooms[21] = new Room(3, 580.20, false, false);
        rooms[22] = new Room(1, 175.45, false, false);
        rooms[23] = new Room(4, 780.80, true, true);
        rooms[24] = new Room(2, 460.00, false, false);
        rooms[25] = new Room(3, 690.90, false, true);
        rooms[26] = new Room(1, 210.10, false, false);
        rooms[27] = new Room(4, 870.65, true, false);
        rooms[28] = new Room(2, 330.75, false, false);
        rooms[29] = new Room(3, 605.55, true, true);

        for (int i = 0; i < rooms.length; i++) {
            Room r = rooms[i];

            //System.out.printf("%d %.2f %b %b %b", r.getGetNumberOfBeds(),r.getGetPrice(),r.isOccupied(),r.isDirty());
            //System.out.println(r.isAvailable());
            //System.out.println(r.hasHouseKeeping());
            //System.out.println(r.checkIn());
            System.out.println(r.checkOut());
        }

    }
}

