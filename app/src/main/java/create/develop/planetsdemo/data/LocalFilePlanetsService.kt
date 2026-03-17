package create.develop.planetsdemo.data

import android.content.Context

import create.develop.planetsdemo.data.sealedapproach.SealedPlanetsInfoItem
import create.develop.planetsdemo.domain.PlanetsService
import kotlinx.serialization.json.Json

class LocalFilePlanetsService(
    private val context: Context
) : PlanetsService {
    override suspend fun fetchPlanets(): List<SealedPlanetsInfoItem> {
        val result = context.resources.assets.open("planets.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString<List<SealedPlanetsInfoItem>>(result)
    }
}