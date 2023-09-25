package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.example.myapplication.ui.code_labs_2.fittnes.HomeSection
import com.example.myapplication.ui.code_labs_2.fittnes.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                HomeScreen()
            }
        }
    }

    @Composable
    private fun HomeScreen(modifier: Modifier = Modifier) {
        Column(modifier = modifier) {
            Spacer(modifier = Modifier.height(16.dp))
            SearchBar()
            HomeSection(title = R.string.align_your_body) {
                AlignYourBodyRow()
            }
            HomeSection(title = R.string.favorite_collections) {
                FavoriteCollectionsGrid()
            }
            Spacer(Modifier.height(16.dp))


        }

    }
}
