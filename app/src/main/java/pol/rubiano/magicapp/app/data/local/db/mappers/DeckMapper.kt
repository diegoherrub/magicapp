package pol.rubiano.magicapp.app.data.local.db.mappers

import pol.rubiano.magicapp.app.data.local.entities.DeckEntity
import pol.rubiano.magicapp.app.data.local.entities.DeckEntryEntity
import pol.rubiano.magicapp.app.domain.Deck
import pol.rubiano.magicapp.app.domain.DeckEntry

fun DeckEntity.toDomain(): Deck {
    return Deck(
        this.id,
        this.name,
        this.format,
        this.cards,
        this.sideboard,
        this.maybeBoard
    )
}

fun Deck.toEntity(): DeckEntity {
    return DeckEntity(
        this.id,
        this.name,
        this.format,
        this.cards,
        this.sideboard,
        this.maybeBoard
    )
}

fun DeckEntryEntity.toDomain(): DeckEntry {
    return DeckEntry(
        this.deckId,
        this.cardId,
        this.quantity
    )
}

fun DeckEntry.toEntity(): DeckEntryEntity {
    return DeckEntryEntity(
        this.deckId,
        this.cardId,
        this.quantity
    )
}