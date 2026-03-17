package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.sealedapproach.SealedPlanetsInfoItem

interface PlanetsService {
    suspend fun fetchPlanets() : List<SealedPlanetsInfoItem>
}
