package br.gov.etec.pw

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PwApplication

fun main(args: Array<String>) {
	runApplication<PwApplication>(*args)
}
