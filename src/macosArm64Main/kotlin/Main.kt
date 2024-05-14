import com.ucasoft.kcron.Cron

fun main() {
    println(Cron.parseAndBuild("* 12 ? * *").expression)
}