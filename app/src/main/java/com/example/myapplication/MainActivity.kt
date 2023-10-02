package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.code_labs_2.fittnes.HomeScreen
import com.example.myapplication.ui.code_labs_2.navigation.SootheBottomNavigation
import com.example.myapplication.ui.code_labs_2.navigation.SootheNavigationRail
import com.example.myapplication.ui.code_labs_state.states.HelloContent
import com.example.myapplication.ui.code_labs_state.states.wellness.WellnessScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                /* val windowSizeClass = calculateWindowSizeClass(this)
                 MySootheApp(windowSizeClass)*/
                //TwoButtonScreen()
               // WellnessScreen()
                HelloContent()
            }
        }
    }

    @Composable
    fun MySootheApp(windowSize: WindowSizeClass) {
        when (windowSize.widthSizeClass) {
            WindowWidthSizeClass.Compact -> {
                MySootheAppPortrait()
            }

            WindowWidthSizeClass.Expanded -> {
                MySootheAppLandscape()
            }
        }
    }

    @Composable
    fun MySootheAppPortrait() {
        MyApplicationTheme {
            Scaffold(
                bottomBar = { SootheBottomNavigation() }
            ) {
                HomeScreen(modifier = Modifier.padding(it))
            }
        }
    }

    @Composable
    fun MySootheAppLandscape() {
        MyApplicationTheme {
            Surface(color = MaterialTheme.colorScheme.background) {
                Row {
                    SootheNavigationRail()
                    HomeScreen()
                }
            }
        }
    }


}


