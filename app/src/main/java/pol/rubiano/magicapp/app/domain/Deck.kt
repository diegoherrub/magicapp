package pol.rubiano.magicapp.app.domain

data class Deck(
    val id: String,                                                         // Unique identifier for the deck
    val name: String,                                                       // User-defined name for the deck
    val format: String,                                                     // Format in which the deck is playable (e.g., "Commander", "Modern")
    val cards: List<DeckEntry>,                                             // List of cards in the deck
    val sideboard: List<DeckEntry>,                                         // List of up to 15 extra cards for swaps between matches
    val maybeBoard: List<DeckEntry>                                         // Deck composition statistics
)

data class DeckEntry(
    val deckId: String,
    val cardId: String,
    val quantity: Int
)

data class DeckStatistics(
    val totalCards: Int,                                                    // Total number of cards in the deck
    val lands: Int,                                                         // Number of land cards
    val creatures: Int,                                                     // Number of creature cards
    val spells: Int,                                                        // Number of non-creature spells
    val averageManaCost: Float,                                             // Average converted mana cost of the deck
    val colorDistribution: Map<String, Int>,                                // Count of cards by color (e.g., "W" -> 12, "B" -> 8)
    val manaCurve: Map<Int, Int>,                                           // Count of cards by mana cost (e.g., 1 -> 5, 2 -> 10)
    val manaCurveByColor: Map<String, Map<Int, Int>>,                       // Mana curve by color (e.g., "W" -> {1 -> 3, 2 -> 5})
    val manaCurveByType: Map<String, Map<Int, Int>>,                        // Mana curve by type (e.g., "Creature" -> {1 -> 4, 2 -> 6})
    val manaCurveByColorAndType: Map<String, Map<String, Map<Int, Int>>>,   // Mana curve per color and type (e.g., "W" -> {"Creature" -> {1 -> 2, 2 -> 3}})
    val landsByProducedMana: Map<String, Int>                               // Lands categorized by the amount of mana they produce (e.g., "W" -> 10, "U" -> 8)
)