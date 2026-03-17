package create.develop.planetsdemo.data.sealedapproach

interface SealedPlanetsService {
    suspend fun fetchPlanets() : List<SealedPlanetsInfoItem>
}