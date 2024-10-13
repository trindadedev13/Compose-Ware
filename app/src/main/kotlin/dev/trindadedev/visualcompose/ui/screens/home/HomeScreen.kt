package dev.trindadedev.visualcompose.ui.screens.home

import compose.icons.TablerIcons
import compose.icons.tablericons.Plus
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import dev.trindadedev.visualcompose.Strings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        topBar = { TopBar(scrollBehavior = scrollBehavior) },
        floatingActionButton = { ActionButton() },
    ) { contentPadding ->
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ActionButton() {
    ExtendedFloatingActionButton(
        onClick = {
            // todo: navController.navigate(Screen.Setting.route)
        },
        text = { Text(text = stringResource(id = Strings.label_create_project)) },
        icon = { Icon(imageVector = TablerIcons.Plus, contentDescription = null) },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        title = { Text(text = stringResource(id = Strings.app_name)) },
        scrollBehavior = scrollBehavior,
    )
}
