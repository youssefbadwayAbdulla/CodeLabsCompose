package com.example.myapplication.ui.code_labs_state.states

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.code_labs_state.states.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()
        val list = remember { wellnessViewModel.tasks }
        WellnessTasksList(
            list = list,
            onCheckedTask = { taskChecked ,checked-> wellnessViewModel.changeTaskChecked(taskChecked,checked) },
            onCloseTask = { task -> wellnessViewModel.remove(task) }
        )

    }
}

