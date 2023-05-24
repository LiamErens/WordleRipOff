package com.example.wordleripoff

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring variables

        var answer = false
        var userWord = ""

        /*val wordApi = WordApiClient()
        WordApiClient.getWordList()
        val wordList = WordApiClient.getWordList()
        val word = WordSetter.setWord(wordList)*/

        val word = "WORDL"
        Toast.makeText(this, "the word is" + word, Toast.LENGTH_SHORT).show()



        var txtBlock1: EditText = findViewById(R.id.txtBlock1)
        var txtBlock2: EditText = findViewById(R.id.txtBlock2)
        var txtBlock3: EditText = findViewById(R.id.txtBlock3)
        var txtBlock4: EditText = findViewById(R.id.txtBlock4)
        var txtBlock5: EditText = findViewById(R.id.txtBlock5)

        var txtBlock21: EditText = findViewById(R.id.txtBlock21)
        var txtBlock22: EditText = findViewById(R.id.txtBlock22)
        var txtBlock23: EditText = findViewById(R.id.txtBlock23)
        var txtBlock24: EditText = findViewById(R.id.txtBlock24)
        var txtBlock25: EditText = findViewById(R.id.txtBlock25)

        var txtBlock31: EditText = findViewById(R.id.txtBlock31)
        var txtBlock32: EditText = findViewById(R.id.txtBlock32)
        var txtBlock33: EditText = findViewById(R.id.txtBlock33)
        var txtBlock34: EditText = findViewById(R.id.txtBlock34)
        var txtBlock35: EditText = findViewById(R.id.txtBlock35)

        var txtBlock41: EditText = findViewById(R.id.txtBlock41)
        var txtBlock42: EditText = findViewById(R.id.txtBlock42)
        var txtBlock43: EditText = findViewById(R.id.txtBlock43)
        var txtBlock44: EditText = findViewById(R.id.txtBlock44)
        var txtBlock45: EditText = findViewById(R.id.txtBlock45)

        var txtBlock51: EditText = findViewById(R.id.txtBlock51)
        var txtBlock52: EditText = findViewById(R.id.txtBlock52)
        var txtBlock53: EditText = findViewById(R.id.txtBlock53)
        var txtBlock54: EditText = findViewById(R.id.txtBlock54)
        var txtBlock55: EditText = findViewById(R.id.txtBlock55)






        fun checkWord(userWord: String, word: String, txtBlock: List<EditText>) {
            for (i in word.indices) {
                if (userWord[i] == word[i]) {
                    txtBlock[i].background.setTint(Color.GREEN)
                    txtBlock[i].setPadding(3, 3, 3, 3)
                } else if (word.contains(userWord[i].toString())) {
                    txtBlock[i].background.setTint(Color.YELLOW)
                    txtBlock[i].setPadding(3, 3, 3, 3)
                } else {
                    txtBlock[i].background.setTint(Color.LTGRAY)
                    txtBlock[i].setPadding(3, 3, 3, 3)
                }
            }
            if (userWord == word) {
                answer = true
            } else {
                txtBlock[0].isEnabled = false
                txtBlock[1].isEnabled = false
                txtBlock[2].isEnabled = false
                txtBlock[3].isEnabled = false
                txtBlock[4].isEnabled = false
                txtBlock[5].isEnabled = true
                txtBlock[6].isEnabled = true
                txtBlock[7].isEnabled = true
                txtBlock[8].isEnabled = true
                txtBlock[9].isEnabled = true
                txtBlock[5].requestFocus()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        var btnLine1: Button = findViewById(R.id.btnLine1)
        btnLine1.setOnClickListener()
        {
            userWord = txtBlock1.text.toString() + txtBlock2.text.toString() + txtBlock3.text.toString() + txtBlock4.text.toString() + txtBlock5.text.toString()


            val txtBlocks = listOf(txtBlock1, txtBlock2, txtBlock3, txtBlock4, txtBlock5, txtBlock21, txtBlock22, txtBlock23, txtBlock24, txtBlock25)
            checkWord(userWord, word, txtBlocks)
            if (answer) {
                Toast.makeText(this, "Wow!! You got it correct on your first try!", Toast.LENGTH_SHORT).show()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        var btnLine2: Button = findViewById(R.id.btnLine2)
        btnLine2.setOnClickListener()
        {
            userWord = txtBlock21.text.toString() + txtBlock22.text.toString() + txtBlock23.text.toString() + txtBlock24.text.toString() + txtBlock25.text.toString()


            val txtBlocks = listOf(txtBlock21, txtBlock22, txtBlock23, txtBlock24, txtBlock25, txtBlock31, txtBlock32, txtBlock33, txtBlock34, txtBlock35)
            checkWord(userWord, word, txtBlocks)
            if (answer) {
                Toast.makeText(this, "Not too shabby! Correct on your 2nd try!", Toast.LENGTH_SHORT).show()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        var btnLine3: Button = findViewById(R.id.btnLine3)
        btnLine3.setOnClickListener()
        {
            userWord = txtBlock31.text.toString() + txtBlock32.text.toString() + txtBlock33.text.toString() + txtBlock34.text.toString() + txtBlock35.text.toString()


            val txtBlocks = listOf(txtBlock31, txtBlock32, txtBlock33, txtBlock34, txtBlock35,txtBlock41, txtBlock42, txtBlock43, txtBlock44, txtBlock45)
            checkWord(userWord, word, txtBlocks)
            if (answer) {
                Toast.makeText(this, "Nice!! got it on your third try!", Toast.LENGTH_SHORT).show()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        var btnLine4: Button = findViewById(R.id.btnLine4)
        btnLine4.setOnClickListener()
        {
            userWord = txtBlock41.text.toString() + txtBlock42.text.toString() + txtBlock43.text.toString() + txtBlock44.text.toString() + txtBlock45.text.toString()


            val txtBlocks = listOf(txtBlock41, txtBlock42, txtBlock43, txtBlock44, txtBlock45,txtBlock51, txtBlock52, txtBlock53, txtBlock54, txtBlock55)
            checkWord(userWord, word, txtBlocks)
            if (answer) {
                Toast.makeText(this, "Damn! 4th try, that was a close one!", Toast.LENGTH_SHORT).show()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------

        var btnLine5: Button = findViewById(R.id.btnLine5)
        btnLine5.setOnClickListener()
        {
            userWord = txtBlock51.text.toString() + txtBlock52.text.toString() + txtBlock53.text.toString() + txtBlock54.text.toString() + txtBlock55.text.toString()


            val txtBlocks = listOf(txtBlock51, txtBlock52, txtBlock53, txtBlock54, txtBlock55, txtBlock51, txtBlock52, txtBlock53, txtBlock54, txtBlock55)
            checkWord(userWord, word, txtBlocks)
            if (answer) {
                Toast.makeText(this, "Phew!! 5th attempt, cutting it fine!", Toast.LENGTH_SHORT).show()
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------


    }
}