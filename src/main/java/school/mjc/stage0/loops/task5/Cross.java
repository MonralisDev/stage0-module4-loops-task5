package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {         // Проходимо всі рядки
            for (int j = 0; j < sideLength; j++) {     // Проходимо всі стовпці
                if (i == j || i + j == sideLength - 1) {
                    // Якщо позиція належить одній з діагоналей
                    System.out.print("8");
                } else {
                    System.out.print(" ");  // Інакше друкуємо пробіл
                }
            }
            System.out.println(); // Перехід на новий рядок після завершення рядка
        }
    }
    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(88);
    }
}
