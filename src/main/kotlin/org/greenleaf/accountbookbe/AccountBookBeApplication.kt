package org.greenleaf.accountbookbe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccountBookBeApplication

fun main(args: Array<String>) {
	runApplication<AccountBookBeApplication>(*args)
}
