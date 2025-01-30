package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("8"); // Верхній та нижній рядки заповнені
                } else if (i <= height / 2 && (j >= i && j < height - i)) {
                    System.out.print("8"); // Верхня частина годинника
                } else if (i > height / 2 && (j == height - i - 1 || j == i)) {
                    System.out.print("8"); // Нижня частина годинника
                } else {
                    System.out.print(" "); // Всередині — пробіли
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hourglass hg = new Hourglass();
        hg.printHourglassOfGivenSize(5);
    }
}
