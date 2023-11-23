import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите количество строк для двумерного массива:")
    val rows = scanner.nextInt()

    println("Введите количество столбцов для двумерного массива:")
    val cols = scanner.nextInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите элементы для двумерного массива $rows x $cols:")

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Элемент [$i][$j]: ")
            array[i][j] = scanner.nextInt()
        }
    }

    val isSymmetric = isDiagonalSymmetric(array)

    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали.")
    } else {
        println("Массив не является симметричным относительно главной диагонали.")
    }
}

fun isDiagonalSymmetric(array: Array<IntArray>): Boolean {
    val rows = array.size
    val cols = array[0].size

    for (i in 0 until rows) {
        for (j in i + 1 until cols) {
            if (array[i][j] != array[j][i]) {
                return false
            }
        }
    }

    return true
}