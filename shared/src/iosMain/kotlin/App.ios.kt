@file:Suppress("unused")

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.ComposeUIViewController

fun createUIViewController() = ComposeUIViewController { MainView() }

@Composable
fun MainView() = App()