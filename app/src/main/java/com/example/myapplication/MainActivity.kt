package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.code_labs_2.fittnes.AlignYourBodyElement
import com.example.myapplication.ui.code_labs_2.fittnes.AlignYourBodyRow
import com.example.myapplication.ui.code_labs_2.fittnes.FavoriteCollectionCard
import com.example.myapplication.ui.code_labs_2.fittnes.FavoriteCollectionsGrid
import com.example.myapplication.ui.code_labs_2.fittnes.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column {
                    SearchBar()
                    AlignYourBodyRow()
                    //AlignYourBodyElementMain()
                    //FavoriteCollectionCardMain()
                    FavoriteCollectionsGrid()
                }
            }
        }
    }

    @Composable
    private fun AlignYourBodyElementMain() {
        AlignYourBodyElement(
            text = R.string.app_name,
            drawable = R.drawable.name,
            modifier = Modifier.padding(8.dp)
        )
    }

    @Composable
    private fun FavoriteCollectionCardMain() {
        FavoriteCollectionCard(
            text = R.string.app_name,
            drawable = R.drawable.name,
            modifier = Modifier.padding(8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
    }
}