@file:Suppress("unused")

import androidx.compose.runtime.Composable
import com.highcapable.betterandroid.compose.multiplatform.platform.AppComponentUIViewController

fun createUIViewController() = AppComponentUIViewController { MainView() }

@Composable
fun MainView() = App()