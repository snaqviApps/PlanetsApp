package create.develop.planetsdemo.data.sealedapproach

import kotlinx.serialization.Serializable

@Serializable
data class SealedPlanetsInfoItem(
    val position : String,
    val  name : String,
    val velocity : String,
    val distance : String,
    val image : String,
    val description : String
)