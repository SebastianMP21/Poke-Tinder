package com.marquez.poke_tinder.data.database.entities

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.marquez.poke_tinder.domain.model.MyPokemon
import com.marquez.poke_tinder.domain.model.Pokemon
import java.text.FieldPosition

@Entity(tableName = "pokemon_table")
data class MyPokemonEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "idPokemon") val idPokemon: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image") val image: String,
    @ColumnInfo(name = "isLegendary") val isLegendary: Boolean = false,
    @ColumnInfo(name = "position") val position: Int = -1
)

fun MyPokemon.toDatabase() = MyPokemonEntity(id = id,
    idPokemon = idPokemon,
    name = name,
    image = image,
    isLegendary = isLegendary,
    position = position
    )