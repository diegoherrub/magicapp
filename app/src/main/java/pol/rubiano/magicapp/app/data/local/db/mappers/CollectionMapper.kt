package pol.rubiano.magicapp.app.data.local.db.mappers

import pol.rubiano.magicapp.app.data.local.entities.CollectionEntity
import pol.rubiano.magicapp.app.data.local.entities.CollectionEntryEntity
import pol.rubiano.magicapp.app.domain.CollectionEntry
import pol.rubiano.magicapp.app.domain.Collection

fun CollectionEntity.toDomain(): Collection {
    return Collection(
        this.id,
        this.name,
        this.cards
    )
}

fun Collection.toEntity(): CollectionEntity {
    return CollectionEntity(
        this.id,
        this.name,
        this.cards
    )
}

fun CollectionEntryEntity.toDomain(): CollectionEntry {
    return CollectionEntry(
        this.collectionId,
        this.cardId,
        this.quantity,
        this.isFoil
    )
}

fun CollectionEntry.toEntity(): CollectionEntryEntity {
    return CollectionEntryEntity(
        this.collectionId,
        this.cardId,
        this.quantity,
        this.isFoil
    )
}
