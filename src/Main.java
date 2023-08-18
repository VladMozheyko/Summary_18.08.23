public class Main {

    public static void main(String[] args) {
	// Создадим своя реализацию строки
        char[] str = new char[13];
        // Посимвольно записываем строку
        str[0] = 'H';
        str[1] = 'e';
        str[2] = 'l';
        str[3] = 'l';
        str[4] = 'o';
        str[5] = ',';
        str[6] = ' ';
        str[7] = 'W';
        str[8] = 'o';
        str[9] = 'r';
        str[10] = 'l';
        str[11] = 'd';
        str[12] = '!';
       // Выводим строку
        System.out.println("Массив char: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

        String str1 = "Hello, World";

        System.out.println("str1: ");
        System.out.println(str1);
        System.out.println("str1 после конкатенации: ");
        str1 = str1 + "! \n Как дела?"; // Конкатенация(объединение строк)
        System.out.print(str1);
        System.out.println("StringBuilder: ");
        // Создаем мутабельный(изменяемый) объект для работы со строками
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Привет");
        System.out.println(stringBuilder);
        stringBuilder.append(" Мир");
        System.out.println(stringBuilder);

        // Создаем мутабельный(изменяемый) объект для работы со строками
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("Работаем со String: ");
        // Покажем пример работы ссылок на мутабельные и иммутабельные объекты
        // String иммутабельный(неизменяемый) класс, его объект нельзя изменить. На данный момент обе переменные str2 и str3 указывают
        // указывают на одну запись в пуле строк
        String str2 = "Привет";  // На данный момент str2 = str3. TODO Замените str3 = "Привет" на str3 = str2 и проверьте реузльтат
        String str3 = "Привет"; // На данный момент str2 и str3 указывают на одну область(имеют одинаковые ссылки)
        // Выведем на консоль обе переменные
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("Переменные после мутации: ");
        // Изменим значение str2. Теперь в str2 ссылка на другую запись в пуле строк, но это не касается переменной str3
        str2 = "Пока"; // Теперь в str2 и str3 разные ссылки. Так получается потому, что мы перезаписали ссылку когда создавали новое знаечние. Это особеность String. Он является иммутабельным классом
        // Выведем на консоль обе переменные
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("Работаем со StringBuilder: ");
        // Пример работы с мутабельными(способным изменяться) классами
        StringBuilder stringBuilder1 = new StringBuilder("Привет!");
        StringBuilder stringBuilder2 = stringBuilder1; // Теперь также запишем одну ссылку в разные переменные
        //Выведем обе переменные на консоль
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        // Изменим значение stringBuilder1
        stringBuilder1.append(" Как дела?");
        //Выведем обе переменные на консоль
        System.out.println("Переменные после мутации: ");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        // Массивы тоже могут менять свои значения. Логика работы ссылок у них будет такая же как и для StringBuilder
        // Создадим 2 массива(переменных - ссылки) на одну область памяти. Дубликатные ссылки.
        int[] arr1 = new int[5];
        int[] arr2 = arr1; // arr1 и arr2 указывают на одну область памяти, а значит они будут влиять друг на друга

        // Заполнияем массив через arr1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        // Выведем его через arr1 и arr2
        System.out.println("arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // Изменим массив через arr1:
        arr1[2] = 15;
        System.out.println("Изменили arr1:");

        // Выведем его через arr1 и arr2
        System.out.println("arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // Выше показан уровень понимания платформы для эффективного использования классов при программировании. В Вашей
        // текущей деятельности необходимо возвращаться к этой теории при разработки своиз прогамм(ДЗ) и вдумчиво ее анализироватьэ
        // Тем не менее многие задачи не требуют полного знания всей теории или досконального ее знания. Как решать поставленные задачи
        // Для всего ПО(классы, библиотеки и т.п.), которое мы используем есть справочники(API), в которых расписано, что
        // данное ПО делает. Просмотрев информацию о классе, можно понять как его использовать
        // Например, нужно перевернуть строку. Найдем информацию о StringBuilder и методе reverse()
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
        // Другой пример. Нужна работа с массивом типа int. Поищем информацию о массивах в Java
        int[] a = new int[5];
        System.out.println(a[3]);

        
    }
}
