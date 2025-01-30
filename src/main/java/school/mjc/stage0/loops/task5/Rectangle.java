package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 0; i < height; i++) {  // Проходимо по рядках
            for (int j = 0; j < length; j++) {  // Проходимо по стовпцях
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1) {
                    System.out.print("8"); // Малюємо краї прямокутника
                } else {
                    System.out.print(" "); // Всередині малюємо пробіли
                }
            }
            System.out.println(); // Переходимо на новий рядок
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printRectangleFrom8s(6, 3);
    }

}
