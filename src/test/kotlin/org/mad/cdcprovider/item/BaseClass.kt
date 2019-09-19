package org.mad.cdcprovider.item

import org.mockito.Mockito
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.Before
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.junit.runner.RunWith
import org.mad.cdcprovider.CdcproviderApplication


@RunWith(SpringRunner::class)
@SpringBootTest(classes = [CdcproviderApplication::class])
abstract class BaseClass {
    @Autowired
    lateinit var itemController: ItemController

    @MockBean
    lateinit var itemService: ItemService

    @Before
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(itemController)

        Mockito.`when`(itemService.findItemById(1))
                .thenReturn(Item(1, "fruit"))
    }
}