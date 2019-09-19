package org.mad.cdcprovider.item

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(private val itemService: ItemService) {
    @GetMapping("/items/{id}")
    fun getItem(@PathVariable id: Int): ResponseEntity<Item> {
        val item = itemService.findItemById(id)
        return if (item != null) {
            ResponseEntity(item, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}