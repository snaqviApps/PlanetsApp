package create.develop.planetsdemo.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import create.develop.planetsdemo.data.Planet

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    listOfPlanets: List<Planet>
) {
    LazyColumn() {
        items(listOfPlanets.size) { count ->
            PlanetsCard(modifier, listOfPlanets, count)
        }
    }
}