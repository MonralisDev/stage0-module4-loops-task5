package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {  // Проходимо по рядках
            for (int j = 1; j <= i; j++) {  // Проходимо по стовпцях (від 1 до i)
                if (j == 1 || j == i || i == cathetusLength) {
                    System.out.print("8");  // Малюємо контур трикутника
                } else {
                    System.out.print(" ");  // Усередині малюємо пробіли
                }
            }
            System.out.println();  // Переходимо на новий рядок
        }
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(10);
    }
}
