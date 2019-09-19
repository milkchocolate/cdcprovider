package org.mad.cdcprovider.item

import org.springframework.stereotype.Service

@Service
class ItemService {
    private val items: List<Item> = listOf(
            Item(1, "fruit"),
            Item(2, "plane"),
            Item(3, "animal")
    )

    fun findItemById(id: Int): Item? {
        return items.find { it.id == id }
    }
}