public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Yalova";
        cities[1][0] = "Ankara";
        cities[1][1] = "Sivas";
        cities[1][2] = "Kırıkkale";
        cities[2][0] = "Erzincan";
        cities[2][1] = "Erzurum";
        cities[2][2] = "Kars";

        for (int i = 0; i < 3; i++) {
            System.out.println("---------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
