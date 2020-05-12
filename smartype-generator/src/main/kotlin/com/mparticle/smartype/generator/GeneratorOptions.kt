package com.mparticle.smartype.generator

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonLiteral
import kotlinx.serialization.json.JsonObject

/**
 * A Smartype configuration file
 *
 * @param iosOptions The options for generating an iOS-compatible library, default disabled
 * @param androidOptions The options for generating an Android-compatible library, default disabled
 * @param binaryOutputDirectory The parent directory to place generated Smartype libraries, default "smartype-dist"
 * @param apiSchemaFile The file containing the JSON schema of the intended API
 */
@Serializable
data class GeneratorOptions(var iosOptions: IOSOptions = IOSOptions(false),
                            var androidOptions: AndroidOptions = AndroidOptions(false),
                            var binaryOutputDirectory: String = "smartype-dist",
                            var apiSchemaFile: String
)

@Serializable
data class AndroidOptions(var enabled: Boolean)

@Serializable
data class IOSOptions(var enabled: Boolean)
