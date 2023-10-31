import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "__APP_NAME__",
        state = rememberWindowState(width = 550.dp, height = 450.dp)
    ) { MainView() }
}