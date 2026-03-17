package create.develop.planetsdemo.data.sealedapproach

import create.develop.planetsdemo.data.Planet


sealed interface SealedPlanetsUIState {
    val listOfPlanets: List<Planet>
}

