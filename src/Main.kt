fun main() {
    val age = 30
    val temperature = 20.0
    val result = shok(age, temperature)
    println(result)

    println(shok(25,20.0))
    println(shok(35, -15.0))
    println(shok(60,30.8))
    println(shok(5,-5.9))
    println(shok(17,4.0))
}

fun shok (age: Int, temperature: Double): String {
    // Здесь можно написать код для определения рекомендации
    // в зависимости от возраста и температуры
    // Например:
    return if (age in 20..45 && temperature in -20.0..30.0) {
        "Можно идти гулять"
    } else if (age < 20 && temperature in 0.0..28.0) {
        "Можно идти гулять"
    } else if (age > 45 && temperature in -10.0..25.0) {
        "Можно идти гулять"
    } else {
        "Оставайтесь дома"
    }




}