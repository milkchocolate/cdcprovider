package org.mad.cdcprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CdcproviderApplication

fun main(args: Array<String>) {
	runApplication<CdcproviderApplication>(*args)
}
