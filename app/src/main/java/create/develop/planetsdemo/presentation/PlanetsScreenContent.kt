package create.develop.planetsdemo.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import create.develop.planetsdemo.data.sealedapproach.SealedPlanetsInfoItem

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    listOfPlanets: List<SealedPlanetsInfoItem>
) {
    LazyColumn() {
        items(listOfPlanets.size) { count ->
            PlanetsCard(modifier, listOfPlanets, count)
        }
    }
}