public class lab3 {
    //Завдання 3. Створити програму визначення та виводу у консоль значення
    // з кількістю цифр у випадково згенерованому числі з проміжку [0; 101).
    public static void main(String[] args) {
        //Генерація випадкового натуральна числа з проміжку [0; 101)
        int RandomNumber = (int) (Math.random() * 101);
        //Вивід числа у консоль
        System.out.println("Натуральне число з проміжку [0; 101): "+RandomNumber);
        //Визначення кількості цифр згенерованого числа
        int digitsCount = (int) (Math.log10(RandomNumber) + 1);
        //Вивід кількості цифр у згенерованому числі
        System.out.println("Кількість цифр у згенерованому числі: " + digitsCount);

    }
}
