fun main() {
    // 1. Работа с преобразованием строк
    val word1 = "Hello"
    val word2 = "Kotlin"
    val sentence = word1 + ", " + word2 + "!"
    println(sentence)
    // 2. Базовая арифметика и вывод результата в консоль
    val a = 10
    val b = 5
    println(a*b-a%b+a/b)

    // 3. Примеры интерполяции строк
    val k = 10
    val l = 3
    val sumMessage = "Сумма чисел $k и $l равна ${k + l}."
    println(sumMessage)

    val name = "Никита"
    val age = 20
    val message = "Меня зовут $name и мне $age лет"
    println(message)

    // 4. Преобразование типов
    // Преобразование числа в строку
    val number1 = 52
    val numberAsString = number1.toString()
    println("Число как строка: $numberAsString")

    // Преобразование строки в число
    val str = "12345"
    val strToInt = str.toInt()
    println("Строка как число: $strToInt")

    // 5. Пример условных операторов (if else)
    val x = 12
    val y = 6
    if (x > y) {
        println("x больше y")
    } else {
        println("x меньше или равно y")
    }

    // 6. Пример цикла for
    for (i in 1..3) {
        println("Номер $i")
    }

    // 6. Пример цикла while
    var i = 1
    while (i <= 4) {
        println("$i")
        i++
    }

    // 7. Пример создания отдельной функции
    val array = intArrayOf(1, 2, 3, 4, 5)
    printArray(array)

    // 8. Пример работы с массивом
    val fruits = arrayOf("Клубника", "Ананас", "Мандарин")
    for (fruit in fruits) {
        println(fruit)
    }
}

// Отдельная функция для печати массива
fun printArray(array: IntArray) {
    for (element in array) {
        println(element)
    }
}