fun main() {

}

//Функция для задачи 1
fun countLocalMinimals(array: Array<Int>): Int {
    var count = 0
    for (i in array.indices) {
        if (i == array.size - 2) return count
        if (array[i] > array[i + 1] && array[i + 1] < array[i + 2]) count++
    }
    return count
}

//Функция для задачи 2
fun checkArrayForNegativeNumbers(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        if (array[i] < 0) array[i] += 1
    }
    return array
}

//Функция для задачи 3
fun printKRowFromMatrix(array: Array<Array<Int>>, k: Int) {
    if (k < 1 || k > array.size) return
    print("{ ")
    array[k - 1].forEach { print("$it ") }
    print("}\n")
}