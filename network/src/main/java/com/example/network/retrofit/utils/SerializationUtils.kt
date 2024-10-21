package com.example.network.retrofit.utils

import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json

/**
 * Serialization utility functions
 *
 * @author Hashim Ali
 */

/**
 * Returns an instance of [Json] with [ignoreUnknownKeys](https://kotlinlang.org/api/kotlinx.serialization/kotlinx-serialization-json/kotlinx.serialization.json/-json-builder/ignore-unknown-keys.html) set to true
 * which specifies to ignore unknown properties in the input JSON instead of throwing SerializationException
 */
val JsonWithUnknowns: Json
    get() = Json { ignoreUnknownKeys = true }

val JsonWithPretty: Json
    get() = Json {
        prettyPrint = true
    }


fun String.isValidJson(): Boolean {
    return try {
        Json.parseToJsonElement(this)
        true
    } catch (e: SerializationException) {
        false
    } catch (e: IllegalArgumentException) {
        false
    }
}