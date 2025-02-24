package pol.rubiano.magicapp.app.domain

import java.util.Date

data class Card(

    // Information about the card's core
    val id: String,                                 // Unique identifier of the card in Scryfall
    val oracleId: String?,                          // Identifier shared across all printings of this card
    val name: String,                               // Name of the card
    val typeLine: String?,                          // Card type line (e.g., "Creature — Angel")
    val rarity: String,                             // Card rarity (e.g., "common", "rare", "mythic")
    val oracleText: String?,                        // Oracle text describing the card's effect
    val loyalty: String?,                           // Loyalty points for Planeswalkers, null otherwise
    val power: String?,                             // Power of the creature (e.g., "4"), null if not a creature
    val toughness: String?,                         // Toughness of the creature (e.g., "4"), null if not a creature
    val artCrop: String?,                           // Imagen artística específica de esta cara
    val borderCrop: String?,                        // Imagen con bordes específica de esta cara
    val releasedAt: Date?,                          // Release date of the card

    // Information about the card's set
    val set: String,                                // Set code (e.g., "VMA" for Vintage Masters)
    val setName: String,                            // Full name of the set (e.g., "Vintage Masters")
    val setType: String,                            // Type of set (e.g., "core", "masters", "expansion")
    val collectorNumber: String,                    // Number of the card within its set

    // Information about the card's mana cost
    val cmc: Double?,                               // Converted mana cost (numeric value of mana cost)
    val manaCost: String?,                          // Mana cost needed to cast the card (e.g., "{3}{W}{W}")
    val producedMana: List<String>?,                // Types of mana the card can produce

    // Information about card with two faces
    val faceName: String,                           // Name of this face of the card
    val faceTypeLine: String?,                       // Type line for this face (e.g., "Artifact Creature - Angel")
    val faceOracleText: String?,                    // Oracle text for this face
    val facePower: String?,                         // Power for this face, null if not a creature
    val faceToughness: String?,                     // Toughness for this face, null if not a creature
    val faceLoyalty: String?,                       // Loyalty for this face (if it's a Planeswalker)
    val faceArtist: String?,                        // Artist of this face
    val faceArtCrop: String?,                       // Imagen artística específica de esta cara
    val faceBorderCrop: String?,                    // Imagen con bordes específica de esta cara
    val faceCmc: Double?,                           // Converted mana cost (numeric value of mana cost)
    val faceManaCost: String?,                      // Mana cost needed to cast the card (e.g., "{3}{W}{W}")
    val faceProducedMana: List<String>?,            // Types of mana the card can produce

    // Legalities in different formats
    val standard: String,
    val future: String,
    val historic: String,
    val timeless: String,
    val gladiator: String,
    val pioneer: String,
    val explorer: String,
    val modern: String,
    val legacy: String,
    val pauper: String,
    val vintage: String,
    val penny: String,
    val commander: String,
    val oathbreaker: String,
    val standardBrawl: String,
    val brawl: String,
    val alchemy: String,
    val pauperCommander: String,
    val duel: String,
    val oldschool: String,
    val premodern: String,
    val predh: String
)