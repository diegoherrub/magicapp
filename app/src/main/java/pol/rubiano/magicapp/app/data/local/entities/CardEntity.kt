package pol.rubiano.magicapp.app.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import pol.rubiano.magicapp.app.data.local.db.converters.StringListConverter
import java.util.Date

const val CARD_TABLE = "cards"
const val CARD_ID = "id"

@Entity(tableName = CARD_TABLE)
@TypeConverters(StringListConverter::class)
data class CardEntity(

    // Information about the card's core
    @PrimaryKey @ColumnInfo(name = CARD_ID) val id: String,
    @ColumnInfo(name = "oracle_id") val oracleId: String?,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type_line") val typeLine: String?,
    @ColumnInfo(name = "rarity") val rarity: String,
    @ColumnInfo(name = "oracle_text") val oracleText: String?,
    @ColumnInfo(name = "loyalty") val loyalty: String?,
    @ColumnInfo(name = "power") val power: String?,
    @ColumnInfo(name = "toughness") val toughness: String?,
    @ColumnInfo(name = "art_crop") val artCrop: String?,
    @ColumnInfo(name = "border_crop") val borderCrop: String?,
    @ColumnInfo(name = "released_at") val releasedAt: Date?,

    // Information about the card's set
    @ColumnInfo(name = "set") val set: String,
    @ColumnInfo(name = "set_name") val setName: String,
    @ColumnInfo(name = "set_type") val setType: String,
    @ColumnInfo(name = "collector_number") val collectorNumber: String,

    // Information about the card's mana cost
    @ColumnInfo(name = "cmc") val cmc: Double?,
    @ColumnInfo(name = "manaCost") val manaCost: String?,
    @ColumnInfo(name = "producedMana") val producedMana: List<String>?,

    // Information about card with two faces
    @ColumnInfo(name = "face_name") val faceName: String,
    @ColumnInfo(name = "face_type_line") val faceTypeLine: String?,
    @ColumnInfo(name = "face_oracle_text") val faceOracleText: String?,
    @ColumnInfo(name = "face_power") val facePower: String?,
    @ColumnInfo(name = "face_toughness") val faceToughness: String?,
    @ColumnInfo(name = "face_loyalty") val faceLoyalty: String?,
    @ColumnInfo(name = "face_artist") val faceArtist: String?,
    @ColumnInfo(name = "face_art_crop") val faceArtCrop: String?,
    @ColumnInfo(name = "face_border_crop") val faceBorderCrop: String?,
    @ColumnInfo(name = "face_cmc") val faceCmc: Double?,
    @ColumnInfo(name = "face_mana_cost") val faceManaCost: String?,
    @ColumnInfo(name = "face_produced_mana") val faceProducedMana: List<String>?,

    // Legalities in different formats
    @ColumnInfo(name = "standard") val standard: String,
    @ColumnInfo(name = "future") val future: String,
    @ColumnInfo(name = "historic") val historic: String,
    @ColumnInfo(name = "timeless") val timeless: String,
    @ColumnInfo(name = "gladiator") val gladiator: String,
    @ColumnInfo(name = "pioneer") val pioneer: String,
    @ColumnInfo(name = "explorer") val explorer: String,
    @ColumnInfo(name = "modern") val modern: String,
    @ColumnInfo(name = "legacy") val legacy: String,
    @ColumnInfo(name = "pauper") val pauper: String,
    @ColumnInfo(name = "vintage") val vintage: String,
    @ColumnInfo(name = "penny") val penny: String,
    @ColumnInfo(name = "commander") val commander: String,
    @ColumnInfo(name = "oathbreaker") val oathbreaker: String,
    @ColumnInfo(name = "standardbrawl") val standardBrawl: String,
    @ColumnInfo(name = "brawl") val brawl: String,
    @ColumnInfo(name = "alchemy") val alchemy: String,
    @ColumnInfo(name = "paupercommander") val pauperCommander: String,
    @ColumnInfo(name = "duel") val duel: String,
    @ColumnInfo(name = "oldschool") val oldschool: String,
    @ColumnInfo(name = "premodern") val premodern: String,
    @ColumnInfo(name = "predh") val predh: String
)