package __GROUP_NAME__

import MainView
import android.os.Bundle
import androidx.activity.compose.setContent
import com.highcapable.betterandroid.ui.component.activity.AppComponentActivity

class MainActivity : AppComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainView() }
    }
}