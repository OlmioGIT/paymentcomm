package ru.netology


fun main() {
    val amount = 100000
    val commission = amount * 0.0075
    val cent = commission % 100
    val rub: Int = (commission / 100).toInt()
    if (commission<=3500)
        print("Комиссия составит 35 рублей.")
    else
        println("Комиссия составит $rub рублей $cent копеек.")
}