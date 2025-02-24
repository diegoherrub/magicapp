package pol.rubiano.magicapp.app.domain

data class Collection(
    val id: String,
    val name: String,
    val cards: List<CollectionEntry>
)

data class CollectionEntry(
    val collectionId: String,
    val cardId: String,
    val quantity: Int,
    val isFoil: Boolean = false
)