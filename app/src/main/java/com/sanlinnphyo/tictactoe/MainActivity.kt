package com.sanlinnphyo.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val winConditions = arrayOf(arrayOf(0,1,2), arrayOf(3,4,5), arrayOf(6,7,8), arrayOf(0,3,6), arrayOf(1,4,7), arrayOf(2,5,8), arrayOf(0,4,8), arrayOf(2,4,6))
    private var selectedIndexes = arrayOf("", "", "", "", "", "", "", "", "")
    private var currentPlayer = "X"

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView
    private lateinit var textView8: TextView
    private lateinit var textView9: TextView
    private lateinit var textViewCurrentPlayer: TextView
    private lateinit var buttonRestart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textView_1)
        textView2 = findViewById(R.id.textView_2)
        textView3 = findViewById(R.id.textView_3)
        textView4 = findViewById(R.id.textView_4)
        textView5 = findViewById(R.id.textView_5)
        textView6 = findViewById(R.id.textView_6)
        textView7 = findViewById(R.id.textView_7)
        textView8 = findViewById(R.id.textView_8)
        textView9 = findViewById(R.id.textView_9)
        textViewCurrentPlayer = findViewById(R.id.textView_currentPlayer)
        buttonRestart = findViewById(R.id.button_restart)

        textViewCurrentPlayer.text = "${currentPlayer}'s turn"

        textView1.setOnClickListener{
            if(!isSelected(0)){
                textView1.text = currentPlayer
                // mark as selected
                selectedIndexes[0] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView2.setOnClickListener{
            if(!isSelected(1)){
                textView2.text = currentPlayer
                // mark as selected
                selectedIndexes[1] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView3.setOnClickListener{
            if(!isSelected(2)){
                textView3.text = currentPlayer
                // mark as selected
                selectedIndexes[2] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView4.setOnClickListener{
            if(!isSelected(3)){
                textView4.text = currentPlayer
                // mark as selected
                selectedIndexes[3] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView5.setOnClickListener{
            if(!isSelected(4)){
                textView5.text = currentPlayer
                // mark as selected
                selectedIndexes[4] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView6.setOnClickListener{
            if(!isSelected(5)){
                textView6.text = currentPlayer
                // mark as selected
                selectedIndexes[5] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView7.setOnClickListener{
            if(!isSelected(6)){
                textView7.text = currentPlayer
                // mark as selected
                selectedIndexes[6] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView8.setOnClickListener{
            if(!isSelected(7)){
                textView8.text = currentPlayer
                // mark as selected
                selectedIndexes[7] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }
        textView9.setOnClickListener{
            if(!isSelected(8)){
                textView9.text = currentPlayer
                // mark as selected
                selectedIndexes[8] = currentPlayer
                // update current player
                currentPlayer = if(currentPlayer == "X") "O" else "X"
                textViewCurrentPlayer.text = "${currentPlayer}'s turn"
                // check whether there is winner
                checkWinner()
            }
        }

        buttonRestart.setOnClickListener{
            restartGame()
        }
    }

    private fun isSelected(index : Int) : Boolean {
        return selectedIndexes[index] != ""
    }

    private fun checkWinner(){
        var hasWinner = false
        var winner = ""
        for(condition in winConditions){
            val cellA = selectedIndexes[condition[0]]
            val cellB = selectedIndexes[condition[1]]
            val cellC = selectedIndexes[condition[2]]

            if(cellA != "" && cellB != "" && cellC != "" && cellA == cellB && cellA == cellC){
                hasWinner = true
                winner = cellA
                break
            }
        }
        if(hasWinner || !selectedIndexes.contains("")){
            textView1.isEnabled = false
            textView2.isEnabled = false
            textView3.isEnabled = false
            textView4.isEnabled = false
            textView5.isEnabled = false
            textView6.isEnabled = false
            textView7.isEnabled = false
            textView8.isEnabled = false
            textView9.isEnabled = false
        }

        if(hasWinner){
            textViewCurrentPlayer.text = "$winner won"
        }else if(!selectedIndexes.contains("")){
            textViewCurrentPlayer.text = "Draw"
        }
    }

    private fun restartGame() {
        textView1.isEnabled = true
        textView2.isEnabled = true
        textView3.isEnabled = true
        textView4.isEnabled = true
        textView5.isEnabled = true
        textView6.isEnabled = true
        textView7.isEnabled = true
        textView8.isEnabled = true
        textView9.isEnabled = true

        textView1.text = ""
        textView2.text = ""
        textView3.text = ""
        textView4.text = ""
        textView5.text = ""
        textView6.text = ""
        textView7.text = ""
        textView8.text = ""
        textView9.text = ""

        selectedIndexes = arrayOf("", "", "", "", "", "", "", "", "")

        currentPlayer = "X"
        textViewCurrentPlayer.text = "$currentPlayer's turn"
    }
}