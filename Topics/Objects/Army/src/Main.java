class Army {

    public static void createArmy() {
        // Create all objects here
        Unit firstUnit = new Unit("John");
        Unit secondUnit = new Unit("Steve");
        Unit thirdUnit = new Unit("Peter");
        Unit fourthUnit = new Unit("Chris");
        Unit fifthUnit = new Unit("James");

        Knight firstKnight = new Knight("Daniel");
        Knight secondKnight = new Knight("Chad");
        Knight thirdKnight = new Knight("Francis");

        General general = new General("Bryan");

        Doctor doctor = new Doctor("Harry");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}