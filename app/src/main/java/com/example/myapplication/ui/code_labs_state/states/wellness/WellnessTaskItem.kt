package com.example.myapplication.ui.code_labs_state.states.wellness

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.surface,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(1.dp, color = MaterialTheme.colorScheme.surfaceVariant)
    ) {

        Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = taskName,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            )
            Checkbox(checked = checked, onCheckedChange = onCheckedChange)
            IconButton(onClick = onClose) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = null)
            }
        }
    }
}

@Composable
@Preview
fun WellnessTaskItemPreview() {
    WellnessTaskItem(
        taskName = "jkasdasjkdasjk",
        checked = true,
        onCheckedChange = {},
        onClose = {}
    )
}
