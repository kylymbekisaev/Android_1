import java.lang.IllegalArgumentException
import java.util.Scanner

fun main(args: Array<String>) {
    val defaultUser = User("kylymbek","kylymbek@gmail.com",19,123456789)

    val scanner = Scanner(System.`in`)
    print("Введите имя пользователя: ")
    val userName = scanner.nextLine()
    print("Введите email: ")
    val email = scanner.nextLine()
    print("Введите возраст: ")
    val age = scanner.nextInt()
    print("Введите пароль: ")
    val  password = scanner.nextInt()

    val userIntputUser = User(userName,email,age,password)

    try {
        userIntputUser.verify(defaultUser)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

}