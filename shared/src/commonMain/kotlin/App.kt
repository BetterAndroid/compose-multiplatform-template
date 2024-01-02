import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.highcapable.betterandroid.compose.multiplatform.systembar.PlatformSystemBars
import com.highcapable.betterandroid.compose.multiplatform.systembar.rememberSystemBarsController

@Composable
fun App() {
    MaterialTheme {
        val systemBars = rememberSystemBarsController()
        var hideOrShowBars by remember { mutableStateOf(false) }
        var greeting by remember { mutableStateOf("Hello world!") }
        Column(modifier = Modifier.safeDrawingPadding()) {
            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "__APP_NAME__",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = greeting)
                Spacer(Modifier.padding(15.dp))
                Button(onClick = { greeting = "Hello Jetpack Compose Multiplatform!" }) {
                    Text(text = "Greeting")
                }
                Spacer(Modifier.padding(15.dp))
                Button(onClick = { hideOrShowBars = !hideOrShowBars }) {
                    Text(text = "Trigger SystemBars")
                }
            }
        }
        LaunchedEffect(hideOrShowBars) {
            if (hideOrShowBars)
                systemBars.hide(PlatformSystemBars.All)
            else systemBars.show(PlatformSystemBars.All)
        }
    }
}