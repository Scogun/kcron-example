import com.ucasoft.kcron.Cron

fun main() {
    Cron.parseAndBuild("* 12 ? * *").expression
}