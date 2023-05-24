package com.example.wordleripoff

import org.json.JSONArray
import java.io.BufferedReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.random.Random
import kotlin.system.exitProcess

class WordApiClient {
    companion object {
        //reads words from api and puts them into a an array list called wordList
        fun getWordList(): ArrayList<String> {
            val wordList = ArrayList<String>()

            try {
                val url = URL("https://wordapidata.000webhostapp.com/?getnamesenglish")
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.connectTimeout = 10000

                val inputStream = connection.inputStream
                val bufferedReader = BufferedReader(inputStream.reader())

                var line: String? = ""
                while (line != null) {
                    line = bufferedReader.readLine()
                    if (line != null) {
                        wordList.add(line)
                    }
                }

                bufferedReader.close()
                inputStream.close()
                connection.disconnect()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return wordList
        }
    }
}

class WordSetter {
    companion object {
        fun setWord(wordList: ArrayList<String>): String {
            var word = ""
            if (wordList.isNotEmpty()) {
                val randomIndex = (1..wordList.size).random() - 1 // Generate a random index between 0 and wordList.size - 1
                word = wordList[randomIndex]
            }
            return word
        }
    }
}

fun main() {
    val wordList = WordApiClient.getWordList()
    println("Word list size: ${wordList.size}")
    val word = WordSetter.setWord(wordList)
    println("Word: $word")
}

